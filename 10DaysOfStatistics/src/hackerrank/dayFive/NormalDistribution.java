package hackerrank.dayFive;

public class NormalDistribution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		double mean = 20;
		double stdDeri = 2;

		// caseI
		System.out.format("%.3f%n", cdf(mean, stdDeri, 19.5));

		// caseII
		System.out.format("%.3f%n", cdf(mean, stdDeri, 22) - cdf(mean, stdDeri, 20));

	}

	static double cdf(double mean, double stdDeri, double x) {

		return (0.5) * (1 + erf((x - mean) / (stdDeri * Math.sqrt(2))));

	}

	public static double erf(double z) {
		double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

		// use Horner's method
		double ans = 1 - t * Math.exp(-z * z - 1.26551223
				+ t * (1.00002368 + t * (0.37409196 + t * (0.09678418 + t * (-0.18628806 + t * (0.27886807
						+ t * (-1.13520398 + t * (1.48851587 + t * (-0.82215223 + t * (0.17087277))))))))));
		if (z >= 0)
			return ans;
		else
			return -ans;
	}
}