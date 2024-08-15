import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        if (root == null) {
            root = node;
        } else {
            if (node.data < root.data) {
                root.left = insertHelper(root.left, node);
            } else if (node.data > root.data) {
                root.right = insertHelper(root.right, node);
            }
        }

        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root == null) {
            return;
        }

        displayHelper(root.left);
        System.out.println(root.data);
        displayHelper(root.right);
    }

    public void displayLevel() {
        displayLevelHelper(root);
    }

    private void displayLevelHelper(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            root = queue.poll();
            System.out.println(root.data);

            if (root.left != null) {
                queue.add(root.left);
            }

            if (root.right != null) {
                queue.add(root.right);
            }
        }
    }

    public int depth() {
        return depthHelper(root);
    }

    private int depthHelper(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(depthHelper(root.left), depthHelper(root.right)) + 1;
    }
}
