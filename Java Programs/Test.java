class A {
	void dis1() {
		System.out.println("dis1() method");
	}
}
class B extends A{
	void dis2() {
		System.out.println("dis2() method");
	}
}
class Test {
	public static void main(String args[]) {
	A obj1 = new A();
	obj1.dis1();

	B obj2 = new B();
	obj2.dis2();
	obj2.dis1();		
	}
}