import java.util.ListNode;
import java.util.List;


public class sevenTen {
    public static void main(String[] args) {
        LinkedList<Integer> testList = new LinkedList<>();

        for(int i = 0; i < 10; i++) {
            testList.addLast(i);
        }
    }

    public static LinkedList<Integer> evenOdd(LinkedList<Integer> input) {

        Node evenTraverser = input.head();
        Node oddTraverser = evenTraverser.next();
        Node capture = oddTraverser;

        // even traverse
        while(evenTraverser.next.next != null) {
            evenTraverser.next = evenTraverser.next.next;
            evenTraverser = evenTraverser.next.next;
        }

        while(oddTraverser.next.next != null) {
            oddTraverser.next = oddTraverser.next.next;
            oddTraverser = oddTraverser.next.next;
        }

        evenTraverser.next = capture;

        


        return null;
    }
}