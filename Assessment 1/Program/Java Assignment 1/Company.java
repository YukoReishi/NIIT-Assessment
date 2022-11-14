/* Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
Now, assign name, age, phone number, address and salary to an
employee and a manager by making an object of both of these classes and print the same.
*/

class Member {
    String Name;
    int Age;
    int PhoneNo;
    String Address;
    double Salary;

    Member(String Name, int Age, int PhoneNo, String Address, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.PhoneNo = PhoneNo;
        this.Address = Address;
        this.Salary = Salary;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getPhoneNo() {
        return PhoneNo;
    }

    public String getAddress() {
        return Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + getSalary());
    }
}

class Manager extends Member {
    String Specialization;
    String Department;

    Manager(String Name, int Age, int PhoneNo, String Address, double Salary) {
        super(Name, Age, PhoneNo, Address, Salary);
    }
}

class Employee extends Member {
    protected String Specialization;
    protected String Department;

    Employee(String Name, int Age, int PhoneNo, String Address, double Salary) {
        super(Name, Age, PhoneNo, Address, Salary);
    }
}

public class Company {
    public static void main(String[] args) {
        Manager obj = new Manager("Sam", 35, 1111111, "Osaska", 9.5);

        Employee obj2 = new Employee("Ron", 26, 22222222, "Seattle", 10.0);

        obj.printSalary();
        obj2.printSalary();
    }
}

