//For scanner 
import java.util.*;
//For Math.max and Math.min
import java.lang.*;

public class oneOfTwo {
	public static void main(String [] args){

		int firstInt; 
		int secondInt; 
		int thirdInt;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number: ");
		firstInt = Integer.parseInt(sc.nextLine());

		System.out.println("Please enter a number: ");
		secondInt = Integer.parseInt(sc.nextLine());

		System.out.println("Please enter a number: ");
		thirdInt = Integer.parseInt(sc.nextLine());

		System.out.println("The maximum value is: " + 
		Math.max(firstInt, Math.max(secondInt, thirdInt)));

		System.out.println("The minimum value is: " + 
		Math.min(firstInt, Math.min(secondInt, thirdInt)));
		
		//close Scanner
		sc.close();
	}


}
