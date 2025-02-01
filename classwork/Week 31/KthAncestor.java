public class KthAncestor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        if(rightLCA == null) {
            return leftLCA;
        }

        if(leftLCA == null) {
            return rightLCA;
        }

        return root;
    }

    public static int lcaDistance(Node root, int n) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }

        int leftDistance = lcaDistance(root.left, n);
        int rightDistance = lcaDistance(root.right, n);

        if(leftDistance == -1 && rightDistance == -1) {
            return - 1;
        } else if(leftDistance == -1) {
            return rightDistance + 1;
        } else {
            return leftDistance + 1;
        }
    }

    public static int distance(Node root, int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int dist1 = lcaDistance(lca, n1);
        int dist2 = lcaDistance(lca, n2);

        return dist1 + dist2;
    }

    public static int KAncestor(Node root, int n, int k) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }

        int leftDistance = KAncestor(root.left, n, k);
        int rightDistance = KAncestor(root.right, n, k);

        if(leftDistance == -1 && rightDistance == -1) {
            return -1;
        }

        int max = Math.max(leftDistance, rightDistance);
        if(max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 5, k = 1;
        KAncestor(root, n, k);
    }
}