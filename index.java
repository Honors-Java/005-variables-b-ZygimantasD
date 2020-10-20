void setup() {
	size(500, 500);
}

//Initial declaration of the rectangles position, size, and color with random values
int randRectX = (int) random(1, 50);
int randRectY = (int) random(1, 50);
int randRectW = (int) random(50, 100);
int randRectH = (int) random(50, 100);

int randRectRed = (int) random(0, 255);
int randRectGreen = (int) random(0, 255);
int randRectBlue = (int) random(0, 255);

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

	//Constantly changing the ellipses position and color with random values
	int randEllX = (int) random(-50, 50);
	int randEllY = (int) random(-50, 50);

	int randEllRed = (int) random(0, 255);
	int randEllGreen = (int) random(0, 255);
	int randEllBlue = (int) random(0, 255);

	//Creates a rectangle and the ellipse with its own fill functions
	fill(randRectRed, randRectGreen, randRectBlue);
	rect(randRectX, randRectY, randRectW, randRectH);

	fill(randEllRed, randEllGreen, randEllBlue);
	ellipse(mouseX + randEllX, mouseY + randEllY, 10, 10);
}

//When clicked, it changes the rectangles position, size, and color with random values
void mousePressed() {
	background(255);
	randRectX = (int) random(20, 480);
	randRectY = (int) random(20, 480);
	randRectW = (int) random(50, 200);
	randRectH = (int) random(50, 200);

	randRectRed = (int) random(0, 255);
	randRectGreen = (int) random(0, 255);
	randRectBlue = (int) random(0, 255);	
}