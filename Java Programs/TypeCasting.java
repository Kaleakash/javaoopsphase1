class TypeCasting {
	public static void main(String args[]) {
	byte a =10;
	short b=a;		//Implicit type casting 
	System.out.println(a);
	System.out.println(b);
	short c = 10;
		// (type)variableName;
	byte d = (byte)c;		//Explicit type casting 
	System.out.println(c);
	System.out.println(d);
	}
}