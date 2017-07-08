package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class NoOfWordsInCamelCaseString {
	
	final static Predicate<String> isConsecutivePrsent = name -> {
		boolean check = true;
		char [] charre = name.toCharArray();
		for (int i = 1; i < charre.length; i++) {
			if(charre[i-1] == charre[i]){
				check = false;
				break;				
			}		
		} 
		return check;
	}; 

	public static void main(String[] args) {
		List<Character> alpha = new LinkedList<>();
		Set<Character> alphaSet = new HashSet<>();
	//	List test = Arrays.asList("hemo" ,"tttayy");
		// test.stream().filter(isConsecutivePrsent).forEach(System.out::println);
		//BufferedReader reader = new BufferedReader(new FileReader(path));
		final Predicate<Character> withCaps = charr -> {if('Z' >= charr && charr >= 'A') return true; else return false;} ;
		String str = "beabeefeab";		
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			alpha.add(ch[i]);
			alphaSet.add(ch[i]);
		}
		
		
		long count = alpha.stream().filter(withCaps).count();
		long count1 = alpha.stream().filter(name -> {if('Z' >= name && name >= 'A') return true; else return false;}).count();
		System.out.println(count+1);
		System.out.println("List of Alphabets in String: \n"+alphaSet);
		


	}

}
