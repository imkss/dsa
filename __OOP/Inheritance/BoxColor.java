package __OOP.Inheritance;

public class BoxColor extends Box{
    String color;

    public BoxColor(double a, String color) {
        super(a);
        this.color = color;
    }

    public BoxColor(double l, double w, double h, String color) {
        super(l, w, h);
        this.color = color;
    }
}
