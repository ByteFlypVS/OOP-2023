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

        colorMode(RGB);
        background(0);
        noFill();

        box1 = new Wavebox(100, 100, this);
        box2 = new Wavebox(100, 400, this);
    }

    public void draw()
    {}
}
