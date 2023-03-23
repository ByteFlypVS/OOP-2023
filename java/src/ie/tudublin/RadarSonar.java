package ie.tudublin;

import processing.core.PApplet;

public class RadarSonar extends PApplet
{
    public void settings()
    {
        size(500, 500);
        //fullScreen();
    }

    public void setup()
    {}

    public void draw()
    {
        int cuts = 8; 

        float cX = width/2;
        float cY = height/2;
        float r = 0;

        background(0);

        // Radar base screen
        for(int i = 1; i <= 8; i++)
        {
            circle(cX, cY, i*(height/10));
            stroke(255);
            noFill();

            // Maximum radius of screen, for use below
            if(i == 8)
            {
                r = (i*(height/10))/2;
            }
        }

        // Radar grid pattern
        /*
        for(int i = 1; i <= cuts; i++)
        {
            float A = (360/cuts)*i;

            line(cX, cY, cX+r*cos(A), cY+r*sin(A));
        }
        */

        line(cX, cY, cX, cY-r);
    }
}
