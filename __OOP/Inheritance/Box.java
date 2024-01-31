package __OOP.Inheritance;
public class Box {
double l;
double w;
double h;
    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(double a) {
        this.l = a;
        this.w = a;
        this.h = a;
    }
    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    public static void Info(){
        System.out.println("Box is Running");
    }
}
