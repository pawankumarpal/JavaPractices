package trees;

import trees.Tree.Node;

public class TreeCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(4);
		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(10);
		/**
		 * 			  3
		 * 		/		\
		 * 		2			7
		 * 	/		\	/		\
		 * 	1		4	6		10	
		 */
		System.out.println("INORDER TREVERSAL");
		InOrderTreverseTree(root);	

		System.out.println("PRE-ORDER TREVERSAL");
		PreOrderTreverseTree(root);	
		
		System.out.println("POST-ORDER TREVERSAL");
		PostOrderTreverseTree(root);
		
		System.out.println("SIZE of Tree");
		System.out.println(size(root));
		
		System.out.println("HEIGHT of Tree");
		System.out.println(height(root));
		
		System.out.println("MAXIMUM value from Tree");
		System.out.println(maxValue(root));
		
	}
	/*Treversal of Three Type 
	-Inorder- Roots will be Print in Between Left and Right.
	-PreOrder- Roots will be printed Pre of Left and right
	-Post Order- Root wll be printed post left, right
	*/
	
	//Inorder
	public static void InOrderTreverseTree(Node root) {
		if(root ==null) return ;
		InOrderTreverseTree(root.left);
		System.out.println(root.key);
		InOrderTreverseTree(root.right);
	
	}
	
	//Preorder
	public static void PreOrderTreverseTree(Node root) {
		if(root ==null) return ;
		System.out.println(root.key);
		PreOrderTreverseTree(root.left);
		PreOrderTreverseTree(root.right);
	
	}
	
	//PostOrder
	public static void PostOrderTreverseTree(Node root) {
		if(root ==null) return ;
		
		PostOrderTreverseTree(root.left);
		PostOrderTreverseTree(root.right);
		System.out.println(root.key);
	
	}
	//Size
	/**
	 * 
	 * @param root: Root of Tree
	 * @return: Size of tree
	 */
	public static int size(Node root) {
		if(root ==null) {
			return 0;
		}else {
			return 1+size(root.left)+ size(root.right);
		}

	}
	
	//MAX HIGHT
	/**
	 * 
	 * @param root: Root of Tree
	 * @return: Height of tree
	 */
	public static int height(Node root) {
		if(root==null) return 0;
		else {
			return 1+Math.max(height(root.left), height(root.right));
		}
	}
	
	//MAX VALUE
	/**
	 * 
	 * @param root: Root of tree
	 * @return: Maximum Value form tree
	 */
	public static int maxValue(Node root) {
		if(root ==null) {
			return Integer.MIN_VALUE;
		}
		else {
			return Math.max(root.key, Math.max(maxValue(root.left),maxValue(root.right)));
		}
	}

}
