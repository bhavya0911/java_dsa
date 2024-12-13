import java.util.Scanner;

public class CircleArea {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        sc.close();
        System.out.println(area);
    }    
}
