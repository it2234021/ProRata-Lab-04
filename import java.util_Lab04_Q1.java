import java.util.Scanner ;

public class IT22340214Lab4Q1{
	
	 public static void main(String[] args){
		 
		int number ;
	 
	    Scanner input = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		
		number = input.nextInt();
		
		if (number > 0){
			 System.out.println("The number is positive.");
			 
		} else if (number < 0){
			 System.out.println("The number is negative.");
		} else {
			 System.out.println("The number is zero.");
		}
	 }	
}