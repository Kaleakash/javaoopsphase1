class TypeCasting1 {
	public static void main(String args[]) {
	int a=10;
	float b=a;		//Implicit type casting 
	System.out.println(a);
	System.out.println(b);
	//float c = 10.10f;	//Explicit type casting 
	float c = (float)10.10;
	int d = (int)c;
	System.out.println(c);
	System.out.println(d);
	}
}