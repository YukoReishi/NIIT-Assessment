import java.util.Scanner;
public class practiseQuestion {

    public static void main(String [] args){
        Question.EvenOrOdd();
        Question.PositiveNegative();
        Question.Divisible();

        Question obj = new Question();
        obj.SwapNumber();
        Question.EqualOrNot();
        Question.BiggestNumber();
        Question.LeapYear();
        Question.LastTwoNum();
        Question.AtmTransaction();
    }
}

class Question{
    // WAP to check number is odd or even
    public static void EvenOrOdd(){
        int number = 54;
        if (number % 2 == 0){
            System.out.println("The number " + number + " is even.");
        } else{
            System.out.println("The number " + number + " is odd.");
        }
        System.out.println();
    }

    // Wap to check number is positive or negative
    public static void PositiveNegative(){
        int number = 32;
        if (number < 0){
            System.out.println("Negative");
        } else{
            System.out.println("Positive");
        }
        System.out.println();
    }

    // WAP to check number is divisible by n or not
    public static void Divisible(){
        int numerator = 42;
        int divisor = 2;
        if (numerator/divisor == 0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
        System.out.println();
    }

    // WAP to Swap the numbers
    public void SwapNumber(){
        int M = 3;
        int N = 4;
        int temp;
        System.out.println("Original Number is: " + M + ", " + N);
        temp = M;
        M = N;
        N = temp;
        System.out.println("New Value is: " + M + ", " + N);
        System.out.println();
    }

    // WAP to check two integers are equal or not
    public static void EqualOrNot(){
        int num1 = 5;
        int num2 = 6;
        if (num1 == num2){System.out.println(num1 + ", " + num2 + " are Equal");
        } else{System.out.println(num1 + ", " + num2 + "are not Equal");
        }
        System.out.println();
    }

    //WAP to Find the biggest number
    public static void BiggestNumber(){
        int num1 = 3;
        int num2 = 4;
        int num3 = 5;
        if (num1>num2 && num1>num3){System.out.println(num1 + " is Biggest.");
        } else if (num2>num1 && num2>num3) {System.out.println(num2+ " is Biggest");
        } else {System.out.println(num3 + " is Biggest.");
        }
        System.out.println();
    }

    //WAP to find the year is leap year or not
    public static void LeapYear(){
        int year = 2012;
        if (year%4 == 0){
            System.out.println(year + " is the Leap Year.");
        }else {
            System.out.println(year + " is not a Leap Year.");
        }
        System.out.println();
    }

    //WAP to Extract the last two numbers of a Year.
    public static void LastTwoNum(){
        String year = "2044";
        System.out.println(year.substring(2));
        System.out.println();
    }

    //WAP to display ATm Transaction
    public static void AtmTransaction(){
        int balance = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Select an Option: \n" +
                "1. Current Balance \n" +
                "2. Withdraw Money \n" +
                "3. Deposit Money");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.println("Your Current Balance: "+ balance);
        }
        else if (choice == 2) {
            System.out.println("Enter the amount you want to Withdraw: ");
            int withdrawMoney = input.nextInt();
            if (balance <= withdrawMoney) {
                System.out.println("You don't have enough money. " +
                        "Want to add money instead.");
            }else {
                balance = balance - withdrawMoney;
                System.out.println("Current Balance: " + balance);
            }
        }
        else if (choice == 3) {
            System.out.println("Enter the amount you want to deposit: ");
            int depositMoney = input.nextInt();
            balance += depositMoney;
            System.out.println("Current Balance: " + balance);
        }
        else{
            System.out.println("Invalid Option");
        }
    }
}

