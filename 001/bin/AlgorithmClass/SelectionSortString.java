package AlgorithmClass;



public class SelectionSortString {

	public static void main(String[] args) {
		String[] array = new String[7];
		int i, j;
		String tmp;
		int rand = (int)(Math.random()*50+1); 
		String abc1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
		System.out.println("Randomly Generated String \n");
		
		for (j = 0; j < array.length; j++) {
			for (i = 0;  i<rand; i++) 
				array[j] ="";
			for (i = 0;  i<rand; i++) 
				array[j] += abc1.charAt((int)(Math.random()*abc1.length()));
		}
		
		for (j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
		System.out.println("");
		
		for (i = 0; i  < array.length;  i++) {
			for (j = 0;  j <array.length ;  j++) {
				if (array[i].charAt(0)<array[j].charAt(0)) { // '<' ASC, '>' DESC
					tmp = array[i];
					array[i]=array[j];
					array[j]= tmp;
				}
				else if (array[i].charAt(0)==array[j].charAt(0)) { 	
				}
				}
			System.out.println("Selecetion Sort "+(i+1)+" (Decending)\n");
			for (int k = 0; k < array.length; k++) {
				System.out.println(array[k]);
			}
			System.out.println("");
			}
		
		System.out.println("\nDecending Sort"+"\n");
		for (j =  array.length-1; j  >= 0; j--) 
			System.out.println(array[j]);
		
		System.out.println("\nAscending Sort"+"\n");
		for (j =  0; j  < array.length; j++) 
			System.out.println(array[j]);
	}
	
}

