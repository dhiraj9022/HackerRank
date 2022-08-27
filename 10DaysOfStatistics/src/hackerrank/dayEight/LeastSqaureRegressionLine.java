package hackerrank.dayEight;

import java.util.Scanner;

public class LeastSqaureRegressionLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 5;
		int[] x = new int[5];
		int[] y = new int[5];
		double b = 0;
		double a = 0;
		double result = 0;

		for (int i = 0; i < 5; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		double r1, r2;
		r1 = ((5 * sumXY(x, y, n)) - (sumX(x, n) * sumY(y, n)));
		r2 = (5 * sumX2(x, n)) - (Math.pow(sumX(x, n), 2));

		b = r1 / r2;
		a = (sumY(y, n) / 5) - (b * sumX(x, n) / 5);
		result = a + b * 80;

		System.out.format("%.3f%n", result);

	}

	static double sumX(int x[], int n) {

		double sumX = 0;

		for (int i = 0; i < n; i++) {
			sumX += x[i];
		}
		return sumX;
	}

	static double sumY(int y[], int n) {

		double sumY = 0;
		for (int i = 0; i < n; i++) {
			sumY += y[i];
		}
		return sumY;
	}

	static double sumXY(int x[], int[] y, int n) {

		double sumXY = 0;
		for (int i = 0; i < n; i++) {
			sumXY += (x[i] * y[i]);
		}
		return sumXY;
	}

	static double sumX2(int x[], int n) {

		double powX = 0;
		for (int i = 0; i < n; i++) {
			powX = powX + Math.pow(x[i], 2);
		}
		return powX;
	}

}