package patterns;

import java.util.Scanner;

public class TreeWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a, b, c;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if (a < 10 && a > 0) {
			for (int i = 1; i <= a; i++) {
				for (int j = i; j < a; j++) {
					System.out.print(" ");

				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		if (b < 10 && b > 0) {
			for (int i = 1; i <= b; i++) {
				for (int j = i; j < b; j++) {
					System.out.print(" ");

				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}

		}
		if (c < 10 && c > 0) {
			for (int i = 1; i <= c; i++) {
				for (int j = i; j < c; j++) {
					System.out.print(" ");

				}
				for (int k = 1; k <= i; k++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}

		}
	}

}
