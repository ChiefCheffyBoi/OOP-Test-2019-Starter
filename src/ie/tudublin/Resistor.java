package ie.tudublin;

public class Resistor
{
    UI ui;
    private float r;
    private float g;
    private float b;
    private float r2;
    private float g2;
    private float b2; 
    private float r3;
    private float g3;
    private float b3;
    private float r4;
    private float g4;
    private float b4;   


    public void resistor(ui, float r, float g, float b, float r2, float r3, float r4, float g2, float g3, float g4, float b2, float b2, float b3, float b4)
    {
        this.ui = ui; 
        this.r = r;
        this.g = g;
        this.b = b;
        this.r2 = r2;
        this.g2 = g2;
        this.b2 = b2;
        this.r3 = r3;
        this.g3 = g3;
        this.b3 = b3;
        this.r4 = r4;
        this.g4 = g4;
        this.b4 = b4;
    }
    public void render(){

        int border = 50; 

        //box1
        ui.rect(200, border, 100, 50);
        //coloured bars
        ui.fill(r);
        ui.rect(210, border, 10, 50);
        ui.fill(g); 
        ui.rect(220, border, 10, 50);
        ui.fill(b);
        ui.rect(230, border, 10, 50);
        //2nd box
        ui.noFill();
        ui.rect(220, 50+(border*2), 10, 10);
        //coloured bars
        ui.fill(r2);
        ui.rect(210, border, 10, 50);
        ui.fill(g2); 
        ui.rect(220, border, 10, 50);
        ui.fill(b2);
        ui.rect(230, border, 10, 50);
        //3rd box
        ui.noFill();
        ui.rect(220, 50+(border*3), 10, 10);
        //4th box
        ui.rect(220, 50+(border*4), 10, 10);
        ui.fill(r ,g, b);

    }










    
}