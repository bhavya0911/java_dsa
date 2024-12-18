public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(int numbers[]) {
        for(int i = 0; i < numbers.length - 1; i++) {
            int minPos = i;
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[minPos] > numbers[j]) {
                    minPos = j;
                }
            }
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }
}
