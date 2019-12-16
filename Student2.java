class Student2
{
//author@NitinR
//Methods to take input in instance variable -2
int regno;
String name;
Student2()   //default constructor
{
name = "Nitin";
regno = 1234;
}
public static void main(String args[])
{
Student2 s= new Student2();
System.out.println("The name of the student is "+ s.name + " with regno: "+s.regno); 
}
}