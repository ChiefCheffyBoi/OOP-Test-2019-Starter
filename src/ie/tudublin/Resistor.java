package ie.tudublin;

public class Resistor
{
    UI ui;
    private float r;
    private float g;
    private float b; 


    public void resistor(ui, float r, float g, float b)
    {
        this.ui = ui; 
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void render(){

        int border = 50; 

        //box1
        ui.rect(200, border, 100, 50);
        //2nd box
        ui.fill(r ,g, b);
        ui.rect(220, 50+(border*2), 10, 10);
        //3rd box
        ui.fill(r ,g, b);
        ui.rect(220, 50+(border*3), 10, 10);
        //4th box
        ui.fill(r ,g, b);
        ui.rect(220, 50+(border*4), 10, 10);
    }










    
}