import java.util.ArrayList;

public class Heaps {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while(arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left  = 2 * i + 1;
            int right = 2 * i + 2;
            int mindIdx = i;

            if(left < arr.size() && arr.get(mindIdx) > arr.get(left)) {
                mindIdx = left;
            }

            if(right < arr.size() && arr.get(mindIdx) > arr.get(right)) {
                mindIdx = right;
            }

            if(mindIdx != i) {
                int temp = arr.get(0);
                arr.set(i, arr.get(mindIdx));
                arr.set(mindIdx, temp);

                heapify(mindIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            arr.set(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1);

            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}