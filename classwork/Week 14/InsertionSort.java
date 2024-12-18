public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int numbers[]) {
        for(int i = 1; i < numbers.length; i++) {
            int curr = numbers[i];
            int prev = i - 1;
            while(prev >= 0 && numbers[prev] > curr) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = curr;
        }
    }
}