import java.util.Scanner;
public class IT22340214Lab4Q2{

   public static void main(String [] args){
   
   double examMark,labMark,examPercentage,labPercentage,finalMark;
   
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Enter the exam marks(out of 100): ");
   examMark = input.nextDouble();
   
   if(examMark < 0 || examMark > 100)
   {
		System.out.println("Invalid input for exam marks.Terminating program. ");
		return;
   
   }
  
   System.out.print(" Enter the lab submission marks(out of 100): ");
   labMark = input.nextDouble();
   
   if(labMark < 0 || labMark > 100)
   {
		System.out.println("Invalid input for lab marks.Terminating program. ");
		return;
   
   }
   
    System.out.print(" Enter the percentage given for the exam: ");
	examPercentage = input.nextDouble();
	
    System.out.print(" Enter the percentage given for the lab submission: ");
	labPercentage = input.nextDouble();
   
    if(examPercentage + labPercentage != 100)
	{
		System.out.print("Invalid input for lab marks.Terminating program. ");
		return;
   
   }
    
    finalMark=((labMark*labPercentage/100) + (examMark*examPercentage/100));
   
    System.out.println();
	System.out.println("Final Exam Mark is : " + finalMark);
    

}

}