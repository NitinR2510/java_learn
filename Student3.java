class Student3
{
//author@NitinR
//Methods to take input in instance variable -2
int regno;
String name;
void getdata()   
{
name = "Nitin";
regno = 1234;
}
void putdata()
{
System.out.println("name: "+name+"regno: "+regno);
}
public static void main(String args[])
{
Student3 s= new Student3();
s.getdata();
s.putdata();
System.out.println("The name of the student is "+ s.name + " with regno: "+s.regno); 
}
}