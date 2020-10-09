package Algorithm;

public class Quick_Sort {

	public static void main(String[] args) {
		int[] array = new int[7];
		int i,left, right, pivot;
		int temp = 0;
		
		System.out.println("Randomly Generated Numbers \n");
		for (i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*10000);
			System.out.println(array[i]);
		}	
		pivot = array[array.length-1];
		right = left = array[0];
		System.out.println("\n");
		for (i = 0; i< array.length-1; i++) {
			if (right<pivot ) {
				temp = right;
				right = left;
				left = temp;
				left = array[i+1];
				
			}
			right = array[i+1];
		}
		System.out.println("Quick Sort \n");
		for (temp= 0; temp < array.length; temp++) {
			System.out.println(array[temp]);
			}
		System.out.println("");
		
		
		
	}
}
