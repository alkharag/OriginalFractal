import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

private boolean left = true;
private boolean right = false;
public void setup()
{
	size(800,450);
	noLoop();
	// frameRate(15);
}

public void draw()
{
	background(0);
	noFill();
	stroke(255);
	Repeat(400,225,700);
	if (keyPressed == true)
	{
		background(0);
		Repeat(400,225,700);
	}
}

public void Repeat(int x, int y, int big)
{
	stroke((int)(Math.random()*155)+50,(int)(Math.random()*155)+50,(int)(Math.random()*155)+50);
	ellipse(x,y,big,big);
	if(big > 30)
    {
		Repeat(x+(int)(Math.random()*21)-10,y,(int)(Math.random()*(big-5)));
		Repeat(x+(int)(Math.random()*21)-10,y,(int)(Math.random()*(big-5)));	
		Repeat(x,y+(int)(Math.random()*21)-10,(int)(Math.random()*(big-5)));
		Repeat(x,y+(int)(Math.random()*21)-10,(int)(Math.random()*(big-5)));
		
    }
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
