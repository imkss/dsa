package _Basic;
import java.util.*;
public class CardSwipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] entry = new int[n];
        for(int i = 0; i < n; i++) {
            entry[i] = sc.nextInt();
        }
        int emp = 0;
        Set<Integer> unq = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(unq.contains(entry[i]))
            {
                unq.remove(entry[i]);
            }
            else
            {
                unq.add(entry[i]);
            }
            emp = Math.max(emp,unq.size());
        }
        System.out.println(emp);
    }
}
