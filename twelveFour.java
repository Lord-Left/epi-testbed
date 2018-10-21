/* program to compute 'last common ancestor' of two nodes */

import java.util.*;

public class twelveFour {
	
		public static void main(String[] args){
		


		
		}

		public static Node nodeComparator(Node a, Node b) {

			HashMap<Node, Node> nodeTracker = new HashMap<>();

			nodeTracker.put(a, a.parent);
			nodeTracker.put(b, b.parent);

			Node node = null;
			Node parentCandidateA = nodeTracker.get(a);
			Node parentCandidateB = nodeTracker.get(b);



			while(!Object.equals(parentCandidateA, parentCandidateB)) {
				a = a.parent;
				nodeTracker.put(a, a.parent);
				if (Object.equals(nodeTracker.get(a), parentCandidateB) {
					node = parentCandidateB;
					break;
				}
				b = b.parent;
				nodeTracker.put(b, b.parent);
				if (Object.equals(nodeTracker.get(b), parentCandidateA) {
					node = parentCandidateB;
					break;
				}

			}


			return node;

		}
}
