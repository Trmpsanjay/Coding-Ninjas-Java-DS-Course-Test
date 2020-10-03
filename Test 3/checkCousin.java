import java.util.ArrayList;


public class solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */
    
    //note copied soln
     static boolean ans = false;
    private static int check(BinaryTreeNode<Integer> root, int x, int y) {
        if (root == null)
            return -1;
        
        if (root.data == x || root.data == y)
            return 0;
        
        int l = check(root.left, x, y);
        int r = check(root.right, x, y);
        if (l > 0 && l == r)
            ans = true;
        return l >= 0 ? l + 1 : r >= 0 ? r + 1 : -1;
    }

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
    	check(root, p, q);
        return ans;
 
		// Write your code here

	}
}

