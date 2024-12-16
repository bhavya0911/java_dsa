public class ReverseArray {
    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        reverse(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        reverseWhile(numbers);
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void reverse(int numbers[]) {
        int length = numbers.length - 1;
        for(int i = 0; i <= (length / 2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[length - i];
            numbers[length - i] = temp;
        }
    }

    public static void reverseWhile(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while(first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }
}