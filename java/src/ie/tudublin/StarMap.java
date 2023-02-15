package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet
{
	public void settings()
	{
		size(800, 800);
	}

	public void setup()
	{
		colorMode(HSB);
		background(0);
	}
	
	public void drawGrid()
	{
		int count = 10;
		float border = 50.0f;
		float gap = (width - (border * 2.0f)) / (float) count;

		for(int i = -5 ; i <= 5 ; i ++)
		{
			float x = border + (gap * (i + 5));

			stroke(210, 255, 255);
			line(x, border, x, height - border);
			line(border, x, width - border, x);

			textSize(11);
			fill(210, 255, 255);
			text(i, x, border-20);
			text(i, border-30, x);
		}
	}

	void loadStars()
	{
		Table table = loadTable("HabHYG15ly.csv", "header");

		for(TableRow r:table.rows())
		{
			Star s = new Star(r);
			stars.add(s);
		}
	}
		
	public void draw()
	{
		drawGrid();
		loadStars();
	}
}
