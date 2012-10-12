ball[] myBalls = new ball[10];


void setup(){
  size(500,500);
  for(int i=0; i<myBalls.length; i++){ 
    myBalls[i] = new ball (random(50));
  }
}

void draw(){
  smooth();
  fill(136,178,102,60);
  rect(0,0,height,width);

  for(int i=0; i<myBalls.length; i++){
  myBalls[i].display();
  myBalls[i].itRotate();
  myBalls[i].mouseClicked();
  
}
  
}


    
