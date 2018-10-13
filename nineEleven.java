public class nineEleven {	
	public static void main(String[] args) {
		// BST Problem Scaffolding

		BinaryTreeNode bst1 = new BinaryTreeNode(1, null, null);


	}

	public static List<Integer> inorderTraversal(BinaryTree<Integer> tree) {
		BinaryTree<Integer> prev = null; curr = tree;

		if(curr.parent == prev) {
			if(curr.left != null) {
				next = curr.left;
			} else {
				result.add(curr.data);
				next = (curr.right != null) ? curr.right : curr.parent;
			}
		} else if (curr.left == prev) {
			result.add(curr.data);
			// Done with left, so go right if right is not empty

			next = (curr.right != null) ? curr.right : curr.parent;
		} else {
			next = curr.parent;
		}
		prev = curr;
		curr = next;
	}
	return result;
}
