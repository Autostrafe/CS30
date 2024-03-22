// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

let x,y;
let time = 0;
let time2 = 0;
let time3 = 0;

function setup() {
  createCanvas(windowWidth, windowHeight);
  x = width/2;
  y= height/2;
}

function draw() {
  background(40);

  let colourR = (noise(time)*255);
  let colourG = (noise(time2)*255);
  let colourB = (noise(time3)*255);

  x = noise(time)*width;
  y = noise(time + time2)*height;

  fill(colourR,colourG,colourB);
  circle(x,y,40)
  time+= 0.007;
  time2+= 0.006;
  time3= time3+ 0.000005;
}
