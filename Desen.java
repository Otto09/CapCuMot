

/**
 * Write a description of class Desen here.
 *
 * @author Goga Octavian
 */
public class Desen
{
    // instance variables - replace the example below with your own
    private Square square1;
    private Square square2;
    private Square square3;
    private Circle circle1;
    private Circle circle2;
    private Circle circle3;
    private Triangle triangle1;
    private Triangle triangle2;
    /**
     * Constructor for objects of class Desen
     */
    public Desen()
    {
        // initialise instance variables
        square1 = new Square();
        square2 = new Square();
        square3 = new Square();
        circle1 = new Circle();
        circle2 = new Circle();
        circle3 = new Circle();
        triangle1 = new Triangle();
        triangle2 = new Triangle();
        
        square1.changeColor("black");
        square1.changeSize(150);
        square1.makeVisible();
        
        circle2.changeColor("red");
        circle2.changeSize(50);
        circle2.moveHorizontal(110);
        circle2.makeVisible();
        
        triangle1.changeColor("red");
        triangle1.changeSize(7, 7);
        triangle1.moveHorizontal(85);
        triangle1.moveVertical(65);
        triangle1.makeVisible();
        
        circle3.changeColor("black");
        circle3.changeSize(70);
        circle3.moveHorizontal(114);
        circle3.moveVertical(-10);
        circle3.makeVisible();
        
        circle1.changeColor("yellow");
        circle1.changeSize(100);
        circle1.moveHorizontal(65);
        circle1.moveVertical(25);        
        circle1.makeInvisible();
        circle1.makeVisible();
        
        square2.changeColor("black");
        square2.changeSize(15);        
        square2.moveHorizontal(50);
        square2.moveVertical(70);
        square2.makeVisible();
        
        square3.changeColor("black");
        square3.changeSize(15);
        square3.moveHorizontal(80);
        square3.moveVertical(70);
        square3.makeVisible();
        
        triangle2.changeColor("black");
        triangle2.changeSize(30, 30);
        triangle2.moveHorizontal(83);
        triangle2.moveVertical(115);
        triangle2.makeVisible();
    }

    public static void main(String args[]) 
    {
        Desen d = new Desen();
    }

}
