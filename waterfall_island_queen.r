#1
#Create the original lyrics
lyrics <- c("Rise up,
            Rise up,
            'Til you break the chains that bind you
            One night,
            One fight,
            'Til we finish what we started
            Hold on,
            Hold tight
            'Cause together we'll be stronger
            We rise,
            We rise,
            Like a phoenix from the ashes")

#2
#Create a vector representing the musical notes
notes <- c("c2","d2","e2","c2","e2","f2","d2","f2","g2","e2","g2","a2","f2","a2","b2","g2","b2","c3","g2","c3","d3","a2","d3","e3","c3","e3","f3","d3","f3","g3","e3","g3","a3","f3","a3","b3","g3","b3","c4","g3")

#3
#Create a sequence for a 3/4 time signature
sequence <- c(1,2,3,1,3,4,2,4,5,3,5,6,4,6,7,5,7,8,6,8,9,7,9,10,8,10,11,9,11,12,10,12,13,11,13,14,12,14,15,13,15,16,14)

#4
#Assign each note to its corresponding lyric
map_lyrics_to_notes <- cbind(notes, lyrics)


#5
#Create a basic melody with the sequence 
melody <- c() 
for (i in 1:16) {
  melody <- c(melody, map_lyrics_to_notes[sequence[i], 1])
}

#6
#Add harmony to the melody
harmony <- c()
for (i in 1:16) {
  harmony <- c(harmony, map_lyrics_to_notes[sequence[i], 1] + 4)
}

#7
#Create a musical score
score <- cbind(lyrics, melody, harmony)

#8
#Install MIDI library
install.packages("midi")

#9
#Load MIDI library
library("midi")

#10
#Create a MIDI object
midi.obj <- midi::init()

#11
#Add tempo to the MIDI file
midi.obj <- midi::tempo(midi.obj, bpm = 100)

#12
#Create a vector of the length of each note
lengths_vect <- c(1,1,2,1,2,2,1,2,2,1,2,2,1,2,2,2)

#13
#Create a vector of velocities
vel_vect <- c(70, 70, 70, 50, 50, 50, 70, 70, 70, 50, 50, 50, 70, 70, 70, 70)

#14
#Add notes to the MIDI file
note_track <- midi::noteTrack(
  name="Rise Up",
  instrument="Acoustic Grand Piano")

for (i in 1:length(lengths_vect)) {
  note_track <- midi::noteOnWithTime(note_track, 
                                     channel="1", 
                                     pitch=score[i, 2], 
                                     velocity=vel_vect[i],
                                     t=sum(lengths_vect[1:i]))
  note_track <- midi::noteOnWithTime(note_track, 
                                     channel="1", 
                                     pitch=score[i, 3], 
                                     velocity=vel_vect[i],
                                     t=sum(lengths_vect[1:i]))
  note_track <- midi::noteOffWithTime(
    note_track, 
    channel="1", 
    pitch=score[i, 2], 
    t=sum(lengths_vect[1:(i+1)]))
  note_track <- midi::noteOffWithTime(
    note_track, 
    channel="1", 
    pitch=score[i, 3], 
    t=sum(lengths_vect[1:(i+1)])) 
}

#15
#Add note track to MIDI file
midi.obj <- midi::track(midi.obj, note_track)

#16
#Create a solo track
solo_track <- midi::noteTrack(
  name="Solo Track",
  instrument="Acoustic Grand Piano")

#17
#Create a solo instrument
for (i in 1:16) {
  solo_track <- midi::noteOnWithTime(solo_track, 
                                     channel="1", 
                                     pitch=notes[i], 
                                     velocity=60,
                                     t=sum(lengths_vect[1:i]))
  solo_track <- midi::noteOffWithTime(
    solo_track, 
    channel="1", 
    pitch=notes[i], 
    t=sum(lengths_vect[1:(i+1)]))

#18
#Add solo track to MIDI file
midi.obj <- midi::track(midi.obj, solo_track)

#19
#Save the MIDI file
midi::write.midi(midi.obj,file="Rise_Up.midi")

#20
#Create a plot of the piano roll
piano_roll <- midi::read.piano.roll(midi.obj)
plot(piano_roll, xlab="Time (beats)", ylab="MIDI Note")