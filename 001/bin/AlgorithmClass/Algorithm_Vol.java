import java.util.Scanner;

public class Algorithm_Vol {
	static String randstring = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz가나다라마바사아자차카타파하123456789";
	static int rand = (int)(Math.random()*50+1); 
	static int[] arrayint = new int[7];
	static String[] strarr = new String[7];
	public static void main(String[] args) {
		int i,j,m,userinput;
		Scanner scanner = new Scanner(System.in);
		int tempint = 0;
		String tempstring = "";
		
		while(true){
			
			System.out.println("\n1. Integer Selection Sort  \n2. String Selection Sort \n3. Integer Selection Sort 2D \n"
					+ "4. String Selection Sort 2D \n5. Quick Sort \n6. Integer SequenceSearch \n7. String SequenceSearch \n8. Exit");
			userinput = scanner.nextInt();
			
		switch (userinput) {
		case 1:
			System.out.println("Randomly Generated Numbers \n");
			for (i = 0; i < arrayint.length; i++) {
				arrayint[i]=(int)(Math.random()*10000);
				System.out.println(arrayint[i]);
			}
			System.out.println("");
			
			for (i = 0; i  < arrayint.length;  i++) {
				for (j = 0;  j <arrayint.length ;  j++) {
					if (arrayint[i]<arrayint[j]) { // '<' ASC, '>' DESC
						tempint = arrayint[i];
						arrayint[i]=arrayint[j];
						arrayint[j]= tempint;
					}
					}
				System.out.println("Selecetion Sort "+(i+1)+" (ASC)\n");
				for (tempint= 0; tempint < arrayint.length; tempint++) {
					System.out.println(arrayint[tempint]);
				}
				System.out.println("");
				}
			
			System.out.println("\nAscending Sort"+"\n");
			for (j =  0; j  < arrayint.length; j++) 
				System.out.println(arrayint[j]);
			
			System.out.println("\nDecending Sort"+"\n");
			for (j =  arrayint.length-1; j  >= 0; j--) 
				System.out.println(arrayint[j]);
			
			break;
		case 2:
			System.out.println("Randomly Generated String \n");
			
			for (j = 0; j < strarr.length; j++) {
				for (i = 0;  i<rand; i++) 
					strarr[j] ="";
				for (i = 0;  i<rand; i++) 
					strarr[j] += randstring.charAt((int)(Math.random()*randstring.length()));
			}
			
			for (j = 0; j < arrayint.length; j++) {
				System.out.println(strarr[j]);
			}
			System.out.println("");
			
			for (i = 0; i  < strarr.length;  i++) {
				for (j = 0;  j <strarr.length ;  j++) {
					if (strarr[i].charAt(0)<strarr[j].charAt(0)) { // '<' ASC, '>' DESC
						tempstring = strarr[i];
						strarr[i]=strarr[j];
						strarr[j]= tempstring;
					}
					else if (strarr[i].charAt(0)==strarr[j].charAt(0)) { 	
					}
					}
				System.out.println("Selecetion Sort "+(i+1)+" (Decending)\n");
				for (int k = 0; k < arrayint.length; k++) {
					System.out.println(strarr[k]);
				}
				System.out.println("");
				}
			
			System.out.println("\nDecending Sort"+"\n");
			for (j =  arrayint.length-1; j  >= 0; j--) 
				System.out.println(strarr[j]);
			
			System.out.println("\nAscending Sort"+"\n");
			for (j =  0; j  < arrayint.length; j++) 
				System.out.println(strarr[j]);
		
			break;

		case 3:
			
			break;

		case 4:
			
			break;

		case 5:
			
			break;

		case 6:
			
			break;

		case 7:
			
			break;
		case 8:
			System.exit(0);

		default:
			break;
		}
		}
		
		
		
	}

}
