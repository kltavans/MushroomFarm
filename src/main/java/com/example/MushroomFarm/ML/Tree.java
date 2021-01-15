package com.example.MushroomFarm.ML;

public class Tree {

	private Node root;

	public Node getRoot() {
		return this.root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public String toString() {
		return "";
	}

	public void print() {
		root.print("", true);
	}

}
