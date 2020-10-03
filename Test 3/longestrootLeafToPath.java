import java.util.ArrayList;
import java.util.*;

public class Solution {

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
//     public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
//         //base case
//         if(root==null)
//             return null;  // note this is null type arraylist
        
//         //base case 2 if got data simply add it in arraylist and return;
//         if(root.data==data){
//             ArrayList<Integer> output = new ArrayList<>();
//             output.add(data);
//             return output;
//         }
//         // recursive calling based on values
//         ArrayList<Integer> output = new ArrayList<>();
//         if(data>root.data){
//             output = findPath(root.right,data);
//             // if(output is not null add it to arraylist)
//             if(output!=null){
//                 output.add(root.data);
//             	return output;
//             }
//         }
//         else{
//             output = findPath(root.left,data);
//             if(output!=null){
//                 // if(output is not null add it to arraylist)
//                 output.add(root.data);
//                 return output;
//             }
//         }
//         return output;
//
    
    
    public static int height(BinaryTreeNode<Integer> root) {
        
         if(root==null)
            return 0;
        int left =height(root.left);
        int right = height(root.right);
        return  1 + Math.max(left,right);
    }
        
    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root, ArrayList<Integer> ans){
        // base case if root null return the arraylist as it is
        if(root==null)
            return ans;
        // add root to arraylist because we to move the leaf via root;
        ans.add(root.data);
        //finding height so that we can call recursion on longest sub tree
        int left = height(root.left);
        int right=height(root.right);
        // calling recursion on longest sub tree
        if(left>right){
            ans = longestRootToLeafPath(root.left,ans);
        }
        else{
            ans = longestRootToLeafPath(root.right,ans);
        }
        // returninh ans;
        return ans;
        
    }
    
    
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){

    	ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> abc = longestRootToLeafPath(root,a);
        Collections.reverse(abc);
        return abc;
        // reversing
        // ArrayList<Integer> rev = new ArrayList<Integer>();
        // int k=0;
        // for(int i=abc.size()-1;i>=0 && k<abc.size();i--){
        //     rev.add(i)=abc.get(k);
        // }
        // return rev;
        
    
		// Write your code here
		
	}

	
	
}
