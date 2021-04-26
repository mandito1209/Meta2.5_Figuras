/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
/**
 *
 * @author mandi
 */
public class Trapecio {
   private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    public Trapecio() {
        height = 60;
        width = 70;
        xPosition = 210;
        yPosition = 140;
        color = "green";
        isVisible = false;
    }
 public Trapecio(int width, int height, int xPosition, int yPosition, String color) {
        this.width = width;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.height = height;
    }
 
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
/**
     * Make this triangle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    private void draw()
    {
       if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = {xPosition - width/2,xPosition,  xPosition+width,xPosition + width+width/2 };
            int[] ypoints = { yPosition,yPosition-height ,yPosition - height,yPosition};
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 4));
            canvas.wait(10);
        }
    }
    
     public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

    

}
