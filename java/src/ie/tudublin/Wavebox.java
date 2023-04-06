package ie.tudublin;

import processing.core.PApplet;

public class Wavebox
{
    private PApplet p;

    float topX;
    float topY;
    float width = 500;
    float height = 200;

    // Constructor method to create a wavebox instance
    public Wavebox(float x, float y, PApplet p)
    {
        this.topX = x;
        this.topY = y;
        this.p = p;
    }

    public void screen()
    {
        p.stroke(255);
        p.strokeWeight(5);
        p.rect(topX, topY, width, height);
    }
}
