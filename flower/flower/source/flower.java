import processing.core.*; 
import processing.data.*; 
import processing.opengl.*; 

import java.applet.*; 
import java.awt.Dimension; 
import java.awt.Frame; 
import java.awt.event.MouseEvent; 
import java.awt.event.KeyEvent; 
import java.awt.event.FocusEvent; 
import java.awt.Image; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class flower extends PApplet {

ball myBall;
ball myBall2;
ball myBall3;


public void setup(){
  size(500,500);
  myBall = new ball(1);
  myBall2 = new ball(10);
  myBall3 = new ball(50);
 // myball2 = new ball();
  strokeWeight(3);
  stroke(255);
}

public void draw(){
  smooth();
  fill(136,178,102,60);
  rect(0,0,height,width);

   myBall.display(); 
   myBall.itRotate();  
}

    
class ball{
  int c;
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
    acc = 0.1f;
    angle=0;
    distance = tempD;
  }
  
  public void display(){
    smooth();
    ellipseMode(CENTER); 
    fill(c);
    noStroke();
    ellipse(xPos, yPos, 50, 50);  

  pushMatrix();
  translate(xPos, yPos);
  
  rotate (radians(angle));
  ellipse(-distance, -distance, 20, 20);
  
  rotate (radians(1.2f*angle));
 
  ellipse(-distance - 30, -distance - 30, 20, 20);
  rotate (radians(random(angle, 1.5f*angle)));
  
  ellipse(-distance - 50, -distance - 50, 20, 20);
  
  rotate (radians(random(-1.5f*angle)));
  ellipse(-distance - 70, -distance - 70, 20, 20);
  popMatrix();

  }
  
  public void itRotate(){
    angle+=1;
    
  }
  
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "flower" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
