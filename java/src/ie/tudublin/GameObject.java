package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class GameObject
{
    PVector pos;
    float rot;
    float speed;
    PVector forward;
    PApplet p;
    int c;

    public GameObject(float x, float y, float rot, int c, PApplet p)
    {
        pos = new PVector(x, y);
        forward = new PVector(0, -1);
        speed = 5;
        this.c = c;
        this.rot = rot;
        this.p = p;
    }
}
