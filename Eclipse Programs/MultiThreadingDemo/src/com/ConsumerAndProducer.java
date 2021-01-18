package com;
class Work {
		int n;
		boolean flag = false;
		synchronized int get() {
				if(!flag) {
					try {
						wait();
						Thread.sleep(2000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				System.out.println("Got it "+n);
				flag = false;
				notify();
				return n;
		}
		synchronized void put(int n) {
				
			if(flag) {
				try {
					wait();
					Thread.sleep(2000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				}
			this.n = n;
			System.out.println("Put it "+n);
			flag = true;
			notify();
		}
}
class Consumer implements Runnable {
	Work ww;
	public Consumer(Work ww) {
		this.ww = ww;
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		int n=0;
		while(n<=10) {
			System.out.println(ww.get());
			n++;
		}
		
	}
}
class Producer implements Runnable {
	Work ww;
	public Producer(Work ww) {
		// TODO Auto-generated constructor stub
		this.ww = ww;
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		int n=0;
		while(n<=10) {
			ww.put(n);
			n++;
		}
		
	}
}
public class ConsumerAndProducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Work ww = new Work();
		Producer p = new Producer(ww);
		Consumer c = new Consumer(ww);
	}

}
