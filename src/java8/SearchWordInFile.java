package java8;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class SearchWordInFile {
	
	final static String path = "my_git_quick_work.txt";
	
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		List<Character> alpha = new LinkedList<>();

		//BufferedReader reader = new BufferedReader(new FileReader(path));
		//final Predicate<Character> WithCaps = name -> {if('Z' >= name && name >= 'A') return true; else return false;} ;
		String str = "helloWorldHemonthChouddary";		
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			alpha.add(ch[i]);
		}
		long count = alpha.stream().filter(name -> {if('Z' >= name && name >= 'A') return true; else return false;}).count();
		System.out.println(count);
	}

}
