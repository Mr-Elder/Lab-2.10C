import java.applet.Applet;

import java.awt.*;

 

public class Lab2_10C extends Applet
{
    public void paint (Graphics page)
    {

            // Declare size constants

            final int MAX_SIZE = 300;
            final int PAGE_WIDTH = 600;
            final int PAGE_HEIGHT = 400;
            final int PAGE_MID_X = PAGE_WIDTH/2;
            final int PAGE_MID_Y = PAGE_HEIGHT/2;

            // Declare variables

            int x, y;    // x and y coordinates of upper left-corner of each shape
            int width, height; // width and height of each shape

            // Set the background color

            setBackground (Color.yellow);
            
            // Set the color for the next shape to be drawn

            page.setColor (Color.blue);

            // Assign the corner point and width and height

            x = PAGE_WIDTH/2;
            y = PAGE_HEIGHT/2;

            width = 150;
            height = 100;
            
	        page.fillRect(PAGE_MID_X-150/2, PAGE_MID_Y-50, width, height);
	        
	        page.setColor(Color.magenta);
	        page.fillRect(0,0, PAGE_MID_X-150/2, PAGE_MID_Y-50);
	        
	        page.setColor(Color.pink);
	        page.fillRect(PAGE_MID_X+75, PAGE_MID_Y+50, PAGE_WIDTH, PAGE_HEIGHT);
    
    		page.setColor(Color.green);
    		page.fillRect(0, PAGE_MID_Y+50, PAGE_MID_X-75, PAGE_HEIGHT);
    		
    		page.setColor(Color.white);
    		page.fillRect(PAGE_MID_X+75, 0, PAGE_WIDTH, PAGE_MID_Y-50);
    }

}