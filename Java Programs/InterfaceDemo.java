interface Abc {
	int a=10;
	void dis1();
}
interface Mno {
	int b=20;
	void dis2();
}
interface Xyz extends Abc,Mno{
	int c=30;
	void dis3();
}	
class Demo implements Abc,Mno {
	public void dis1() {
		System.out.println("Abc interface method");
	}
	public void dis2() {
		System.out.println("Mno interface method");
	}
}
class InterfaceDemo {
	public static void main(String args[]) {
	Demo obj = new Demo();
	obj.dis1();
	obj.dis2();	
	}
}
