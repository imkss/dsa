package _Basic;

public class CntVowCon {
    public static void main(String[] args) {
        String str = "ae#zyu*";
        char[] chr = str.toCharArray();
        int vow = 0;
        int con = 0;
        for(char c : chr){
            if(isVow(c)) vow++;
            else if (!isVow(c) && c >= 'a' && c <= 'z') {
                con++;
            }
        }
        System.out.println("Vowels: "+ vow +"\nConsonants: "+ con +
                "\nOther characters: " + (str.length()-(con + vow)));
    }
    public static boolean isVow(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
