package fundamentos02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[4];
		int d[] = new int[4];
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.printf("\nDigite o %d do array de A: ", i+1);
			a[i] = sc.nextInt();
			System.out.printf("\nDigite o %d do array de B: ", i+1);
			b[i] = sc.nextInt();
			System.out.printf("\nDigite o %d do array de C: ", i+1);
			c[i] = sc.nextInt();
			System.out.printf("\nDigite o %d do array de D: ", i+1);
			d[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));

	}

}
