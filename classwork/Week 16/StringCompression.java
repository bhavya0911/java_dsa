public class StringCompression {
    public static void main(String args[]) {
        String a = "abcd";
        count(a);
    }

    public static void count(String a) {
        int count = 1;
        String result = "";
        char ch = a.charAt(0);
        for(int i = 1; i < a.length(); i++) {
            if(a.charAt(i) != a.charAt(i - 1)) {
                result += ch;
                if(count != 1) {
                    result += count;
                }
                count = 1;
                ch = a.charAt(i);
            } else {
                count++;
            }
        }
        result += ch;
        if(count != 1) {
            result += count;
        }
        System.out.println(result);
    }
}