package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamMap {

	public static void main(String[] args) {

		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400);
		costBeforeTax.stream().map((cost) -> cost + 0.12 * cost)
				.forEach(System.out::println);

		List<Integer> testList = Arrays.asList(1, 2, 3, 4, null, 5);
		List<Integer> tesst1 = testList.stream().filter(x -> x != null)
				.map(cost -> cost + 10).collect(Collectors.toList());
		System.out.println(tesst1);
		
		@SuppressWarnings("unused")
		List<String> abusingWords = Arrays.asList("Idiot","Stupid");
		
		List<String> mainWords = Arrays.asList("hi","hello","Idiot","Bye","Stupid");
		
		List<String> test = mainWords.stream().filter(e -> abusingWords.stream().anyMatch(name->name.contains(e))).collect(Collectors.toList());
		
		System.out.println(test);
	}

}
