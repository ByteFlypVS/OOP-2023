package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class YASC extends PApplet
{
	Ship ship;
	Ship ship1;
	
	// This array list is a generic, can only store classes
	ArrayList<Bullet> bullets = new ArrayList<Bullet>(); // <> denotes class types being passed into a data type


	public void settings()
	{
		size(500, 500);
		
	}

	public void setup() {
		ship = new Ship(width / 2, height / 2, 50, 70, this);
		ship1 = new Ship(100, 50, 80, 6, this);
		colorMode(HSB);
	}

	public void draw()
	{	background(0);
		ship.render();
		ship.move();

		ship1.render();
		ship1.move();

		for(Bullet b : bullets) // foreach() loop
		{
			b.render();
			b.move();
		}
	}
}
