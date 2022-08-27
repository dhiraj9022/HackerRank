package hackerrank.daySeven;

import java.util.Scanner;

public class PearsonCoefficientI {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] x = new double[n];
		double[] y = new double[n];
		double sumX = 0;
		double sumY = 0;
		double meanX = 0;
		double meanY = 0;
		double stdX = 0;
		double stdY = 0;

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextDouble();
			sumX += x[i];

		}

		for (int j = 0; j < n; j++) {
			y[j] = sc.nextDouble();
			sumY += y[j];

		}

		meanX = sumX / n;
		meanY = sumY / n;

//		System.out.format("%.3f%n", sumX);
//		System.out.format("%.3f%n", sumY);

//		System.out.format("%.3f%n", meanX);
//		System.out.format("%.3f%n", meanY);

		stdX = Math.sqrt(standardDeri(x, meanX) / n);
		stdY = Math.sqrt(standardDeri(y, meanY) / n);

//		System.out.format("%.3f%n", stdX);
//		System.out.format("%.3f%n", stdY);

		double pXY = 0;

		for (int i = 0; i < n; i++) {
			pXY += (x[i] - meanX) * (y[i] - meanY);
		}

		System.out.format("%.3f%n", pXY / (n * stdX * stdY));
	}

	static double standardDeri(double[] list, double mean) {

		double result = 0;
		for (int k = 0; k < list.length; k++) {
			result = result + Math.pow((list[k] - mean), 2);
		}
		return result;
	}
}
