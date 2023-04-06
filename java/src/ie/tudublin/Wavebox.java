package ie.tudublin;

import processing.core.PApplet;

public class Wavebox
{
    private PApplet p;

    int bandX = 4;
    int bandY = 10;
    int font = 16;

    float topX;
    float topY;
    float shapeW = 500;
    float shapeH = 200;

    float lineX;
    float lineY;
    float lineW = shapeW/bandY;
    float lineH = shapeH/bandX;

    String tag;

    // Constructor method to create a wavebox instance
    public Wavebox(float x, float y, String name, PApplet p)
    {
        this.tag = name;
        this.topX = x;
        this.topY = y;
        this.p = p;
    }

    public void screen()
    {
        // Create horizontal band lines
        for(int i = 0; i < bandX; i++)
        {
            lineY = topY+i*lineH;

            p.stroke(150);
            p.strokeWeight(1);
            p.line(topX, lineY, topX+shapeW, lineY);
        }

        // Create vertical band lines
        for(int i = 0; i < bandY; i++)
        {
            lineX = topX+i*lineW;

            p.stroke(150);
            p.strokeWeight(1);
            p.line(lineX, topY, lineX, topY+shapeH);
        }

        // Create screen border
        p.stroke(255);
        p.strokeWeight(3);
        p.rect(topX, topY, shapeW, shapeH);

        // Create display tag for visual
        p.textSize(font);
        p.text(tag, topX, topY-10);
    }
}
