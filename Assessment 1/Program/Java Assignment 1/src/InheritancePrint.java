/*
Create a class with a method that prints "This is parent class" and
its subclass with another method that prints "This is child class".
Now, create an object for each of the class and call
a - method of parent class by object of parent class
b - method of child class by object of child class
c - method of parent class by object of child class
*/

class Parent {
    public void ParentClass(){
        System.out.println("This is a parent class");
    }
}
class Child extends Parent{
    public void ChildClass(){
        System.out.println("This is a child class");
    }
}
public class InheritancePrint {
    public static void main(String [] args){
        Parent obj1 = new Parent();
        obj1.ParentClass();

        Child obj2 = new Child();
        obj2.ChildClass();

        obj2.ParentClass();
    }
}
