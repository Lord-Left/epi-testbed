/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BinaryTreeGen {
    public TreeNode sortedArrayToBST(int[] nums) {
        
    }
    
    
    public TreeNode bstGen(int[] arr, int leftStart, int rightEnd) {
        
        int mid = (leftStart + rightEnd) / 2;
        
        TreeNode root = new TreeNode(arr[mid]);
        
        if(leftStart > rightEnd) {
            return null;
        } else if (leftStart == rightEnd) {
            return new TreeNode(arr[leftStart])
        } else {
            root.left = bstGen(arr, leftStart, mid-1);
            root.right = bstGen(arr, mid+1, rightEnd);
        }
        
        return root;
        
    }
    
    public void addBST(TreeNode t, int v) {
        
        TreeNode node = new TreeNode(v);
        
        if(t == null) {
            t = node;
        } else if(t.val > v) {
            addBST(t.left, v);
        } else {
            addBST(t.right, v);
        }
    }
}