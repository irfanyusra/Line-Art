/* The "Irfan_Yusra_LineArt" class.
*Purpose: Create an image with Loop techniques learned in class
*@author Yusra Irfan
*@version:2.3 Oct 17th 2015
*Course Code: ICS2UO
*/
import java.awt.*;
import hsa.Console;

public class Irfan_Yusra_LineArt
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int maxx = c.getWidth (); //gets Max width of the console
	int maxy = c.getHeight (); //gets Max Height of the console

	c.setColor (Color.black);
	c.fillRect (0, 0, maxx, maxy); // Background

	for (int move = 0 ; move <= maxx ; move += 30) // Border
	{
	    c.setColor (Color.CYAN);
	    c.drawOval (move, 0, 10, 10); //small circles... top
	    c.drawOval (move, maxy - 10, 10, 10); // small circles.. bottom
	    c.drawOval (0, move, 10, 10); //small circles... left
	    c.drawOval (maxx - 10, move, 10, 10); //small circles... right

	    c.setColor (new Color (255, 0, 128)); // pinkish color
	    c.drawOval (move + 1, 1, 50, 50); //Big circles.. top
	    c.drawOval (move + 1, maxy - 49, 50, 50); //Big circles..bottom
	    c.drawOval (1, move + 1, 50, 50); //Big circles..left
	    c.drawOval (maxx - 49, move + 1, 50, 50); //Big circles.. right
	}
	for (int i = 14 ; i < maxy - 435 ; i++)
	{
	    c.setColor (new Color (128, 0, 255)); // purple-ish color
	    c.drawLine (50, i * 7, i * 4, maxy - 50); //bottom left line art
	}

	for (int i = 0 ; i <= maxy / 12 ; i++) // colorful line art
	{ //count clockwise blue as 1 and red as 12
	    c.setColour (Color.BLUE); //1
	    c.drawLine (maxx / 2 + i * 6 - 105, 70, maxx / 2 + maxy / 2 - i * 6 - 105, 70 + i * 7); //1

	    c.setColour (Color.GRAY); //2
	    c.drawLine (maxx / 2 + 225 - i * 2, 160 - i * 2, maxx / 2 + maxy / 2 - i * 6 - 110, 70 + i * 7); //2

	    c.setColour (Color.ORANGE); //3
	    c.drawLine (maxx / 2 + 225 - i * 2, 310 + i * 2, maxx / 2 + maxy / 2 - i * 5 - 110, 400 - i * 6); //3

	    c.setColour (Color.GREEN); //4
	    c.drawLine (maxx / 2 + i * 6 - 105, 400, maxx / 2 + maxy / 2 - i * 6 - 105, 400 - i * 7); //4

	    c.setColour (Color.YELLOW); //5
	    c.drawLine (105 + maxx / 2 - i * 6, 400, 105 + maxx / 2 - maxy / 2 + i * 6, 400 - i * 7); //5

	    c.setColour (Color.PINK); //6
	    c.drawLine (maxx / 2 - 225 + i * 2, 310 + i * 2, 110 + maxx / 2 - maxy / 2 + i * 5, 400 - i * 6); //6

	    c.setColour (Color.GRAY); //7
	    c.drawLine (maxx / 2 - 225 + i * 2, 160 - i * 2, 110 + maxx / 2 - maxy / 2 + i * 6, 70 + i * 7); //7

	    c.setColour (Color.RED); //8
	    c.drawLine (105 + maxx / 2 - i * 6, 70, 105 + maxx / 2 - maxy / 2 + i * 6, 70 + i * 7); //8

	    for (int circle = 0 ; circle < 10 ; circle++) // circles
	    {
		
	       c.setColor (new Color (196, 255, 255));
		c.drawOval (maxx / 2 - circle * 5 - 160, maxy / 2 - circle * 5 - 15, circle * 10, circle * 10); //left circle
		c.drawOval (maxx / 2 - circle * 5 + 150, maxy / 2 - circle * 5 - 15, circle * 10, circle * 10); //right circle
	    }

	}
	// Place your program here.  'c' is the output console
    } // main method
} // AssignmentQ1 class
