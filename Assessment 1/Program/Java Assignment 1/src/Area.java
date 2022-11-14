// Write a program to print the area of a rectangle by creating a class named 'Area'
// taking the values of its length and breadth as parameters of its constructor
// and having a method named 'returnArea' which returns the area of the rectangle.
// Length and breadth of rectangle are entered through keyboard.

import java.util.Scanner;
public class Area {

    int rectangleLength;
    int rectangleBreadth;

    public Area(int rectangleLength, int rectangleBreadth){
        this.rectangleLength = rectangleLength;
        this.rectangleBreadth = rectangleBreadth;
    }

    public double returnArea(){
        return (this.rectangleLength * this.rectangleBreadth);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int Length = input.nextInt();
        System.out.print("Enter the Breadth: ");
        int Breadth = input.nextInt();

        Area rectangle = new Area(Length, Breadth);
        System.out.println("Area of Rectangle: " + rectangle.returnArea());
    }
}
