class ball{
  color c;
  float xPos;
  float yPos;
  float rSpeed;
  float distance;
  float acc;
  int angle=0;
  
  ball(float tempD){
    c = color(0,90);
    xPos = height/2;
    yPos = width/2;
    distance = 50;
    acc = 0.1;
    angle=0;
    distance = tempD;
  }
  
  void display(){
    smooth();
    ellipseMode(CENTER); 
    fill(c);
    noStroke();
    ellipse(xPos, yPos, 50, 50);  

  pushMatrix();
  translate(xPos, yPos);
  
  rotate (radians(angle));
  ellipse(-distance, -distance, 20, 20);
  
  rotate (radians(1.2*angle));
 
  ellipse(-distance - 30, -distance - 30, 20, 20);
  rotate (radians(random(angle, 1.5*angle)));
  
  ellipse(-distance - 50, -distance - 50, 20, 20);
  
  rotate (radians(random(-1.5*angle)));
  ellipse(-distance - 70, -distance - 70, 20, 20);
  popMatrix();

  }
  
  void itRotate(){
    angle+=1;
    
  }
  
}
