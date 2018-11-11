public static BstNode<Integer> wrapperFunc(List<Integer> sequence {

		return recursiveBSTBuilder(List<Integer> s, 0, seq.size());
}

public static BstNode<Integer> recursiveBSTBuilder(List<Integer> seq, int start, int end) {

		// cycle to first number that is greater than root in pre-order traversal
		int transition = start + 1;


		// note that .get takes in an index. So you can cycle through a list in a manner akin to an array!
		while(transition < end && (Integer.compare(seq.get(transition), seq.get(transition)) < 0)) { // note that .compare returns an int - if lower than 0, then transition is lesser than the 2nd arg!

				++transition; // why increment prior to evaluating? isn't it irrelevant? it'll be evaluated and then the while loop will act on that incremented version of the value
		}

		// now that we have the transition point, we will perform this very same operation recursively!

		return BstNode<Integer>(seq.get(0), recursiveBSTBuilder(seq, start + 1, transition), recursiveBSTBuilder(seq, transition, end)); // the BST constructor takes 3 arguments, root, left child, right child!

}


