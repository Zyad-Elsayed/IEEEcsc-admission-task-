package task_4;
import java.util.*;

public class test {


	public class FirstNonRepeatingChar {
	    public static char firstNonRepeatingChar(String str) {
	    	
	        //store the count of each character in the string
	        Map<Character, Integer> charCount = new HashMap<>();
	        
	        // Loop through the string and updating the count of each character
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            int count = charCount.getOrDefault(c, 0);
	            charCount.put(c, count + 1);
	        }
	        
	        // find the first character with a count of 1
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (charCount.get(c) == 1) {
	                return c;
	            }
	        }
	        
	        // If there is no rep char
	        return '\0';
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string in lowercase: ");
	        String str = scanner.nextLine();
	        char result = firstNonRepeatingChar(str);
	        if (result == '\0') {
	            System.out.println("No non-repeating character found in the string.");
	        } else {
	            System.out.println("The first non-repeating character in the string is: " + result);
	        }
	    }
	}

}

