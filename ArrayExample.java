import java.util.*;
class ArrayExample{
public static void main(String[] args)
{
int a[]  = new int[5];
int i;
Scanner b=new Scanner(System.in);
for(i=0;i<5;i++)
{
a[i] = b.nextInt();
System.out.println("The element entered: "+a[i]);
}
}
}