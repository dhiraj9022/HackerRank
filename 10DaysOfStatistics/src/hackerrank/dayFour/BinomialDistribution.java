package hackerrank.dayFour;

public class BinomialDistribution {

	public static void main(String[] args) {

		int num = 6;
		int x = 3;
		double boys = 1.09;
		double girls = 1;
		double p = boys / (boys + girls);
		double binom = 0;

		for (x = 3; x <= num; x++) {

			binom = binom + nCx(num, x) * Math.pow(p, x) * Math.pow(1 - p, num - x);

		}
		System.out.format("%.3f", binom);

	}

	static int nCx(int n, int r) {

		return fact(n) / (fact(n - r) * fact(r));
	}

	static int fact(int n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
