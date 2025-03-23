package __OOP.TCS;

public class Dog {

//  Attributes of the Dog class
    private String name;
    private String color;
    private int age;

//  Constructor to initialize the Dog class
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

//  Method to get the Info of the dog
    public void displayInfo(){
        System.out.println("The name of the dog is " + name + ". He is "+ age + " years old and " + color + " in color.");
    }

//  Method to make the dog bark
    public void bark() {
        System.out.println(name + " is barking :>");
    }
}
