package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class VisualTest extends PApplet
{
    // Constructor variables
    Wavebox box1;
    Wavebox box2;
    Wavebox box3;

    Radar circle1;

    public void control()
    {}

    public void settings()
    {
        //size(500, 500);
        fullScreen();
    }

    public void setup()
    {
        frameRate(120);

        colorMode(HSB);
        background(0);
        noFill();

        // Create instances of object classes
        box1 = new Wavebox(100, 100, "Narrowband", this);
        box2 = new Wavebox(100, 400, "Broadband", this);

        circle1 = new Radar(width, height, TWO_PI, this);
    }

    public void draw()
    {
        box1.screen();
        box2.screen();

        circle1.screen();
    }
}
