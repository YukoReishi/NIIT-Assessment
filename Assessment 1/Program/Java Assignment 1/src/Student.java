//Write a program to print the names of students by creating a Student class.
// If no name is passed while creating an object of Student class,
// then the name should be "Unknown", otherwise the name should be equal to the String value passed
// while creating object of Student class.


public class Student {

    String Name = "Unknown";

    public Student(String Name){
        this.Name = Name;
    }

    public void displayName(){
        if (this.Name.equals("")){
            System.out.println("Name of the Student: Unknown");
        } else {
            System.out.println("Name of the Student: " + this.Name);
        }
    }

    public static void main(String [] args){
        Student std1 = new Student("Alex");
        Student std2 = new Student("");
        Student std3 = new Student("Joe");

        std1.displayName();
        std2.displayName();
        std3.displayName();
    }
}


