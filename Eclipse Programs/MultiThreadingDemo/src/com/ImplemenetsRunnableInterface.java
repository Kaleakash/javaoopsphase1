package com;
class AA implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class BB implements Runnable {
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
		
	}
}
public class ImplemenetsRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA obj1 = new AA();
		BB obj2 = new BB();		
		Thread t1 =new Thread(obj1);
		Thread t2 = new Thread(obj2);			//t1 and t2 are Thread class reference. 
		t1.start();
		t2.start();	
		//t1.start();
	}

}
