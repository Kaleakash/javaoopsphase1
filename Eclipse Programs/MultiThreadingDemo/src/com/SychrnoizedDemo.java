package com;
class Booking implements Runnable {
	int avl = 1;
	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
	if(avl==1) {
		System.out.println(name+" got the ticket");
		avl = avl-1;
	}else {
		System.out.println(name+" sorry no ticket");
	}
	}
}
public class SychrnoizedDemo {

	public static void main(String[] args) {
	Booking b1 = new Booking();	
	Thread t1 = new Thread(b1);
	Thread t2 = new Thread(b1);
	Thread t3 =new Thread(b1);
	t1.setName("Ravi");
	t2.setName("Ramesh");
	t3.setName("Ajay");
	t1.start();
	t2.start();
	t3.start();
	}

}
