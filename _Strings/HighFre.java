package _Strings;
public class HighFre {
    public static void main(String[] args) {
        freMax("Kumar Sunny Suman");
    }
    public static void freMax(String str) {
        int maxCnt = 0;
        char maxChr = Character.MIN_VALUE;
        char[] chr = new char[256];
        for(int i = 0; i < str.length(); i++) {
            chr[str.charAt(i)]++;
        }
        for(int i = 0; i <= 255; i++) {
            if(chr[i] > maxCnt) {
                maxCnt = chr[i];
                maxChr = (char)i;
            }
        }
        System.out.println("Character "+ maxChr + " is "+ maxCnt + " times.");
    }
}
