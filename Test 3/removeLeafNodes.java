
/*
class Solution{


	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root){
    	if(root==null)
        	return null;
    	// checking if no children then remove from children list
    	if(root.children.children.size()==0){
        	for(int i=0;i<root.children.size();i++){
            	root.children.remove(root.children.get(i));
        	}
    	}
    	for(int i=0;i<root.children.size();i++){
            root.children.remove(root.children.get(i));
        }
    	return root;
    }
    
}
*/
import java.util.ArrayList;
class Solution{


	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root){
    	if(root==null)
        	return null;
        if(root.children.size()==0)
            return null;
    	// checking if no children then remove from children list
    	// if(root.children.children.size()==0){
    	// for(int i=0;i<root.children.size();i++){
    	// root.children.remove(root.children.get(i));
    	// }
    	// }
        ArrayList<TreeNode<Integer>> temp= new ArrayList<TreeNode<Integer>>();
        
        // this is for each loop
    	for(TreeNode<Integer> i : root.children){
            if(i.children.size()!=0){
                temp.add(i);
                removeLeafNodes(i);                
            }
        }root.children=temp;
    	return root;
    }
    
}
