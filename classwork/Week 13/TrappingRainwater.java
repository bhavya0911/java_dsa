public class TrappingRainwater {
    public static void main(String args[]) {
        int heights[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(heights));
    }

    public static int trappedRainwater(int heights[]) {
        int area = 0;
        int n = heights.length;
        int left[] = new int[n];
        left[0] = heights[0];
        int right[] = new int[n];
        right[n - 1] = heights[n - 1];
        for(int i = 1; i < n; i++) {
            left[i] = Math.max(heights[i], left[i - 1]);
        }

        for(int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(heights[i], right[i + 1]);
        }
        for(int i = 0; i < heights.length; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            area += waterlevel - heights[i];
        }
        return area;
    }
}