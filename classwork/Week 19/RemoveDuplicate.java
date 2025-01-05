import java.lang.StringBuilder;

public class RemoveDuplicate {

    public static void remove(String a, int i, StringBuilder newStr, boolean map[]) {
        if(i == a.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = a.charAt(i);
        if(map[currChar - 'a'] == true) {
            remove(a, i + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            remove(a, i, newStr.append(currChar), map);
        }
    }
    public static void main(String args[]) {
        String a = "appnnacollege";
        remove(a, 0, new StringBuilder(""), new boolean[26]);
    }   
}