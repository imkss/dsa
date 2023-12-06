package e_Recursion.Basic;

public class M_mul {
    public static void main(String[] args) {
        System.out.println(multi(15,3));
    }
    public static int multi(int n1, int n2) {

        if(n1 > n2) return multi(n2, n1);
        else if(n2 != 0) return n1 + multi(n1, n2-1);
        else return 0;
    }
}
