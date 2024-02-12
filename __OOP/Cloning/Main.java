package __OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sunny = new Human(22, "Sunny");
//        Human twin = new Human(sunny);
        Human twin = (Human) sunny.clone();
        System.out.println(twin.age + " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        twin.age = 18;

        System.out.println(sunny.age);

        System.out.println(Arrays.toString(sunny.arr)); //For Non-primitive data type it just reference to the same object. Known as shallow copy. To solve this we use Deep Copy
    }
}
