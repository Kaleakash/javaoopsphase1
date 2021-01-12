class ArrayDemo {
	public static void main(String args[]) {
	int abc[][]={{10,20},{30,40},{50,60}};
	System.out.println("Display values");
	/*System.out.println(abc[0][0]);
	System.out.println(abc[0][1]);
	System.out.println(abc[1][0]);
	System.out.println(abc[1][1]);
	System.out.println(abc[2][0]);
	System.out.println(abc[2][1]);*/
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<2;j++) {
			System.out.print(abc[i][j]);
			System.out.print(" ");
		}
		System.out.println();
	}
	}
}