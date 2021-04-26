
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class Rectangulo {
      private int altura;
     private int ancho;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new square at default position with default color.
     */
    public Rectangulo()
    {
        this.altura = 60;
        this.ancho=120;
        xPosition = 310;
        yPosition = 120;
        color = "red";
        isVisible = false;
    }
      public Rectangulo(int altura,int ancho,int xPosition,int yPosition, String color)
    {
        this.altura = altura;
        this.ancho=ancho;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
    }
      
    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
/**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this triangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
     /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int altura, int ancho)
    {
        erase();
        this.altura=altura;
        this.ancho=ancho;
        draw();
    }
    /**
     * Draw the square with current specifications on screen.
     */
   private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, altura, ancho));
            canvas.wait(10);
        }
    }

    /**
     * Erase the square on screen.
     */
    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
