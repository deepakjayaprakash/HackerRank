package DaysofCode30;
import java.util.*;


class TreeNode{
    TreeNode left,right;
    int data;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}


public class BinarySearchTree {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         int T=sc.nextInt();
         TreeNode root=null;
         while(T-->0){
             int data=sc.nextInt();
             root=insert(root,data);
         }
         int height=getHeight(root);
         System.out.println(height);

	}
	public static int getHeight(TreeNode root){
		int height=0;
		
		if(root==null)
			return 0;
		else
			height=1+Math.max(getHeight(root.left),getHeight(root.right));
		
		return height;
	     
	}
		
	
	public static TreeNode insert(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        else{
            TreeNode cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	static void levelOrder(TreeNode root){
	     Queue q=(Queue) new LinkedList();
	     ArrayList<TreeNode>l=new ArrayList<TreeNode>();
	     q.add(root);
	     l.add(root);
	     /*while(q.isEmpty()==false){
	    	 TreeNode temp=(TreeNode) q.peek();
	    	 System.out.print(temp.data+" ");
	    	 if(temp.left!=null)
	    		 q.add(temp.left);
	    	 else if(temp.right!=null)
	    		 q.add(temp.right);
	    	 q.remove();
	    		 	
	     }*/
	     
	     while(l.size()!=0){
	    	 TreeNode temp=l.get(0);
	    	
	    	 System.out.println(temp.data+" ");
	    	 if(temp.left!=null)
	    		 l.add(temp.left);
	    	 if(temp.right!=null)
	    		 l.add(temp.right);
	    	
	    	 l.remove(0);
	    	 
	     }
	      
	    }

}
