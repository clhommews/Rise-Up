// Constants to define the size of the canvas/window
const CANVAS_WIDTH = 400;
const CANVAS_HEIGHT = 400;

// Setup an array to store any elements that need to be drawn
const elements = [];

// Create a canvas to draw on
const canvas = document.createElement('canvas');

// Set the canvas's size based on the constants
canvas.width = CANVAS_WIDTH;
canvas.height = CANVAS_HEIGHT;

// Add the canvas to the page
document.body.appendChild(canvas);

// Get the canvas context for drawing
const ctx = canvas.getContext('2d');

// Create a text element to display the message
let textElement = {
    x: 0,
    y: canvas.height * 0.75,
    text: "RISE UP",
    size: "32px",
    font: "sans-serif",
    color: "rgba(255, 0, 0, 1)",
    alpha: 0
};

// Add the text element to the array
elements.push(textElement);

// Create a loop to animate the elements
let loop = () => {

    // Clear the canvas
    ctx.clearRect(0, 0, canvas.width, canvas.height);

    // Update each element in the array
    for (let i = 0; i < elements.length; i++) {

        // Get the current element
        let element = elements[i];

        // If the element is a text element, draw it
        if (element.text) {
            ctx.font = element.size + " " + element.font;
            ctx.fillStyle = element.color;
            ctx.globalAlpha = element.alpha;
            ctx.fillText(element.text, element.x, element.y);
        }
    }

    // Increase the alpha of the text element
    textElement.alpha += 0.01;

    // Request the next animation frame
    window.requestAnimationFrame(loop);
};

// Start the animation loop
loop();