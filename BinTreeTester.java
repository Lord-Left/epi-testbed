public class BinTreeTester {

    public static void main(String[] args) {

        BinaryTree<Integer> testTree = new BinaryTree(10);
        testTree.add(22, testTree.root);
        testTree.add(56, testTree.root);
        testTree.add(245, testTree.root);
        testTree.add(88, testTree.root);
        testTree.inOrderPrint(testTree.root);
    }
    
}