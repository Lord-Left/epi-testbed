public class BinTreeTester {

    public static void main(String[] args) {

        BinaryTree<Integer> testTree = new BinaryTree(10);
        testTree.add(22, testTree.root);
        testTree.add(56, testTree.root);
        testTree.add(245, testTree.root);
        testTree.add(88, testTree.root);
        testTree.add(21, testTree.root);
        testTree.add(8, testTree.root);
        System.out.println("---- LDR ----");
        testTree.inOrderPrint(testTree.root);
        // System.out.println("---- BFS ----");
        // testTree.bFS(testTree.root, true);
        testTree.mirrorTree(testTree.root);
        System.out.println("---- LDR - INVERT ----");
        testTree.inOrderPrint(testTree.root);


    }
    
}