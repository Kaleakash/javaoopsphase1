package com;
class Sample implements Runnable {
	@Override
	public synchronized void run() {
	String name = Thread.currentThread().getName();
		for(int i=0;i<10;i++) {
			try {
				System.out.println(name+" "+i);
				Thread.sleep(1000);
							if(name.equals("Ajay") && i==5) {
								wait();
							}
							if(name.equals("Ramesh") && i==6) {
									notify();
									wait();
							}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class WaitAndNotifyExample {

	public static void main(String[] args) {
	Sample s = new Sample();
	Thread t1 = new Thread(s);
	Thread t2 = new Thread(s);
	Thread t3 = new Thread(s);
	t1.setName("Ajay");
	t2.setName("Ramesh");
	t3.setName("Lokesh");
	t1.start();
	t2.start();
	t3.start();
	}

}
