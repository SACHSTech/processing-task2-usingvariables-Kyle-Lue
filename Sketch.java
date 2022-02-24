import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  //Creating the ground and the colour it will be 
    fill(0,154,23);
    rect(width * 0 , height * (float).75 , width * 2,height / 4);

    //Creating the sun 
    fill(247,247,73);
    ellipse(width / (float)6.15,height / (float)6.15,width / (float)4.44,height / (float)4.44);

    //Creating the house body and colour 
    fill(188,74,60);
    rect(width / (float)2.28,height / (float)2.28,width / (float)2.66,height / (float)2.66);

    //Creating the roof and colour of roof
    fill(109,114,124);
    triangle(width / (float)2.66,height / (float)2.28,width / (float)1.6,height / 4,width /(float)1.14,height / (float)2.28);

    //Creating door
    fill(186,140,99);
    rect(width / (float)1.72,height / (float)1.51,width / 10, height / (float)6.66);
    
    //Creating windows
    fill(199,227,225);
    rect(width / (float)2.1,height / 2,width / (float)13.33,height / (float)13.33);
    rect(width / (float)1.42,height / 2,width / (float)13.33,height / (float)13.33);
    line(width / (float)2.11,height / (float)1.86,width / (float)1.82,height / (float)1.86);
    line(width / (float)1.92,height / 2,width / (float)1.92,height / (float)1.73);
    line(width / (float)1.42,height / (float)1.86,width / (float)1.28,height / (float)1.86);
    line(width / (float)1.35,height / 2,width / (float)1.35,height / (float)1.74);
  }
  
  // define other methods down here.
}