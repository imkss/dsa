package _Numbers;
import java.util.ArrayList;
public class PrintFibo {
    public static void main(String[] args) {
        System.out.println(fiboIte(10));

        int n = 10;
        for(int i = 0; i < n - 1; i++) {
            System.out.print(fiboRec(i) + ", ");
        }
        System.out.print(fiboRec(n - 1));
    }

    public static ArrayList<Integer> fiboIte(int n) {
        ArrayList<Integer> lst = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = 1;
        lst.add(a);
        lst.add(b);
        lst.add(c);
        for (int i = 2; i < n - 1; i++) {
            a = b;
            b = c;
            c = a + b;
            lst.add(c);
        }
        return lst;
    }

    public static int fiboRec(int n) {
        if (n < 2) return n;
        return fiboRec(n - 2) + fiboRec(n - 1);
    }
}

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34