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