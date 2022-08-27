package hackerrank.dayOne;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Result {

	/*
	 * Complete the 'quartiles' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY arr as parameter.
	 */

	public static List<Integer> quartiles(List<Integer> arr) {
		// Write your code here
		int q1 = 0;
		int q2 = 0;
		int q3 = 0;

		int n = arr.size();
		Collections.sort(arr);

		if (n % 2 == 0) {
			q2 = (arr.get(n / 2) + arr.get(n / 2 - 1)) / 2;

			if (n / 2 % 2 == 0) {
				q1 = (arr.get(n / 4) + arr.get(n / 4 - 1)) / 2;
				q3 = (arr.get(3 * n / 4) + arr.get(3 * n / 4 - 1)) / 2;

			} else {
				q1 = arr.get(n / 4);
				q3 = arr.get(3 * n / 4);
			}

		} else {

			q2 = arr.get(n / 2);
			if (n / 2 % 2 == 0) {
				q1 = (arr.get(n / 4) + arr.get(n / 4 - 1)) / 2;
				q3 = (arr.get(3 * n / 4) + arr.get(3 * n / 4 + 1)) / 2;

			} else {
				q1 = arr.get(n / 4);
				q3 = arr.get(3 * n / 4);

			}
		}

		return Arrays.asList(q1, q2, q3);
	}

}

public class Quartile {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> res = Result.quartiles(data);

		bufferedWriter.write(res.stream().map(Object::toString).collect(joining("\n")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
	}
}
