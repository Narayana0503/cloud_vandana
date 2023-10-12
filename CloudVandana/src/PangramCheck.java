import java.util.Scanner;


// pangram contains alphabets(A-Z)

public class PangramCheck {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the sentance: ");
		
		String sentence = input.nextLine();
		
		boolean isPangram = checkPangram(sentence);
		
		if (isPangram) {
			
            System.out.println("The input is a pangram.");
            
        } else {
        	
            System.out.println("The input is not a pangram.");
        }

	}

	private static boolean checkPangram(String sentence) {
		
		sentence.toLowerCase();
		
		for(char c ='a'; c<='z';c++) { // checks weather a-z contains in the sentence
			
			if(sentence.indexOf(c)==-1) {
				
				return false;
			}	
		}
		
		return true;
	}
}
