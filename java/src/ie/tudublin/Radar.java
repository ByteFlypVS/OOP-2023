package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    private PApplet p;

    int bandO = 8;
    int bandX = 12;

    float shapeX;
    float shapeY;

    public Radar(float x, float y, PApplet p)
    {
        this.shapeX = (x/2)+(x/4);
        this.shapeY = y/2;
        this.p = p;
    }

    public void screen()
    {
        p.stroke(255);
        p.strokeWeight(4);
        p.circle(shapeX, shapeY, 750);
    }
}
