package bst;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import bst.TreeNode.Node;
import trees.Tree;
public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =3;
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(6);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root .left.left.left = new Node(1);
		
		//System.out.println(kthSmallest(root, k));
	}
    public static int kthSmallest(Node root, int k) {
    	Deque<Integer> q  = new ArrayDeque<Integer>();
        if(root==null){
            return -1;
        }

       q=  inOrder(root, q);
       System.out.println(q);
       for(int i=0;i<k-1;i++) {
    	   //System.out.println("I:"+i);
     	  q.pop();

    	   //q.removeLast();
       }
       return q.pop();
    }

    public static Deque<Integer> inOrder(Node root, Deque<Integer> q){
        if(root ==null) return null;

        inOrder(root.left,q);
        //System.out.println(root.key);
        q.add(root.key);
        inOrder(root.right,q);
        
        return q;
    }

}
