import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);

        // String inputLine = sc.nextLine();
        // System.out.println(inputLine);

        int number = sc.nextInt();
        System.out.println(number);

        float numberFloat = sc.nextFloat();
        System.out.println(numberFloat);
        sc.close();
    }    
}
