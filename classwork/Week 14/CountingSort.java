public class CountingSort {
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }   
    }

    public static void sort(int numbers[]) {
        int length = numbers.length;
        int count[] = new int[length];
        for(int i = 1; i <= length - 1; i++) {
            count[numbers[i]]++;
        }
        int curr = 0;
        for(int i = 0; i <= length - 1; i++) {
            for(int j = 0; j < count[i]; j++) {
                numbers[curr] = i;
                curr++;
            }
        }
    }
}