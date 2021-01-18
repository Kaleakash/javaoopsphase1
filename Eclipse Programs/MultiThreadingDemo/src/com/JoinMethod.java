package com;

class Bike1 implements Runnable{
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
class Bike2 implements Runnable {
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
public class JoinMethod {

	public static void main(String[] args) throws Exception {
		Bike1 obj1 = new Bike1();
		Bike2 obj2 =new Bike2();
		Thread t1  = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.setName("Bike1");
		t2.setName("Bike2");
		System.out.println("1...");
		Thread.sleep(1000);
		System.out.println("2...");
		Thread.sleep(1000);
		System.out.println("3...");
		Thread.sleep(1000);
		System.out.println("Game Start......");
		t1.start();
		t2.start();
		t2.join();
		t1.join();
		System.out.println("Game End......");
	}

}
