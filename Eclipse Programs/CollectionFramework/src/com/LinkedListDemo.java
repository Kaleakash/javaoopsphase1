package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		System.out.println(ll);
		ll.add(1, 10);
		System.out.println(ll);
		ll.addFirst(123);
		ll.addLast(456);
		System.out.println(ll);
	}

}
