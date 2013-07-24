package com.qsoft.singlelinkedlist;

import java.util.ArrayList;

import junit.framework.TestCase;
import android.util.Log;

public class SingleLinkedListTest extends TestCase {

	// private List<Node> listObject;
	private SingleLinkedList newList;

	// 1 - New list should have zero element
	public void testNewLinkedListShouldBeEmpty() {
		SingleLinkedList newList = new SingleLinkedList();
		assertTrue(newList.isEmpty());
	}

	// 2 - Create new LinkedList from an array of Objects
	public void testNewLinkedListFromArray() {
		createList();
		assertEquals(5, newList.listSize());
	}

	// 3 - The method listSize() should return the number of elements in the
	// list
	public void testMethodListSizeShouldReturnTheNumberOfElementInList() {
		createList();
		assertEquals(5, newList.listSize());
	}

	// 4 - Test get existing Node at specified position
	public void testGetExistedElement() {
		createList();

		Node node = newList.getNode(2);

		assertEquals("value", node.getValue());
		Log.e("Test 4", node.getNextNode() + "");
		assertTrue(3 == node.getNextNode());
	}

	// 5 - Insert new element after node n
	public void testInsertNewElementAfterNodeN() {
		createList();

		int position = 3;
		Node newNode = new Node("This is new Node", null);

		newList.insertAfter(position, newNode);

		Node test = newList.getNode(position + 1);
		assertEquals(newNode.getValue(), test.getValue());
	}

	private void createList() {
		Log.e("Test", "Create list");
		ArrayList<Node> listObject = new ArrayList<Node>();
		listObject.add(new Node("value", 1));
		listObject.add(new Node("value", 2));
		listObject.add(new Node("value", 3));
		listObject.add(new Node("value", 4));
		listObject.add(new Node("value", null));

		newList = new SingleLinkedList(listObject);
	}

}
