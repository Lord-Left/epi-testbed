// singly linked list

public class NodeList {

    class Node {
        public Node next;
        public int data; 

        public Node() {

        }

        public Node(int x) {
            data = x; 
        }
    }

    public Node head; // head = null. it is not even a node object!

    public NodeList(int num) {

        head = new Node(num);
    }

    public void addNode(int num) {

        Node added = new Node(num);
        added.next = head.next;
        head.next = added; 
    }
    
    public void printList() {

        Node traverser = head;

        System.out.print("[ ");
        while(traverser != null) {
            System.out.print(traverser.data + " ");
            traverser = traverser.next;
        }
        System.out.print("]");

    }

    // use to test link list cycles
    public void cycleAdd(Node prev, Node nxt) {
        prev.next = nxt;
    }

    public void cycleDetector(Node h) {
        Node fast = head; // 2 steps at a time
        Node slow = head; // 1 step at a time

        while(fast != null) {

            if(fast.next == slow) {
                System.out.println("Cycle Detected!");
                break; 
            } else {
                fast = fast.next.next;
                slow = slow.next; 
            }
        }

        // why are we here in the code? did we break out or is the list acyclic? a final check
        if(fast == null) {
            System.out.println("Linked List is Acyclic");
        }

        
    }




}