package e_Recursion;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(cntPath(3,3));

        path("", 3, 3);
    }
    static int cntPath(int r, int c) {
        if(r == 1 || c == 1)
            return 1;
        
        int left = cntPath(r -1, c);
        int right = cntPath(r, c - 1);
        return right + left;
    }

    static ArrayList<String> path(String p, int r, int c) {
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1)
            list.addAll(path(p + 'D', r -1, c));

        if(c > 1)
            list.addAll(path(p + 'R', r, c - 1));
        return list;
    }
}
