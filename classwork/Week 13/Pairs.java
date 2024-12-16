public class Pairs {
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairs(numbers);
    }   
    
    public static void pairs(int numbers[]) {
        int tp = 0;
        for(int i = 0; i < numbers.length - 1; i++) {
            int currentElement = numbers[i];
            System.out.print("Pairs are as follows: ");
            for(int j = i + 1; j <numbers.length; j++) {
                tp++;
                System.out.print("(" + currentElement + ", " + numbers[j] + ") ");
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }
}