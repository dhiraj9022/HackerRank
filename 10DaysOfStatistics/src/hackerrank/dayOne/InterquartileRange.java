package hackerrank.dayOne;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Test {

	/*
	 * Complete the 'interQuartile' function below.
	 *
	 * The function accepts following parameters: 1. INTEGER_ARRAY fr 2.
	 * INTEGER_ARRAY freqs
	 */

	public static void interQuartile(List<Integer> values, List<Integer> freqs) {
		// Print your answer to 1 decimal place within this function
		int q1 = 0;
		int q3 = 0;
		double q3_q1 = 0;

		List<Integer> fr = new ArrayList<>();

		for (int i = 0; i < values.size(); i++) {
			for (int j = 0; j < freqs.get(i); j++) {
				fr.add(values.get(i));
			}
		}
		Collections.sort(fr);

		int n = fr.size();
		if (n % 2 == 0) {
			// q2 = (fr.get(n / 2) + fr.get(n / 2 - 1)) / 2;

			if (n / 2 % 2 == 0) {
				q1 = (fr.get(n / 4) + fr.get(n / 4 - 1)) / 2;
				q3 = (fr.get(3 * n / 4) + fr.get(3 * n / 4 - 1)) / 2;

			} else {
				q1 = fr.get(n / 4);
				q3 = fr.get(3 * n / 4);
			}

		} else {

			// q2 = fr.get(n/2);
			if (n / 2 % 2 == 0) {
				q1 = (fr.get(n / 4) + fr.get(n / 4 - 1)) / 2;
				q3 = (fr.get(3 * n / 4) + fr.get(3 * n / 4 + 1)) / 2;

			} else {
				q1 = fr.get(n / 4);
				q3 = fr.get(3 * n / 4);

			}
		}
		q3_q1 = q3 - q1;
		System.out.println(q3_q1);
	}

}

public class InterquartileRange {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> val = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> freq = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Test.interQuartile(val, freq);

		bufferedReader.close();
	}
}
