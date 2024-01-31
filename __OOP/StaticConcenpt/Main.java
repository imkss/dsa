package __OOP.StaticConcenpt;

public class Main {
    public static void main(String[] args) {
        Human sunny = new Human("Sunny", 22, 40000, false);
        Human ravi = new Human("Ravi", 32, 50000, true);
        Human mayank = new Human("Mayank", 24, 28000, false);
        System.out.println(sunny.salary);

        System.out.println(Human.population);
    }

//    This is not dependent on any objects since it is static
    static void fnc() {
//        greeting(); //You cant use this here inside a static method because it requires an instance
// But the method you are using, it does not depend on an instance

//        Here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

//    We know that something non-static belongs to an object
    void greeting() {
        System.out.println("Hello World!");
    }
}
