/*Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively.
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side
(suppose s) calling the constructor of its parent class as 'super(s,s)'.
Print the area and perimeter of a rectangle and a square.
 */
class Rectangle {
    int Length;
    int Breadth;

    Rectangle(int Length, int Breadth) {
        this.Length = Length;
        this.Breadth = Breadth;
    }

    public void Perimeter() {

        System.out.println("Perimeter of Rectangle: " + (2 * (this.Length + this.Breadth)));
    }

    public void Area() {
        System.out.println("Area of Rectangle: " + (this.Length * this.Breadth));
    }
}
class Square extends Rectangle{

    Square(int Length, int Breadth) {
        super(Length, Breadth);
    }
    public void Perimeter(){
        System.out.println("Perimeter of Square: " + (2 * (Length + Breadth)));
    }
    public void  Area() {
        System.out.println("Area of Sqaure: " + (Length * Breadth));
    }
}
public class Calculate{
    public static void main(String [] args){
        Rectangle obj1 = new Rectangle(2, 3);
        obj1.Perimeter();
        obj1.Area();

        Square obj2 = new Square(2, 2);
        obj2.Perimeter();
        obj2.Area();
    }
}
