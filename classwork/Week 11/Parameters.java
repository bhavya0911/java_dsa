import java.util.Scanner;

public class Parameters {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(calculateSum(a, b));
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }
}