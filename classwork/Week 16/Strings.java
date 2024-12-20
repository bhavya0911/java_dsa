import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name.concat(" dshfgodisg"));

        System.out.println(name.charAt(0));
        print(name);
    }

    public static void print(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}