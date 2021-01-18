package com;

class Task implements Runnable {
	@Override
	public void run() {
	String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			try {
				System.out.println(name+" "+i);
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
public class MoreThreadInSameMemory {

	public static void main(String[] args) {
	Task tt = new Task();
	Thread t1 = new Thread(tt);
	Thread t2 = new Thread(tt);
	Thread t3 = new Thread(tt);
	t1.setName("Raj");
	t2.setName("Ramesh");
	t3.setName("Rajesh");
	t1.start();
	t2.start();
	t3.start();
	}

}
