public class Main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(4);
        tree.insert(9);
        tree.inOrderTraversal();
        System.out.println("\n" + tree.count());
        System.out.println(tree.height());
    }

}
