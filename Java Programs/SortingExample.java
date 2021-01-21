class SortingExample {
	static void bubbleSort(int num[]) {
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			
		}
	}
	static void selectionSort(int num[]) {
		for(int i=0;i<num.length-1;i++) {
			int min = i;
			for(int j=i+1;j<num.length;j++) {
				if(num[j]<num[min]) {
					min = j;
				}
			}
			int temp = num[i];
			num[i]=num[min];
			num[min]=temp;
		}
	}
	static void insertionSort(int num[]) {
		for(int i=1;i<num.length;i++) {
			int key = num[i];
			int j=i-1;
				while(j>=0 && key< num[j]) {
					num[j+1]=num[j];
					--j;
				}
			num[j+1]=key;
		}
	}
	public static void main(String args[]) {
	int num[]={3,2,6,4,1,5,7};
	System.out.println("Before Sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	//bubbleSort(num);
	//selectionSort(num);
	insertionSort(num);
	System.out.println();
	System.out.println("After Sort");
	for(int n:num) {
		System.out.print(n+" ");
	}
	}
}