package e_Recursion.String;
public class RemoveEle {
    public static void main(String[] args) {
    Rmv( "", "bashaaabhga", 'h');
    System.out.println(RmvCh("bashaaabhga", 'a'));

    System.out.println(RmvWrd("basappsaapple", "app"));

    System.out.println(skipAppNotApple("basappsaapple"));

    }
    static void Rmv(String ans, String str, char ele){
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch == ele) {
            Rmv(ans, str.substring(1), ele);
        } else{
            Rmv(ans + ch, str.substring(1), ele);
        }
    }
    
    static String RmvCh(String str, char ele){
        if(str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);
        if(ch == ele) {
            return RmvCh(str.substring(1), ele);
        } else{
            return ch + RmvCh(str.substring(1), ele);
        }
    }

    static String RmvWrd(String str, String wrd){
        if(str.isEmpty()) {
            return "";
        }
        if(str.startsWith(wrd)) {
            return RmvWrd(str.substring(wrd.length()), wrd);
        } else{
            return str.charAt(0) + RmvWrd(str.substring(1), wrd);
        }
    }

    static String skipAppNotApple(String str){
        if(str.isEmpty()) {
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else{
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }
}





