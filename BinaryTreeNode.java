public class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode<T> left, right;

	BinaryTreeNode(T d, BinaryTreeNode<T> l, BinaryTreeNode<T> r) {

		data = d;
		left = l;
		right = r;
	}
}
