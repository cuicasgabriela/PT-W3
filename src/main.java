import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class main {

	public static void main(String[] args) {
		// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		ArrayList<Integer> age = new ArrayList<>(Arrays.asList(3, 9, 23, 64, 2, 8, 28, 93));
		
		//1a. subtract the value of the first element in the array from the value in the last element of the array 
		//	  (i.e. do not use ages[7] in your code). 
		//	  Print the result to the console. 
		
		System.out.println("1a: Last age - first age = " + (age.get(age.size() -1) - age.get(0) ));
		
		//1b. Add a new age to your array and 
		//	  repeat the step above to ensure it is dynamic 
		//	  (works for arrays of different lengths).
		age.add(100);
		System.out.println("1b: Last age - first age = " + (age.get(age.size() -1) - age.get(0) ));
		
		// 1c. Use a loop to iterate through the array and calculate the average age. 
		//	   Print the result to the console
		int sum = 0;
		for(int i = 0; i < age.size(); i++) {
			sum += age.get(i);
		}
		System.out.println("1c: The average age is: " + (sum/age.size()));
		
		// 2: 	Create an array of String called names that contains the following values: 
		//		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		//2 a: 	Use a loop to iterate through the array and 
		//		calculate the average number of letters per name. 
		//		Print the result to the console
		int letterSum = 0;
		for(int i = 0; i < names.length; i++){
			letterSum += names[i].length();
		}
		System.out.println("2a: average number of letters per name = " + (letterSum/names.length));

		//2 b.  Use a loop to iterate through the array again and concatenate all the names together, 
		//		separated by spaces, 
		//		and print the result to the console

		String allNames = "";
		for(int i = 0; i < names.length; i++){
			allNames += names[i] + " ";
		}
		System.out.println("2b. concatenate all names = " + allNames);
		
		
		
		//3.  How do you access the last element of any array?
		System.out.println("3. This is how you access the last element: " + names[names.length -1]);

		//4.  How do you access the first element of any array?
		System.out.println("4. This is how you access the firstelement: " + names[0]);

		// 5.  	Create a new array of int called nameLengths. 
		//		Write a loop to iterate over the previously created names array
		//		and add the length of each name to the nameLengths array.
		// 6. 	Write a loop to iterate over the nameLengths array and 
		//			calculate the sum of all the elements in the array. 
		//			Print the result to the console

		int [] nameLengths = new int[names.length];
		int sumNameLengths = 0;
		System.out.print("5. Length of names: ");
		for(int i = 0; i < names.length; i++){
			nameLengths[i]= names[i].length();
			System.out.print(nameLengths[i] + ", ");
			sumNameLengths += names[i].length();
		}
		System.out.print( "\n6. Sum of length of all elements = " + sumNameLengths);
		
		//7. call function
		System.out.println("\n7. concatenated string = " + concatenatedNTimes( "Hello", 3));
		
		//8. call function
		System.out.println("8. Full name = " + fullName( "joe" , "howdy"));
		
		//9. call function
		int[] arry = {1,2,100};
		System.out.println("9. Is sum of array > 100? " + greaterThan100(arry));
		
		//10. call function
		double[] arr = {2.5, 2.5 };
		System.out.println("10. Average of all elements = " + averageDoubleArray(arr));
		
		//11. call function
		double[] arr1 = {2.5, 2.5 };
		double[] arr2 = {3.0, 3.0 };
		System.out.println("11. Is array 1 bigger than array 2? " + arrayComparison(arr1, arr2));
		
		//12. Call function
		System.out.println("12. will buy drink: " + willBuyDrink (true,1.25));
		
		//13. Call function
		System.out.println("13. Compounding Interest. You will have: "+ compoundingInterest(100.25, 15.0, 2.5, 12.0));
	}

		// 7.   Write a method that takes a String, word, and an int, n, as arguments and 
		//		returns the word concatenated to itselfn number of times.
		public static String concatenatedNTimes(String word, int n){
			String concatenated = "";
			for(int x=0 ; x < n; x++){
				concatenated += word;
			}
			return concatenated;
		}
		
		//8. 	Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//		(the full name should be the first and the last name as a String separated by a space)

		public static String fullName(String firstName, String lastName){
			return firstName + " " + lastName;
		}
		
		//9.    Write a method that takes an array of int and 
		//		returns true if the sum of all the ints in the array is greater than100.
		public static boolean greaterThan100(int[] intarray){
			int sum = 0;
			for(int i = 0; i < intarray.length; i++){
				sum += intarray[i];
				if(sum > 100)
					return true;
			}
			return false;
		}
		
		//10.  	Write a method that takes an array of double and 
		//		returns the average of all the elements in the array.
		public static double averageDoubleArray(double[] dub){
			double totalSum = 0;

			for (double rows : dub) {
	    			
	   			totalSum += rows; 
			}
			return totalSum/dub.length;
		}
		
		//11.  	Write a method that takes two arrays of double and 
		//		returns true if the average of the elements in the first array is greater than 
		//		the average of the elements in the second array.

		public static boolean arrayComparison(double[] arr1, double[] arr2){
			int sum1 = 0, sum2 = 0;
			for(int i = 0; i < arr1.length; i++){
				sum1 += arr1[i];
				sum2 += arr2[i];
			}
			return (sum1/arr1.length > (sum2/arr2.length));
		}
		
		// 12.  Write a method called willBuyDrink that takes a boolean isHotOutside, 
		//		and a double moneyInPocket, and 
		//		returns true if it is hot outside and if moneyInPocket is greater than 10.50

		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket){
			if( isHotOutside == true && moneyInPocket> 10.5)
				return true;
			return false;
		}
		
		//13.  	Create a method of your own that solves a problem. 
		//		In comments, write what the method does and why you created it
		//	 	I made a method to calculate the amount of money you would have at the end of some years using the
		//		Compound interest formula : A = P (1 + r/n)^nt
		public static double compoundingInterest(double money, double years, double percent, double timesInterestCompoundsPerYear){
			return money*Math.pow((1+(percent/100)/timesInterestCompoundsPerYear) ,(timesInterestCompoundsPerYear * years) );
		}
}
