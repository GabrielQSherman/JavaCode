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
    //this was a challenge! LevelOrder 
	public static void levelOrderNonRecersive(Node root) {
        //you must make the linkedList a queue type and able to take the class 'Node'
        Queue<Node> q = new LinkedList<>(); //i ended up making the method queue based on the outline provided from HR
        q.add(root); //add the root node to the queue which will then add it left and right nodes in the while statment

        while (!q.isEmpty()) { //same as checking if the root contents != null
            Node currentNode = q.remove();
            System.out.println(currentNode.data); //print each number on a new line in the order 

            if (currentNode.left != null) q.add(currentNode.left);
            if (currentNode.right != null) q.add(currentNode.right);
        }
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
            // levelOrderNonRecersive(root);
            sc.close();
    }	
}