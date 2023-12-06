package _Strings;

public class ChRmv {
    public static void main(String[] args) {
    String str = "Kumar Sunny Suman";
    System.out.println(str.replace("u", ""));
        System.out.println(charRmv("kayapalat", 'a'));
    }

    public static StringBuilder charRmv(String str, char c){
        char[] chr = str.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(chr[i] != c){
                ans.append(chr[i]);
            }
        }
        return ans;
    }
}