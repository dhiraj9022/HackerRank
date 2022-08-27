package hackerrank.daySix;

public class CentralLimitTheoremII {
	public static void main(String[] args) {

		double mean = 2.4;
		double n = 100;
		double stdDeri = 2.0;
		double SampleMean = 0;
		double SampleStdDeri = 0;

		SampleMean = n * mean;
		SampleStdDeri = Math.sqrt(n) * stdDeri;

		System.out.format("%.4f%n", cummulative(SampleMean, SampleStdDeri, 250));

	}

	static double cummulative(double SampleMean, double SampleStdDeri, double x) {
		double factor = (SampleStdDeri * Math.sqrt(2));
		double cdf = (0.5) * (1 + erf((x - SampleMean) / factor));

		return cdf;
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
