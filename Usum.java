import java.util.*;
class Usum
{
	public static void main(String[] args)
	{
		int choice,flag=1, num1, num2, total;
		Scanner s=new Scanner(System.in);
		
        		
		while(flag==1)
		{
			System.out.println("\nEnter the choice number of the program: \n1.Add \n2.Quit");
		    choice  = s.nextInt();
            if(choice==1)
			{	
             System.out.println("Enter the two numbers in order\n"); 		
			num1 = s.nextInt();
			num2 = s.nextInt();
			total = num1+num2;
			System.out.println("Sum of the numbers is "+total);
			}
			else if(choice==2)
				flag = 0;
			else
				System.out.println("Invalid Input\n");
		}
		
	}
}