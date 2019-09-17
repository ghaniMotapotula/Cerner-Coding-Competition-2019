//cerner_2^5_2019

import java.util.Scanner;

public class PrimeNo {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter number to check if it's prime");
		int i, m = 0;
		boolean flag = true;
		int n = in.nextInt();
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(n + " is prime number");
			}
		}
		in.close();
	}
}
