package _Numbers;
public class IsPrime {
    public static void main(String[] args) {
        int num = 19;
        int check = 0;
        for(int i = 2; i <= num /2; i++) {
            if(num%i == 0){
                check = 1;
                break;
            }
        }
        if(check == 1) System.out.println("No");
        else System.out.println("Yes");
    }
}
