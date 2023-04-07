package ie.tudublin;

import processing.core.PApplet;

public class Radar
{
    private PApplet p;

    int bandO = 7;
    int bandX = 12;

    float shapeX;
    float shapeY;

    float lineX;
    float lineY;
    float lineR;
    float lineA;
    float lineS = 1.0f;

    public Radar(float x, float y, float a, PApplet p)
    {
        this.shapeX = (x/2)+(x/4);
        this.shapeY = y/2;
        this.lineA = a/bandX;
        this.p = p;
    }

    public void screen()
    {
        p.pushMatrix();
        
        p.translate(shapeX, shapeY);
        for(int i = 0; i < bandX; i++)
        {
            float x1 = PApplet.cos(lineA*i)*lineR;
            float y1 = PApplet.sin(lineA*i)*lineR;
            float x2 = PApplet.cos(lineA*i+PApplet.PI)*lineR;
            float y2 = PApplet.sin(lineA*i+PApplet.PI)*lineR;

            p.stroke(150);
            p.strokeWeight(1);
            p.line(x1, y1, x2, y2);
        }

        p.popMatrix();

        for(int i = 1; i <= bandO; i++)
        {
            if(i == bandO)
            {
                p.stroke(255);
                p.strokeWeight(4);
                p.circle(shapeX, shapeY, i*(p.height/10));

                lineR = i*(p.height/10)/2;
            }
            else
            {
                p.stroke(150);
                p.strokeWeight(1);
                p.circle(shapeX, shapeY, i*(p.height/10));
            }
        }
    }

    public void sweep()
    {}
}
