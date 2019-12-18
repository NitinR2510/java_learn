import java.util.*;
class Triangle
{
	//This code is to print a reverse pyramid
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int num,i,j;
        System.out.println("\nEnter the number of rows in the pyramid\t");
        num = s.nextInt();
		System.out.println("");
		for(i=1;i<num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
				System.out.println();
		}
        for(i=num;i>=1;i--)
        {
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	
	}
}