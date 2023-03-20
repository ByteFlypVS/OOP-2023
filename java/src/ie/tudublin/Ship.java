package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Ship
{
    private PVector pos;
    private PApplet p;
    private float rot;
    private int c;
    private float size;
    private float halfSize;

    public Ship(float x, float y, float size, int c, PApplet p)
    {
        pos = new PVector(x, y);
        this.size = size;
        this.c = c;       
        this.p = p;
        halfSize = size/2;  
    }

    public PVector getPos()
    {
        return pos;
    }

    public void setPos(PVector pos)
    {
        this.pos = pos;
    }

    public float getRot()
    {
        return rot;
    }

    public void setRot(float rot)
    {
        this.rot = rot;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c)
    {
        this.c = c;
    }

    public float getSize()
    {
        return size;
    }

    public void setSize(float size)
    {
        this.size = size;
    }

    public void move()
    {
        if(p.keyPressed)
        {
            if(p.keyCode == PApplet.LEFT)
            {
                pos.x--;
            }

            if(p.keyCode == PApplet.RIGHT)
            {
                pos.x++;
            }

            if(p.keyCode == PApplet.UP)
            {
                pos.y--;
            }

            if(p.keyCode == PApplet.DOWN)
            {
                pos.y++;
            }
        }
    }

    public void render()
    {
        p.translate(pos.x, pos.y);
        p.rotate(rot);
        p.stroke(255);
        p.line(-halfSize, halfSize, 0, -halfSize);
        p.line(0, -halfSize, halfSize, halfSize);
        p.line(halfSize, halfSize, 0, 0);
        p.line(0, 0, -halfSize, halfSize);
    }
}