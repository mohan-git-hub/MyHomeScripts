package com.mypractice;

public class BinaryTree {

	Node root;
	
/*	BinaryTree(int key){
		root = new Node(key);
	}
*/	BinaryTree(){
		root = null;
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(10);
		tree.root.left.left = new Node(4);
		tree.root.right.right = new Node(15);
		System.out.println(tree.root.right.right.key);
	}
	
}