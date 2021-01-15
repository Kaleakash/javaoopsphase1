package com;
class A extends  Thread{
		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("i="+i);
			}
		}
}
class B extends Thread {
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j="+j);
		}
	}
}
public class ExtendsThreadClassDemo {

	public static void main(String[] args) {
		A obj1 = new A();			//obj1 indirectly Thread class reference. 
		B obj2 = new B();			// obj2 indirectlu Thread class reference. 
		obj1.start();
		obj2.start();                 // ready to run Runnable State 
	}

}
