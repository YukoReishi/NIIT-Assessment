// Write a program to print the area and perimeter of a triangle having sides of
// 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

public class Triangle {

    public Triangle(){
        int height = 3;
        int base = 4;
        int hypotenuse = 5;
        System.out.println("Perimeter: " + (height + base + hypotenuse));
        System.out.println("Area: " + (0.5 * base * height));
    }

    public static void main(String [] args){
        Triangle triangle1 = new Triangle();
    }
}
