public class BinaryTree<T> {

	public BinaryTreeNode root; // currently null

	class BinaryTreeNode<T>{
		public T data;
		public BinaryTreeNode left, right; // initalized to null

		public BinaryTreeNode() {

		}

		public BinaryTreeNode(T d) {
			data = d;
		}
	}

	BinaryTree(T d) {

		// initalize root
		root = new BinaryTreeNode<>(d);
	}

	// recursive addition function

	public void add(T d, BinaryTreeNode n) {

		if (n == null) {
			n = new BinaryTreeNode(d);
			return; 
		} else if(n.left == null) {
			n.left = new BinaryTreeNode(d);
		} else if (n.right == null) {
			n.right = new BinaryTreeNode(d);
		} else {
			// n and child nodes are full. now we recurse
			add(d, n.left);
			add(d, n.right);
		}

	}

	public void inOrderPrint(BinaryTreeNode n) {
		
		if(n == null) {
			return;
		}

		inOrderPrint(n.left);
		System.out.println(n.data);
		inOrderPrint(n.right);
	}
}
