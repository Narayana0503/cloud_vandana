
import java.util.*;

public class RomanToInteger {
	
	 public static int romanToInt(String s) {
		 
	        Map<Character, Integer> romanNumerals = new HashMap<>();
	        
	        romanNumerals.put('I', 1);
	        
	        romanNumerals.put('V', 5);
	        
	        romanNumerals.put('X', 10);
	        
	        romanNumerals.put('L', 50);
	        
	        romanNumerals.put('C', 100);
	        
	        romanNumerals.put('D', 500);
	        
	        romanNumerals.put('M', 1000);
	        
	        int result = 0;
	        
	        int prevValue = 0;
	        
	        for (int i = s.length() - 1; i >= 0; i--) {
	        	
	            int currValue = romanNumerals.get(s.charAt(i));
	            
	            if (currValue < prevValue) {
	            	
	                result -= currValue;
	            } else {
	                result += currValue;
	            }
	            prevValue = currValue;
	        }
	        
	        return result;
	    }


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Roman number: ");
		
		String romanString = input.next();
		
		input.close();
		
		int convertedInt = romanToInt(romanString);
		
		System.out.println(romanString+" = "+convertedInt);
		

	}

}
