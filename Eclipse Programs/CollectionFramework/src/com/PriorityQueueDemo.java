package com;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.add(3);
	pq.add(1);
	pq.add(2);
	pq.add(5);
	pq.add(2);
	System.out.println(pq);
	System.out.println("Poll - Retrieve "+pq.poll());
	System.out.println(pq);
	System.out.println("Poll - Retrieve "+pq.poll());
	System.out.println(pq);

	}

}
