package __OOP.Polymorphism;

public class Circle extends Shapes{
    @Override  //This will run when obj of Circle is created. Hence, It is overriding the parent method
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
