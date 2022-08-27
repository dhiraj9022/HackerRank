package hackerrank.dayFour;

public class BinomialDistributionII {

	public static void main(String[] args) {
		int num = 10;
		int x = 2;
		double p = 0.12;
		double q = 0.88;
		double binomII = 0;

		// caseI
		for (int i = 0; i <= 2; i++) {

			binomII = binomII + nCx(num, i) * Math.pow(p, i) * Math.pow(q, num - i);
		}
		System.out.format("%.3f", binomII);
		System.out.println();

		// caseII
		binomII = 0;
		for (x = 2; x <= num; x++) {

			binomII = binomII + nCx(num, x) * Math.pow(p, x) * Math.pow(q, num - x);
		}
		System.out.format("%.3f", binomII);

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
