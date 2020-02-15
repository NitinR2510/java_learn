//The ball problem
//@18BCE0272
import java.util.*;
class Generate extends Exception
{
	public static void main(String[] args)
	{
		double count1 = 0, count2 = 0, count3 = 0, count4 = 0, total = 0;
		
	while(total<10)
		{
			try{
		if (count1 <=3 && count2 <=3 && count3 <=3 && count4 <=3)
		{
			double x = (Math.random()*4)+1;
		    double choice = x - x%1;;
			if (choice == 1)
			{
				System.out.println("Red ball was chosen.");
				count1+=1;
			    total+=1;
			}
			else if(choice == 2)
			{
				System.out.println("Green ball chosen.");
				count2+=1;
				total+=1;
			}
			else if(choice == 3)
			{
				System.out.println("Blue ball chosen");
				count3+=1;
				total+=1;
			}
			else if(choice == 4)
			{
				System.out.println("Yellow ball chosen");
				count4 +=1;
				total+=1;
			}
			else
			{
				System.out.println("Invalid Choice. Entered input rejected. Continue entering");
			}
		}
		else
		{
			total = 0;
			count1 = 0;
			count2 = 0;
			count3 = 0;
			count4 = 0;
			
			throw new Exception("a colour cannot be chosen more than thrice");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		System.out.println("Your choice is " + count1 + " Red balls " + count2 + " Green " + count3 + " Blue " + count4 + " Yellow ");
	}
	
}