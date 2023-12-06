package _Strings;
public class CntChr {
    public static void main(String[] args) {
        System.out.println(cntChr("kumar sunny suman", 'n'));
    }
    public static int cntChr(String str, char c){
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c) cnt++;
        }
        return cnt;

    }
}
