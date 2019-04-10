package ie.tudublin;

public class Resist 
{
    UI ui;
    private float r;
    private float g;
    private float b; 


    public void Resist(ui, float r, float g, float b)
    {
        this.ui = ui; 
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void render(){

        //box1
        ui.rect(200, 600, 400, 30);
        //first color
        ui.fill(r ,g, b);
        ui.line(220, 600, 10, 10);
        //second color
        ui.fill(r ,g, b);
        ui.line(220, 600, 10, 10);
        //third color
        ui.fill(r ,g, b);
        ui.line(220, 600, 10, 10);

    }










    
}