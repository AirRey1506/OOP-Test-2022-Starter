package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> Nematode = new  ArrayList<Nematode>();

	public float border;


	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(RGB);
		background(0);
		smooth();
		loadNematodes();				
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("HabHYG15ly.csv");
		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			Nematode.add(n);

		}
	}


	public void draw()
	{	
		stroke(255, 0, 255);
		textAlign(CENTER, CENTER);
		textSize(30);
		translate(width/2, height/2);

		for(int i = 0; i < 5; i++)
		{
			ellipse(0, -50,50,50);
			rotate(radians(72));

		}

		fill(0,0,255);
		ellipse(0,0,50,50);
		
		
	}

	
}
