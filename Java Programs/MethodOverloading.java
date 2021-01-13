class Cal {
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(float a, float b) {
		System.out.println(a+b);
	}
	void add(String s1, String s2) {
		System.out.println(s1+s2);
	}
}
class MethodOverloading {
	public static void main(String args[]) {
	Cal cc = new Cal();
	cc.add(1,2,3);
	cc.add(10,20);
	cc.add("10","20");
	}
}