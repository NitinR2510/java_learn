import java.util.*;
class Second
{
public static void main(String[] args)
{
int i,j;
Scanner a=new Scanner(System.in); 
int num;
System.out.println("Enter the number of lines of stars you need:\n ");
num = a.nextInt();
System.out.println("The pyramid is: \n");
for(i=0;i<num;i++)
{
for(j=0;j<=i;j++)
{
	System.out.print("*");
}
System.out.println();
}
}
}