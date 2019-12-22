import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root){
      //Write your code here

      //if node root is not == null than go into
      
    }

    //this is for practice, im am going to be trying the other types of traversals i try levelorder

    //for in order traversal
    public static void inOrderTraversal(Node root) {

        if (root != null) { // this will make sure that we are not accessing a dead-end

            inOrderTraversal(root.left); //because the left side is always acessed first. the left-most node is accessed first, then its parent, then the right, then the grandparent..and so on..
            
            System.out.println(root.data);

            inOrderTraversal(root.right);
        }

    } 
    //for decending order
    public static void reverseOrderTraversal(Node root) {

        if (root != null) {
            reverseOrderTraversal(root.right);
            
             System.out.println(root.data);

             reverseOrderTraversal(root.left);
           
        }

    }
    //preorder traversal
    public static void preorderTraversal(Node root) {
        if(root != null) {
            System.out.println(root.data);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    //postodertraversal
    public static void postorderTraversal(Node root) {
        if(root != null) {
            preorderTraversal(root.left);
            preorderTraversal(root.right);
            System.out.println(root.data);
        }
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

            reverseOrderTraversal(root);
            // levelOrder(root);
            sc.close();
    }	
}