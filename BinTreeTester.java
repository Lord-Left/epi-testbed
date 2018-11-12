public class BinTreeTester {

    public static void main(String[] args) {

        BinaryTree<Integer> testTree = new BinaryTree(10);
        testTree.add(22, testTree.root);
        testTree.add(56, testTree.root);
        testTree.add(24553, testTree.root);
        testTree.inOrderPrint(testTree.root);
    }
    
}