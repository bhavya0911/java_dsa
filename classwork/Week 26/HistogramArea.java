import java.util.Stack;

public class HistogramArea {
    public static int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();

        for(int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = -1;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for(int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for(int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            // System.out.println(currArea);
            max = Integer.max(max, currArea);
        }

        return max;
    }
    public static void main(String args[]) {
        int height[] = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(height));
    }
}