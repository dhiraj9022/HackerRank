package hackerrank.dayZero;

import java.util.Arrays;
import java.util.Scanner;

public class meanMedianMode {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		double mean = 0;
		double median = 0;
		double mode = 0;

		// mean
		for (int j = 0; j < n; j++) {
			mean = (mean + arr[j]);
		}
		System.out.println(mean / n);

		// median
		if (n % 2 == 0) {
			median = (arr[n / 2] + arr[(n / 2) - 1]) / 2;
		} else {
			median = arr[n / 2];
		}
		System.out.println(median);

		// mode

		double maxCount = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mode = arr[i];
			}
		}
		System.out.println(mode);
	}
}