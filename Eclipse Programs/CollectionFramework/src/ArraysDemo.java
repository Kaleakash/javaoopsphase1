import java.util.Arrays;
import java.util.Collections;

public class ArraysDemo {

	public static void main(String[] args) {
		Integer abc[]= {3,1,6,8,4,5,9,7};
		System.out.println("Before Sort");
		for(int a:abc) {
			System.out.print(a+" ");
		}
		Arrays.sort(abc);
		System.out.println();
		System.out.println("After sort - Asc");
		for(int a:abc) {
			System.out.print(a+" ");
		}
		Arrays.sort(abc,Collections.reverseOrder());
		System.out.println();
		System.out.println("After Sort - Desc");
		for(int a:abc) {
			System.out.print(a+" ");
		}
	}

}
