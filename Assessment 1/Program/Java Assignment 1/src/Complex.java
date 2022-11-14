// Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
// with separate methods for each operation whose real and imaginary parts are entered by user.

import java.util.Scanner;
import java.util.concurrent.CompletionException;

public class Complex {
    int realNo1;
    int imaginaryNo1;
    int realNo2;
    int imaginaryNo2;

    public Complex(int realNo1, int imaginaryNo1, int realNo2, int imaginaryNo2){
        this.realNo1 = realNo1;
        this.realNo2 = realNo2;
        this.imaginaryNo1 = imaginaryNo1;
        this.imaginaryNo2 = imaginaryNo2;
    }

    public void addition(){
        int real = this.realNo1 + this.realNo2;
        int imaginary = this.imaginaryNo1 + this.imaginaryNo2;
        System.out.println("Sum: " + real + "+(" + imaginary + "i)");
        System.out.println();
    }

    public void subtraction(){
        int real = this.realNo1 - this.realNo2;
        int imaginary = this.imaginaryNo1 - this.imaginaryNo2;
        System.out.println("Subtraction: " + real + "+(" + imaginary + "i)");
        System.out.println();
    }

    public void multiplication(){
        int real = (this.realNo1 * this.realNo2) - (this.imaginaryNo1 * this.imaginaryNo2);
        int imaginary = (this.realNo1 * this.imaginaryNo2) + (this.realNo2 * this.imaginaryNo1);
        System.out.println("Multiplication" + real + "+(" + imaginary + "i)");
        System.out.println();
    }

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the real part of 1st no: ");
        int real1 = input.nextInt();
        System.out.print("Enter the imaginary part of 1st no: ");
        int imaginary1 = input.nextInt();
        System.out.print("Enter the real part of 2nd no: ");
        int real2 = input.nextInt();
        System.out.print("Enter the imaginary part of 2nd no: ");
        int imaginary2 = input.nextInt();
        Complex number = new Complex(real1, imaginary1, real2, imaginary2);
        number.addition();
        number.subtraction();
        number.multiplication();
    }
}

