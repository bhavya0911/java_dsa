public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        if(temp == null) {
            System.out.print("ll is empty");
        }
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int index, int data) {
        Node newNode = new Node(data);
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        for(int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public static int search(int key) {
        Node temp = head;
        for(int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public static int helper(Node next, int key) {
        if(next == null) {
            return - 1;
        }

        if(next.data == key) {
            return 0;
        }
        int index = helper(next.next, key);
        if(index == -1) {
            return - 1;
        }
        return index + 1;
    }

    public static int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node current = tail = head;
        Node next;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int removeFromLast(int index) {
        if(index == size) {
            int val = head.data;
            head = head.next;
            return val;
        }
        int indexFromBack = size - index - 1;
        Node temp = head;
        for(int i = 0; i < indexFromBack; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);

        Node prev = null;
        Node current = mid;
        Node next;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node right = prev;
        Node left = head;
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(0, 0);
        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println(ll.size);

        System.out.println(search(3));
        System.out.println(search(5));

        System.out.println(recSearch(3));
        System.out.println(recSearch(5));

        ll.print();
        ll.reverse();
        ll.print();

        System.out.println(ll.removeFromLast(1));
        ll.print();

        ll.removeFirst();
        ll.removeFirst();
        ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome());

        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}