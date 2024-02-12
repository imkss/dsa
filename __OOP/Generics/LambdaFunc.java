package __OOP.Generics;

import java.util.ArrayList;

public class LambdaFunc {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

//        arr.forEach((item) -> System.out.println(item * 2));

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation pro = (a, b) -> a * b;

        LambdaFunc myCalc = new LambdaFunc();
        System.out.println(myCalc.oparate(5, 23, pro));
        System.out.println(myCalc.oparate(5, 23, sum));
        System.out.println(myCalc.oparate(5, 23, sub));
    }

    private int oparate(int a, int b, Operation op) {
        return op.operation(a,b);
    }

    int sum(int a,int b) {
        return a + b;
    }
}
interface Operation{
    int operation(int a, int b);
}
