package __OOP.Inheritance;
public class BoxWeight extends Box{
    double weight = 1;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double l, double w, double h, double weight){
        super(l,h,w); // Calls the parent class constructor
//        used to initialise values present in parent class
        System.out.println(super.weight); // This reference to the just above class.
        System.out.println(this.weight); //This reference to the current object value.
        this.weight = weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
    }
}
