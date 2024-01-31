package __OOP.StaticConcenpt;
//class Test{
//    static String name;
//    public Test(String name){
//        Test.name = name;
//    }
//}
public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
    Test a = new Test("Sunny");
    Test b = new Test("Suman");

    System.out.println(a.name);
    System.out.println(b.name);
    }
}
