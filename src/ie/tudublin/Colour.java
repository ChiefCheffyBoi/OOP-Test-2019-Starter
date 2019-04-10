package ie.tudublin;

import processing.data.TableRow;
import java.util.ArrayList;
import processing.data.Table;

public class Colour
{
    UI ui; 

    ArrayList<Colour> colours = new ArrayList<Colour>();

    void loadColurs()
    {
        Table table = loadTable("cafe.csv", "header");
        for(TableRow tr:table.rows())
        {
            Colour c = new Colour(tr);
            colours.add(c);
        }        
    }

    public Colour(){

        public void Colors(ui, int a, int b, int c)
        {
            int i =0; 



        }


    }  
}