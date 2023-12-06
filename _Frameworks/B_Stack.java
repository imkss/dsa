package _Frameworks;

import java.util.Stack;

public class B_Stack {

    public static void main(String[] args) {
        Stack<String> animal = new Stack<>(); // LIFO
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Monkey");
        animal.push("Horse");
        animal.push("Elephant");
        System.out.println(animal);
        System.out.println(animal.size());
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal);
        System.out.println(animal.empty());
        System.out.println(animal.capacity());
        System.out.println(animal.contains("Rabbit"));
        System.out.println(animal.indexOf("Horse"));
    }
}
