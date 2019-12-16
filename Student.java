class Student
{
//author@NitinR
//Methods to take input in instance variable -1
int regno;
String name;
public static void main(String args[])
{
Student s= new Student();
s.regno = 101;
s.name = "Nitin";
System.out.println("The name of the student is "+ s.name + " with regno: "+s.regno); 
}
}