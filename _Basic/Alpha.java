package _Basic;
import java.util.Scanner;
public class Alpha {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

		while(t --> 0) {
            int[] num = new int[26];
            for (int i = 0; i < 26; i++) {
                num[i] = sc.nextInt();
            }
            String s = sc.next();
            int count = 0;
            for (int i = 'a'; i <= 'z'; i++) {
                if (s.indexOf(i) == -1) {
                    count += num[i - 'a'];
                }
            }
            System.out.println(count);
        }
    }
}
