import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(300, 300);
  }

  public void setup() {
    //White Background
    background(255);

    //Green Wall
    fill(0,255,0); 
    rect(130,140,50,50);
    
    //Red Roof 
    fill(255,0,0); 
    triangle(130,140,150,120,180,140);
  }

}