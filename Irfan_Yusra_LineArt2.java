//Name: Yusra Irfan
//Date: April 3, 2016
//The "Irfan_Yusra_LineArt2" class.
import java.awt.*;
import hsa.Console;

public class Irfan_Yusra_LineArt2
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int maxx = c.getWidth (); //declares variable to store the value of the width of the console
	int maxy = c.getHeight (); //declares variable to store the value of the height of the console

	c.setTextBackgroundColor (Color.BLACK);//sets the background color as black
	c.clear (); //clears the screen so the whole screen is now black

	for (int i = 0 ; i <= maxy / 5 ; i++)//border design (Straight Lines)
	{
	    c.setColor (Color.GREEN); //sets the color as green
	    c.drawLine (0, 0, maxy - (i * 5), (i * 5) - 350);//top left
	    c.drawLine (maxx, maxy, maxx - (i * 5), (i * 5) + 350);//bottom right           
	}
	
	for (int i = 0 ; i <= maxy/10 ; i++)//border design (curved)
	{
	    c.setColor (Color.RED);//sets the colour as red
	   c.drawLine ((i * 10)+200, 0, maxx, i * 10);//top right 
	    c.drawLine (0 - 15, (i * 10), i * 10, maxy);//bottom left
	}

	
	for (int i = 0 ; i <= maxy / 12 ; i++)//middle design
	{
	    c.setColour (Color.BLUE); //sets the colour as blue
	    c.drawLine ((maxx/2) + (i*6) - 100, 90, ((maxx/2) + (maxy/2) - (i*6)) - 100, 90 + (i*6)); //topright
	    c.drawLine ((maxx/2) - (i*6) + 100, 90, ((maxx/2) - (maxy/2) + (i*6))+ 100, 90 + (i*6)); //topleft
	    c.drawLine ((maxx/2) - (i*6) + 100, 390, ((maxx/2) - (maxy/2) + (i*6)) + 100, 390 - (i*6)); //bottomleft
	    c.drawLine ((maxx/2) + (i*6) - 100, 390, ((maxx/2) + (maxy/2) - (i*6)) - 100, 390 - (i*6)); //bottom right
	}
	
	 int x = maxx / 2; //creates a variable x for the starting position of the circles
	   int y = maxy / 2; //creates a variable y for the starting position of the circles
	   int width = 10; //creates a variable width of the circles
	   int length = 10; //creates a variable width of the circles
	  
	    for (int r = 0 ; r <= maxx/100 ; r++) //sets a condition of how much space the circles will take up on screen 
	   {
	       c.setColor (Color.YELLOW); //sets the colour as yellow
	       c.drawOval (x - 150, y - 18, width, length);//left circles 
	       c.drawOval (x + 150, y - 18, width, length);//right circles (everything is the same as above except the x position)
	      
	       x -= 10; //position x changes by going to the left each time the loop is repeated
	       y -= 10; //position y changes by going up each time the loop is repeated

	       width += 20; //width increases each time the loop is repeated
	       length += 20; //height increases each time the loop is repeated
	   }

	// Place your program here.  'c' is the output console
    } // main method
} // Irfan_Yusra_LineArt2 class

