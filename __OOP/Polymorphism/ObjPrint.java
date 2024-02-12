package __OOP.Polymorphism;

public class ObjPrint {
    int num;

    public ObjPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjPrint {" +
                "num = " + num +
                '}';
    }

    public static void main(String[] args) {
        ObjPrint obj = new ObjPrint(23);
        System.out.println(obj);
    }
}
