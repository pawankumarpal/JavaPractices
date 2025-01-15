package trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import trees.Tree.Node;

public class RightSideView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.right = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.left.left = new Node(5);
		
		System.out.println(rightSideView(root));

	}
    public static List<Integer> rightSideView(Node root) {
        List<Integer> rightView = new ArrayList<>();
        if (root == null) return rightView;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
            	Node current = queue.poll();
                // Add the rightmost element of the level to the result
                if (i == levelSize - 1) {
                    rightView.add(current.key);
                }
                // Add left and right children to the queue
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
        }

        return rightView;
    	
        /**List<Integer> rightView= new ArrayList<Integer>(); 
        if(root==null) return rightView;

        Stack<Node> stk = new Stack<Node>();
        stk.push(root);
        stk.push(null);
        while(!stk.isEmpty()){
        	Node curr =stk.pop();
        	Node left = null;
        	Node rights = null;
        	Node leftLeft = null;
        	Node leftRight = null;
            if(curr ==null && !stk.isEmpty()){
                curr=stk.pop();
                left = curr.left;
                rights = curr.right;
                rightView.add(curr.key);
                if(curr !=null && !stk.isEmpty()){
                    curr = stk.pop();
                    leftLeft = curr.left;
                    leftRight = curr.right;
                    if(leftLeft !=null) stk.push(leftLeft);
                    if(leftRight !=null) stk.push(leftRight);
                }
            }
            if(left !=null) stk.push(left);
            if(rights !=null) stk.push(rights);
            if(left !=null || rights !=null|| leftLeft !=null || leftRight!=null) 
            stk.push(null);
        }
        System.out.println(rightView);
        return rightView;*/
    }



}
