import java.util.Scanner;

public class NumberCheck {
	
	public static void main(String[] args) {
	
		int[] goodArray = new int[10];
		
		Scanner s = new Scanner(System.in);
		//a scanner is a different class, reads input and categorizes it, allows us to put input in
	
				
		for(int i = 0; i < goodArray.length; i++) {
			System.out.print("Number, please: ");
			goodArray[i] = s.nextInt();
			
		}
	
		
	
	if(hasSeven(goodArray))
		System.out.println("this one has seven");
	else
	
		System.out.println("No seven");
	
	//no even numbers and all smaller than seven
	if(notEvenSmallerThanSeven(goodArray)) {
		System.out.println("All numbers smaller than 7 and odd"); }
	else { 
		System.out.println("Some numbers bigger than 7 or even"); } 
	}


/**
 * Checks to see if any values in given array are equal to 7
 * @param someArray
 * @return true if = 7
 */
public static boolean hasSeven(int[] someArray) {
	//give it somewhere to look through = parameter where it will be looking for data

	for(int i = 0; i < someArray.length; i++) {
		//test if = to seven
		if(someArray[i] == 7)  
			return true; 
		//after checking whole array, return false
	}
		
		return false;
		
			
		}
	
/**
 * 	Checks that the values of the given array are smaller than 7 and 
 * are all odd
 * @param someArray
 * @return true only if values are odd and less than 7
 */

public static boolean notEvenSmallerThanSeven(int[] someArray) { 

	for (int i = 0; i < someArray.length; i++) {
		
		if(someArray[i] >= 7 || someArray[i] % 2 == 0) 
				return false; 
	
	}
	return true; 
		
	}
	
		
	}
	





	


