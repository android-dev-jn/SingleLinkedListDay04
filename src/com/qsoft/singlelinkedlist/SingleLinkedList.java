package com.qsoft.singlelinkedlist;

import java.util.ArrayList;

public class SingleLinkedList {

	private ArrayList<Node> list;
	private int firstElement;

	public SingleLinkedList(ArrayList<Node> listObject) {
		this.list = listObject;
		this.firstElement = 0;
	}

	public SingleLinkedList() {
		this.list = new ArrayList<Node>();
		this.firstElement = 0;
	}

	public boolean isEmpty() {
		return this.list.size() == 0;
	}

	public int listSize() {
		return this.list.size();
	}

	public Node getNode(int position) {
		Node iter = this.list.get(firstElement);
		if (position == firstElement) {

		} else {
			while (iter.getNextNode() != position) {
				iter = this.list.get(iter.getNextNode());
			}
			iter = this.list.get(iter.getNextNode());

		}
		return iter;
	}

	public void insertAfter(int position, Node newNode) {

	}
}
