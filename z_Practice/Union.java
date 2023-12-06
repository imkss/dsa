package z_Practice;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 1, 2, 3, 6};

        System.out.println(doUnion(a, a.length, b , b.length));
    }

    public static int doUnion(int[] a, int n, int[] b, int m) {

            //Your code here
            ArrayList<Integer> ans = new ArrayList<>();

            int i = 0;
            int j = 0;

            while(i < n && j < m){
                if(a[i] <= b[j]){
                    if(ans.size() == 0 || ans.get(ans.size() - 1) !=  a[i]){
                        ans.add(a[i]);
                    }
                    i++;
                }
                else{
                    if(ans.size() == 0 || ans.get(ans.size() - 1) != b[j]){
                        ans.add(b[j]);
                    }
                    j++;
                }
            }

            while(i < n) {
                if(ans.size() == 0 || ans.get(ans.size() - 1) != a[i]){
                    ans.add(a[i]);
                }
                i++;
            }

            while(j < m) {
                if(ans.size() == 0 || ans.get(ans.size() - 1) != b[j]){
                    ans.add(b[j]);
                }
                j++;

            }

            return ans.size();
        }
    }

