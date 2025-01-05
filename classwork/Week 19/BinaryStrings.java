public class BinaryStrings {

    public static void print(int n, int lastPlace, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }

        print(n - 1, lastPlace, str+"0");
        if(lastPlace == 0) {
            print(n - 1, 1, str+"1");
        }
    }

    public static void main(String args[]) {
        int n = 3;
        print(n, 0, "");
    }
}