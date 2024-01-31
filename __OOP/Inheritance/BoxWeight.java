package __OOP.Inheritance;
public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(double l, double w, double h, double weight){
        super(l,h,w); // Calls the parent class constructor
//        used to initialise values present in parent class
        this.weight = weight;
    }
}
