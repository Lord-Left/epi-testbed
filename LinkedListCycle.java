public class LinkedListCycle {

    public static void main(String[] args) {
        NodeList testList = new NodeList(41451);
        testList.addNode(23);
        testList.addNode(45);
        testList.addNode(21);
        testList.addNode(8);



        testList.printList();
        // testList.cycleDetector(testList.head);

        testList.listReverse();
        testList.printList();


        // test cycles - should lead to infinite loop/time out
        // testList.cycleAdd(testList.head.next, testList.head);
        // testList.cycleDetector(testList.head);
        //testList.printList();
    }
}