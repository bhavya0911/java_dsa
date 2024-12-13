import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int finalNum = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 1; i <= finalNum; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }        
}
