import java.util.Scanner;

public class PrintCustNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int finalNum = sc.nextInt();
        sc.close();
        int counter = 1;
        while(counter <= finalNum) {
            System.out.print(counter + " ");
            counter++;
        }
    }        
}
