public class Graph {

    // Attributes of Graph
    public Node[] nodeList;

    class Node {
        public int data;
        public Node[] children

        public Node(int d, List<Node> neighbors) {
            data = d;
            AdjacentNodeList = neighbors;
        }
    }

    public Graph(int d, List<Node> neighbors) {
        
        start = new Node(d, neighbors);

    }
}