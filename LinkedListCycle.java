public class LinkedListCycle {

    public static void main(String[] args) {
        NodeList testList = new NodeList(41451);
        testList.addNode(23);
        // testList.printList();
        testList.cycleDetector(testList.head);


        // test cycles - should lead to infinite loop/time out
        testList.cycleAdd(testList.head.next, testList.head);
        testList.cycleDetector(testList.head);
        //testList.printList();
    }
}