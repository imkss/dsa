package _Basic;

public class Bracket {
    public static void main(String[] args) {
        String str = "())))))";
        System.out.println(contMis(str));
    }

    static int contMis(String str) {
        char[] bra = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < bra.length; i++) {
            if(bra[i] == '(') cnt++;
            else cnt--;
        }
        if(cnt < 0) return (-1 * cnt);
        return cnt;
    }
}
