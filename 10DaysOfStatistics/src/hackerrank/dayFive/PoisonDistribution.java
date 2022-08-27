package hackerrank.dayFive;

public class PoisonDistribution {

	public static void main(String[] args) {

		double lemda = 2.5;
		double x = 5;
		double pd = 0;
		double exp = 2.71828;

		pd = (Math.pow(lemda, x) * Math.pow(exp, -(lemda))) / fact(x);
		System.out.format("%.3f", pd);
	}

	static int fact(double n) {

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}