// Write a program that would print the information (name, year of joining, salary, address)
// of three employees by creating a class named 'Employee'.

import java.util.List;
import java.util.ArrayList;
public class Employee {
    String Name;
    int YearOfJoining;
    int Salary;
    String Address;

    public Employee(String Name, int YearOfJoining, int Salary, String Address){
        this.Name = Name;
        this.YearOfJoining = YearOfJoining;
        this.Salary = Salary;
        this.Address = Address;
    }

    public static void main(String [] args){
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Robert", 2020, 500000, "Delhi"));
        employee.add(new Employee("Sam", 2022, 300000, "Mumbai"));
        employee.add(new Employee("John", 2021, 800000, "Karnataka"));

        for (Employee emp: employee){
            System.out.format("%-10s %-7d %-10d %-15s", emp.Name, emp.YearOfJoining,
                    emp.Salary, emp.Address);
            System.out.println();
        }
    }
}
