package java8;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;


public class IntStreamEx {

	
	public static IntPredicate isInRange(){  return i -> i<4; } 
	public static void main(String[] args) {
		String s = "hemonth";
		// TODO Auto-generated method stub
		System.out.println("avg value of 1st 100 numbers: "+IntStream.range(0, 100).average());
		boolean allMatch = IntStream.range(0, 5).allMatch(i -> (i == i));
		boolean allMatch1 = IntStream.range(0, 5).allMatch(i -> (i%2 == 0));
		System.out.println("Is all match true: "+allMatch);
		System.out.println("Is all match true: "+allMatch1);
		IntStream.range(0, 5).map(i -> i*2).parallel().forEach(i -> System.out.println(i));
		IntStream.range(0, 5).anyMatch(isInRange());
		IntStream.range(0, 5).noneMatch(isInRange());
		System.out.println("given string ends with 'onth': "+s.endsWith("hemo"));
		
		
	}

}
