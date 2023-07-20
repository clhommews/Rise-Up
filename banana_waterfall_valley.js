const RiseUp = () => {
    let challenge = 0;
    const challengeArray = [
        "Look ahead with your dreams, never look back",
        "Be the strength in your weakness",
        "Learn from your failures and grow",
        "Be fearless in the face of adversity",
        "Persevere and never give up",
        "Be kind and be generous",
        "Be bold and take risks",
        "Speak your truth and stand up for what you believe in",
        "Be open and willing to learn",
        "Be humble and grateful for what you have",
        "Be kind to others and help them in their journey",
        "Have faith and be strong",
        "Live your life with passion and joy",
        "Be the change you want to see",
        "Strive for excellence and never settle",
        "Value your relationships and never take them for granted",
        "Be the leader you wish you had",
        "Be courageous and never give up",
        "Believe in yourself and don’t be afraid to follow your dreams",
        "Take the time to appreciate the little things in life",
        "Show your true colors and never be ashamed of who you are",
        "Focus on solutions and always be positive",
        "Always strive to be better than you were yesterday",
        "Listen to your heart and never be afraid to follow it",
        "Cherish each moment and enjoy the journey"
    ];
    challengeArray.forEach(challenge => {
        console.log(challenge);
    });
    challenge++;
    if (challenge === 20) {
        console.log("Rise Up!");
    }
};

RiseUp();