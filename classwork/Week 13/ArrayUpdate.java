public class ArrayUpdate {
    public static void main(String args[]) {
        int marks[] = {97, 98, 99};
        int nonChangeable = 5;
        update(marks, nonChangeable);

        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(nonChangeable);
    }

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 10;
        for(int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }
}