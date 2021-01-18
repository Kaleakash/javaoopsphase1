package com;
class FirstThread implements Runnable{
	@Override
	public void run() {
		//Thread t = Thread.currentThread();
		String name = Thread.currentThread().getName();
		for(int i =0;i<10;i++) {
			System.out.println(name+" "+i);
			try {
				Thread.sleep(1000);	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
class SecondThread implements Runnable {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int j=0;j<10;j++) {
			System.out.println(name+" "+j);
			try {
				Thread.sleep(500);	
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class LifeCycleOfThread {

	public static void main(String[] args) {
	FirstThread first = new FirstThread();
	SecondThread second = new SecondThread();
	Thread t1 =new Thread(first);
	Thread t2 = new Thread(second);
	t1.setName("First Thread");
	t2.setName("Second Thread");
	System.out.println("First Thread "+t1.isAlive());
	System.out.println("Second Thread "+t2.isAlive());
	
	t1.start();
	t2.start();
	
	System.out.println("First Thread "+t1.isAlive());
	System.out.println("Second Thread "+t2.isAlive());
	}

}
