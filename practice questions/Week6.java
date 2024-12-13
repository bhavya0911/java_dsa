import java.util.Scanner;

public class Week6 {
    public static void main(String args[]) {
        q1();
        q2();
        q3();
    }

    static void q1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println(avg);
    }

    static void q2() {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(area);
    }

    static void q3() {
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();
        float bill = (float) (pencil + pen + eraser) * 1.18f;
        System.out.println(bill);
    }
}
