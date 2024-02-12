package __OOP.AbstractDemo;

public class Son extends Parent{
//    @Override
//    void normal() {
//        super.normal();
//    }

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a developer");
    }

    @Override
    void partner() {
        System.out.println("I love chutki and her age is 23");
    }
}
