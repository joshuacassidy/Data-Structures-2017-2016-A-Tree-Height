public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {

        if (isEmpty()) {
            root = new Node(data);
        } else {
            insert(data, root);
        }
    }


    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data, Node node) {
        if (data < node.getData()) {
            if (node.getLeft() != null) {
                insert(data, node.getLeft());
            } else {
                node.setLeft(new Node(data));
            }
        } else {
            if (node.getRight() != null) {
                insert(data, node.getRight());
            } else {
                node.setRight(new Node(data));
            }
        }
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node + " ");
            inOrderTraversal(node.getRight());
        }
    }

    public int count() {
        return count(root);
    }

    private int count(Node node) {
        if(node == null) {
            return 0;
        } else {
            return 1 + count(node.getLeft()) + count(node.getRight());
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        }
    }

    public Node getRoot() {
        return root;
    }
}
