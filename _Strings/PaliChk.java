package _Strings;
public class PaliChk {
    public static void main(String[] args) {
        System.out.println(pali("civic"));
    }
    public static boolean pali(String str){
        for (int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
}
