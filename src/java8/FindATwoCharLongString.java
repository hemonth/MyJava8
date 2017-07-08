package java8;

public class FindATwoCharLongString {

	public static int longestAltString(String s) {
	    char [][] letters = new char[26][26];
	    int [][] values = new int[26][26];
	    for(char c : s.toCharArray()) {
	        int index = (int)(c - 'a');
	        for(int i = 0; i < 26; i++) {
	            if(letters[index][i] != c && values[index][i] != -1) {
	                letters[index][i] = c;
	                ++values[index][i];
	            } else {
	                values[index][i] = -1;
	            }
	            if(letters[i][index] != c && values[i][index] != -1) {
	                letters[i][index] = c;
	                ++values[i][index];
	            } else {
	                values[i][index] = -1;
	            }
	        }
	    }
	    int largestString = 0;
	    for(int i = 0; i < 26; i++) {
	        for(int j = 0; j < 26; j++) {
	            if(values[i][j] > largestString) {
	                largestString = values[i][j];
	            }
	        }
	    }
	    if(largestString > 1) {
	        return largestString;
	    } else {
	        return 0;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
