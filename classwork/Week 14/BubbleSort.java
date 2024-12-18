public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }   
    }

    public static void sort(int numbers[]) {
        int length = numbers.length - 1;
        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - i; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }  
}