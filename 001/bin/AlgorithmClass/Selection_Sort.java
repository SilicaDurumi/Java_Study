package AlgorithmClass;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] array = new int[7];
		int i, j,tmp;
		
		System.out.println("Randomly Generated Numbers \n");
		for (i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*10000);
			System.out.println(array[i]);
		}
		System.out.println("");
		
		for (i = 0; i  < array.length;  i++) {
			for (j = 0;  j <array.length ;  j++) {
				if (array[i]<array[j]) { // '<' ASC, '>' DESC
					tmp = array[i];
					array[i]=array[j];
					array[j]= tmp;
				}
				}
			System.out.println("Selecetion Sort "+(i+1)+" (ASC)\n");
			for (tmp= 0; tmp < array.length; tmp++) {
				System.out.println(array[tmp]);
			}
			System.out.println("");
			}
		
		System.out.println("\nAscending Sort"+"\n");
		for (j =  0; j  < array.length; j++) 
			System.out.println(array[j]);
		
		System.out.println("\nDecending Sort"+"\n");
		for (j =  array.length-1; j  >= 0; j--) 
			System.out.println(array[j]);
	}
	
}

