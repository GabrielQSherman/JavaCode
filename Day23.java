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

    public static void inorder(Node root) {

        if (Node root != null) {

            inorder(Node root);
            
            System.out.println(Node root);

            inorder(Node root);
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

            inorder(root);
            // levelOrder(root);
        }	
}