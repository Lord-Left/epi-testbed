import java.awt.MultipleGradientPaint.CycleMethod;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {

    // Attributes of Graph
    public Node[] nodeList;

    public static class Node {
        public int data;
        public LinkedList<Node> neighbors;

        public Node(int d) {
            this.data = d;
            this.neighbors = new LinkedList<>();
        }
    }

    public Graph(int d) {
        
    }

    // Breadth-first search - recursive implementation
    public static boolean dfs(Node current, Node destination, HashSet<Integer> hasVisited) {

        if(hasVisited.contains(current.data)) {
            return false; 
        }
        hasVisited.add(current.data);

        // recursive base case 
        if(current == destination) {
            return true;
        }

        // add current to hasVisited

        for(Node e : current.neighbors) {
            if(dfs(e, destination, hasVisited)) {
                return true;
            }
        }

        return false;
    }

    public static boolean bfs(Node current, Node destination) {
        
        LinkedList<Node> visitNext = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();

        visitNext.add(current);

        while(!visitNext.isEmpty()) {
            Node node = visitNext.remove();

            if (node == destination) {
                return true;
            }

            if (visited.contains(node.data)) {
                continue; 
            }
            visited.add(node.data);

            // enhanced for loop to visit neighbors
            for(Node e : node.neighbors) {
                visitNext.add(e);
            }
        }

        return false; 




    }



    public static void main(String[] args) {

        Node n1 = new Node(1); 
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n8 = new Node(8);

        // establish connections
        n1.neighbors.add(n2);
    
        n2.neighbors.add(n1);
        n2.neighbors.add(n4);
        n2.neighbors.add(n5);
        n2.neighbors.add(n3);

        n3.neighbors.add(n1);
        n3.neighbors.add(n5);

        n4.neighbors.add(n2);

        n5.neighbors.add(n2);
        n5.neighbors.add(n3);

    

        // test depth-first search
        HashSet<Integer> hV = new HashSet<>();
        System.out.println(dfs(n1,n5,hV));
        System.out.println(bfs(n1,n5));


    }


} 