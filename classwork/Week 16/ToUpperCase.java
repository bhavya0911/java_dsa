import java.lang.StringBuilder;

public class ToUpperCase {
    public static void main(String args[]) {
        String text = "hi, i am shraddha";
        convert(text);
    }

    public static void convert(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(str);
    }
}