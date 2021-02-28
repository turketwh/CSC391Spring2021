import java.util.Random;
import java.util.ArrayList;
import java.util.regex.*;

public class Main
{
	public static void main(String[] args) {
	    
		int i;
		int countOfWords = 10000;
		int matchedWords = 0;
		int difference = 0;
		int value;
		int stringValue;
		
		// Generate 10,000 random integers between 0 and 100000
		Random random = new Random();
		ArrayList<String> values = new ArrayList<String>();
		for (i = 0; i < countOfWords; i++) {
		    value = random.nextInt(100000);
		    values.add(""+value);
		}
	
	    // Define a regular expression for integers (one or more digits)
	    String intRegularExpression = "\\p{Digit}\\p{Digit}*";
	
	    // See if each generated integer matches the integer regular expression 
		long startTime = System.nanoTime();
		for (i = 0; i < countOfWords; i++) {
		    if (Pattern.matches(intRegularExpression,values.get(i)) == true) {
		        matchedWords += 1;
		    }
		}
		long endTime = System.nanoTime();
		long elapsedTime = endTime-startTime;
		
		// Print the time it took the program to run and whether all generated
		// integers matched the regular expression
		System.out.println("Elapsed time (in nanoseconds): " + elapsedTime);
		if (matchedWords == countOfWords) {
		    System.out.println("All generated integers matched the regular expression");
		}
		else {
		    difference = countOfWords - matchedWords;
		    System.out.println("" + difference + " generated integers did not match the regular expression");
		}
	}
}
