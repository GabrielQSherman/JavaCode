import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Main{

    //a recersive method is the best and most effcient way of find the height of binnay-search-tree
    //this is because each child node of a parent node is just a small version of a BST 
	public static int getHeight(Node root){
      if (root == null) { //this is for the case that a BST is empty, if it was just a root node and nothing else we would return 1
          return -1;
        
      } else { //this will handle the likely senerio that the BST is not empty and the child-nodes of the the root-node also have children
          return 1 + Math.max(getHeight(root.left), getHeight(root.right));
      } //the root node counts as one, and one is added every generation that is added onto there. there is built in math comparison Math.max that will handle both the right and left branches at the same time

    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            // System.out.println(data); //for testing
            
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
            sc.close();
    }	
}