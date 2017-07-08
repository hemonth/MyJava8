package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basics8 {

	static List<String> names = Arrays.asList("hemonth","ram","john","suresh");
	static List<Integer> pAges = Arrays.asList(1,2,4,6,8,12,45);
	static String concat(String name){
		return name.concat(name);
	}
	//public final Supplier<String> results1 = (r) -> r.get() -> ;
	public static void main(String[] args) {
		
//		for(String name: names){
//			System.out.println(name);
//		}
		final Predicate<String> startsWithH = name -> name.startsWith("h");
		System.out.println("Greetings: ");
		final Function<String,String> sayHi = (name) -> "hi ".concat(name);
		
		names.stream().map(sayHi).forEach(System.out::println);
		System.out.println("Students who have long name: ");
		names.stream().filter(name -> name.length() > 4).forEach(System.out::println);
		List<String> newList = names.stream().filter(startsWithH).collect(Collectors.toList());
		System.out.println("Names starts with H: ");
		newList.stream().forEach(System.out::println);
		//find average age
		double averageAge = pAges.stream().collect(Collectors.averagingInt(i -> i));
		System.out.println("Average age: "+averageAge);
		
		Stream.of("a1","b2","c1","d2","e4").map(Basics8::concat).forEach(System.out::println);
		
		Supplier<Stream<String>> streamSupplier =
			    () -> Stream.of("d2", "a2", "b1", "b3", "c", "hemonth mandava")
			            .filter(s -> s.startsWith("h"));

			streamSupplier.get().anyMatch(s -> s.startsWith("z"));
			streamSupplier.get().forEach(System.out::println);
//			streamSupplier.get().noneMatch(s -> true);

	}

}
