package __OOP.AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am Pilot");
    }

    @Override
    void partner() {
        System.out.println("I love Dholu and his age is 25 ");
    }
}
