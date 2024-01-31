package __OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(box2);

        Box.Info();

        System.out.println(box3.l + " " + box3.h + " " + box3.w);

        BoxWeight box4 = new BoxWeight();
        BoxWeight box5 = new BoxWeight(2,2,2,5);

        System.out.println(box5.weight + " "+ box5.l);
    }
}
