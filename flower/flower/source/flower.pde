ball myBall;
ball myBall2;
ball myBall3;


void setup(){
  size(500,500);
  myBall = new ball(1);
  myBall2 = new ball(10);
  myBall3 = new ball(50);
 // myball2 = new ball();
  strokeWeight(3);
  stroke(255);
}

void draw(){
  smooth();
  fill(136,178,102,60);
  rect(0,0,height,width);

   myBall.display(); 
   myBall.itRotate();  
}

    
