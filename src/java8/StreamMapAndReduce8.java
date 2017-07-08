package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamMapAndReduce8 {
	static int rollNo = 1;
	static Function<Integer,Integer> keyGen = i -> {rollNo++; return rollNo+1;};
	static Function<Person,Integer> personKey = i -> i.getAge();
	static Function<Person,String> valueGen = person -> person.getName();
	static  Predicate<Integer> primeOrNot = n -> {
		for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	};
	
	static Comparator<Person> sortbyName = (o1,o2) -> 
		o2.getName().compareTo(o1.getName());



	public static void main(String []args){
		Address a1 = new Address("cto colony","Dallas","Tx");
		Address a2 = new Address("cng colony","Vijayawada","Ap");
		Address a3 = new Address("royal ln","Detroit","Tx");
		Address a4 = new Address("space center blvd","Houston","Tx");
		Person student1 = new Person("hemonth",23,"Gcs",a1);
		Person student2 = new Person("jethin",25,"Gis",a2);
		Person student3 = new Person("ram",21,"Aim",a3);
		Person student4 = new Person("john",13,"Vit",a4);
		
		System.out.println("list of prime numbers: ");
		Stream.iterate(1, i ->i+1).limit(100).filter(primeOrNot).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,34,5);
		numbers.stream().map(keyGen).forEach(System.out::println);
		
		List<Person> students =  Arrays.asList(student1,student2,student3,student4);
		
		Map<Integer,String> m1 = students.stream().collect(Collectors.toMap(personKey, valueGen));
		
		System.out.println(m1);
		
		//join collector accepts a delimiter as well as an optional prefix and suffix
		String phrase = students.stream()
		.filter(p -> p.age >= 18)
	    .map(p -> p.name)
		.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));	
		System.out.println(phrase);
		
		//sorting by name
		System.out.println("Sorted list of students: ");
		List<Person> sortedStudents = students.stream().sorted(sortbyName).collect(Collectors.toList());
		sortedStudents.forEach(student -> System.out.println(student.getName()));
		
		
	}
}
