/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mandi
 */
public class Collage {
    private Circle[] circulo;
    private Square[] cuadrado;
    private Triangle[] triangulo;
    private Trapecio[] trapecio;
    private Rectangulo[] rectangulo;

    public Collage() {
        circulo= new Circle[20];
        cuadrado= new Square[20];
        triangulo= new Triangle[20];
        trapecio= new Trapecio[20];
        rectangulo= new Rectangulo[20];
    }
    
     public Square cuadradoRandom() {
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        int size = (int) (Math.random() * 50 + 5);
        String color = colorRandom();
        Square cuadrado = new Square(size, posX, posY, color);
        return cuadrado;
    }
     
       public Circle circuloRandom() {
        int diametro = (int) (Math.random() * 50 + 5);
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        String color = colorRandom();
        Circle circulo = new Circle(diametro, posX, posY, color);
        return circulo;
    }
       
       public Triangle trianguloRandom() {
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        int altura = (int) (Math.random() * 50 + 5);
        int base = (int) (Math.random() * 50 + 5);
        String color = colorRandom();
        Triangle triangulo = new Triangle(altura, base, posX, posY, color);
        return triangulo;
    }
        public Trapecio trapecioRandom() {
        int posX = (int) (Math.random() * 750);
        int posY = (int) (Math.random() * 500);
        int altura = (int) (Math.random() * 50 + 5);
        int base = (int) (Math.random() * 40 + 5);
        String color = colorRandom();
        Trapecio trapecio = new Trapecio(base, altura, posX, posY, color);
        return trapecio;
    }
         public Rectangulo rectanguloRandom(){
         int posX = (int) (Math.random() * 750);
         int posY = (int) (Math.random() * 500);
         int altura = (int) (Math.random() * 50 + 5);
         int base = (int) (Math.random() * 100 + 5);
         String color = colorRandom();
         Rectangulo rectangulo = new Rectangulo(altura,base, posX, posY, color);
         return rectangulo;
     }
         
   public String colorRandom()
   {
       String color;
       int randomizer=(int)(Math.random()*7+1);
       switch(randomizer)
       {
           case 1: color="red"; break;
           case 2: color="blue"; break;
           case 3: color="black"; break;
           case 4: color= "yellow"; break;
           case 5: color="magenta"; break;
           case 6: color="green"; break;
           default:color="black"; break;    
       }
       return color;
   }
    public void crearFig()
    {
    for(int i=0;i<20;i++)
    {
        cuadrado[i]=cuadradoRandom();
        cuadrado[i].makeVisible();
        circulo[i]=circuloRandom();
        circulo[i].makeVisible();
        triangulo[i]=trianguloRandom();
        triangulo[i].makeVisible();
        trapecio[i]=trapecioRandom();
        trapecio[i].makeVisible();
        rectangulo[i]=rectanguloRandom();
        rectangulo[i].makeVisible();
    }
    }
    
     public void crearCuadrados() {
        for (int i = 0; i < 20; i++) {
            cuadrado[i] = cuadradoRandom();
            cuadrado[i].makeVisible();
        }
    }

    public void crearCirculos() {
        for (int i = 0; i < 20; i++) {
            circulo[i] = circuloRandom();
            circulo[i].makeVisible();
        }
    }

    public void crearTrapecios() {
        for (int i = 0; i < 20; i++) {
            trapecio[i] = trapecioRandom();
            trapecio[i].makeVisible();
        }
    }

    public void crearTriangulos() {
        for (int i = 0; i < 20; i++) {
            triangulo[i] = trianguloRandom();
            triangulo[i].makeVisible();
        }
    }

    public void crearRectangulos() {
        for (int i = 0; i < 20; i++) {
            rectangulo[i] = rectanguloRandom();
            rectangulo[i].makeVisible();

        }
    }

     public void mostrarFiguras() {
        for (int i = 0; i < 20; i++) {
            cuadrado[i].makeVisible();
            circulo[i].makeVisible();
            trapecio[i].makeVisible();
            triangulo[i].makeVisible();
            rectangulo[i].makeVisible();
        }
    }

    public void limpiar(int c) {
        for(int i=0;i<20;i++){
            switch(c) {
                case 0: limpiarTodo();
                    break;
                case 1: circulo[i].erase();
                    break;
                case 2: triangulo[i].erase();
                    break;
                case 3: cuadrado[i].erase();
                    break;
                case 4: rectangulo[i].erase();
                    break;
                case 5: trapecio[i].erase();
                    break;
            }

        }

    }
    public void limpiarTodo() {
        for (int i = 0; i < 20; i++) {
            cuadrado[i].erase();
            circulo[i].erase();
            trapecio[i].erase();
            triangulo[i].erase();
            rectangulo[i].erase();
        }
    }
    public void cambiarColor(int c,String color) {
        if(color.equals("M") || color.equals("N") ) {
            for (int i = 0; i < 20; i++) {
                switch (c) {
                    case 0:
                        colorTodo(color);
                        break;
                    case 1:
                        circulo[i].changeColor(color);
                        break;
                    case 2:
                        triangulo[i].changeColor(color);
                        break;
                    case 3:
                        cuadrado[i].changeColor(color);
                        break;
                    case 4:
                        rectangulo[i].changeColor(color);
                        break;
                    case 5:
                        trapecio[i].changeColor(color);
                        break;
                }
            }
        }
    }
        public void colorTodo(String color) {
            for (int i = 0; i < 20; i++) {
                cuadrado[i].changeColor(color);
                circulo[i].changeColor(color);
                trapecio[i].changeColor(color);
                triangulo[i].changeColor(color);
                rectangulo[i].changeColor(color);
            }
        }
}
