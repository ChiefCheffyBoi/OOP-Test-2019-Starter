package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class UI extends PApplet

{
	Resistor r;
	Colour c; 
	public float h;
	public float t;
	public float o; 
	ArrayList<Colour> colours = new ArrayList<Colour>();
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		h = hundreds; 
		int tens = (value - (hundreds * 100)) / 10;
		t = tens;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		o = ones;
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		background(80,80,80);
		separate(381);
		separate(1);
		separate(92);
		
	}
	void loadColours()
    {
        Table table = loadTable("colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            Colour c = new Colour(tr);
            colours.add(c);
        }        
	}
	void printscolours(){
		for(int i=0; i<55; i++)
		{
			Colour c = colours.get(i);
			println(c.getName()); 
		}
	}
	

	public void setup() 
	{
		c = new Col(ones, tens, hundreds);
		r = new resistor(this); 
	}
	
	public void draw()
	{	
		r.render();		
	}
}
