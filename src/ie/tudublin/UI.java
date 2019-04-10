package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;


public class UI extends PApplet

{	
	ArrayList<UI> colors = new ArrayList<UI>();

	Resist r;
	Colour c; 
	
	
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		separate(381);
		separate(1);
		separate(92);
		
	}
	void loadColors()
    {
        Table table = loadTable("Colours.csv", "header");
        for(TableRow tr:table.rows())
        {
            UI c = new UI(tr);
            colors.add(c);
		}        
    }

	public void setup() 
	{
		loadColors();
		c = new Col(ones, tens, hundreds);
		r = new Reist(this); 
	}
	
	public void draw()
	{	
		r.render();		
	}
}
