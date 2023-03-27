package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Bullet
{
    PVector position;
    PVector forward;
    float rotation;
    float speed;
    PApplet p;

    public Bullet(float x, float y, float rotation, PApplet p)
    {
        position = new PVector(x, y);
        forward = new PVector(0, -1);
        speed = 5;
        this.p = p;
        this.rotation = rotation;
    }
    
    void render()
    {
        p.pushMatrix();
        p.translate(position.x, position.y);
        p.rotate(rotation);
        p.line(0, -5, 0, 5);
        p.popMatrix();
    }

    void move()
    {
        forward.x = PApplet.sin(rotation);
        forward.y = PApplet.cos(rotation);

        position.add(PVector.mult(forward, speed)); // add() method is a static method

        if(position.x > p.width || position.x < 0 || position.y > p.height || position.y < 0)
        {
            ((YASC)p).bullets.remove(this);
        }
    }
}
