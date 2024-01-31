package __OOP.StaticConcept;

public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello World");
//        System.out.println(this.age);  //You cannot use this keyword inside static method
    }
    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population++;
    }
}
