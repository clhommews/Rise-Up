%----Rise Up -- MATLAB Code  ----%

% Generate Musical Notes & Play In MATLAB
frequency1 = 261.63; %C4  
frequency2 = 293.66; %D4 
frequency3 = 329.63; %E4
frequency4 = 349.23; %F4 
frequency5 = 392.00; %G4 
frequency6 = 440.00; %A4
frequency7 = 493.88; %B4 
frequency8 = 523.25; %C5
fs = 44100;  % sampling frequency 

% Generate Time Vector
t = 0:1/fs:2;  % time vector 

% Generate Note Vectors
note1 = sin(2*pi*frequency1*t);
note2 = sin(2*pi*frequency2*t);
note3 = sin(2*pi*frequency3*t);
note4 = sin(2*pi*frequency4*t);
note5 = sin(2*pi*frequency5*t);
note6 = sin(2*pi*frequency6*t);
note7 = sin(2*pi*frequency7*t);
note8 = sin(2*pi*frequency8*t);

% Play the Melody 
sound( [ note1 note2 note3 note4 note5 note6 note7 note8], fs);

% Create Guitar Chords
guitar1 = (note5 + note3 + note2 + note1 );
guitar2 = (note6 + note4 + note3 + note2 );
guitar3 = (note7 + note5 + note4 + note3 );
guitar4 = (note8 + note6 + note5 + note4 );

% Play the Guitar Chords
sound( [ guitar1 guitar2 guitar3 guitar4], fs);

% Generate Harmony
harmony1 = (note1 + note3 + note5 + note7 );
harmony2 = (note2 + note4 + note6 + note8 );

% Play the Harmony
sound( [ harmony1 harmony2 ], fs);

% Generate Drumbeat
drumbeat = zeros(4*fs,1);
for i=1:2:length(drumbeat)-1
    drumbeat(i) = .2;
end

% Play the Drumbeat
sound( drumbeat, fs);

% Create a Melody With Drums
melodyDrums1 =  note1 .* drumbeat(1:length(note1));
melodyDrums2 =  note2 .* drumbeat(1:length(note2));
melodyDrums3 =  note3 .* drumbeat(1:length(note3));
melodyDrums4 =  note4 .* drumbeat(1:length(note4));
melodyDrums5 =  note5 .* drumbeat(1:length(note5));
melodyDrums6 =  note6 .* drumbeat(1:length(note6));
melodyDrums7 =  note7 .* drumbeat(1:length(note7));
melodyDrums8 =  note8 .* drumbeat(1:length(note8));

% Play the Melody With Drums
sound( [melodyDrums1 melodyDrums2 melodyDrums3 melodyDrums4 ...
    melodyDrums5 melodyDrums6 melodyDrums7 melodyDrums8 ], fs);

% Mix All Elements
mix = [melodyDrums1 melodyDrums2 melodyDrums3 melodyDrums4 ...
    melodyDrums5 melodyDrums6 melodyDrums7 melodyDrums8...
    guitar1 guitar2 guitar3 guitar4...
    harmony1 harmony2 ];

% Play the Complete Mix
sound( mix, fs);