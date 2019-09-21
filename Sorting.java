//cerner_2^5_2019

import java.util.Scanner;

public class Sorting {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int ar[] = new int[5];
		 boolean sorted = false;
		 int temp;
        System.out.println("Enter 5 number for sorting");
		for(int i = 0; i <5 ; i++){
			ar[i] = in.nextInt();
		}
	
		while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < ar.length - 1; i++) {
	            if (ar[i] > ar[i+1]) {
	                temp = ar[i];
	                ar[i] = ar[i+1];
	                ar[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
		for(int i : ar){
			 System.out.print(i);
		}
		in.close();
	}
}
