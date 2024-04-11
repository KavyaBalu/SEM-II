import java.util.Scanner;
class inputexample
{
int rollno;
String name;
Float mark;
void showDetails()
{
System.out.println("This is non static method");
System.out.println("\n..... Student Details....\n");
System.out.println("Rollno:"+rollno);
System.out.println("Name:"+name);
System.out.println("Mark:"+mark);
}
static void show()
{
System.out.println("\n\n This is static method");
}
public static void main(String arg[])
{
try
{
Scanner s= new Scanner(System.in);
inputexample u = new inputexample();
System.out.println("enter Rollno");
u.rollno=s.nextInt();
s.nextLine();
System.out.println("enter name");
u.name=s.next();
System.out.println("Enter mark");
u.mark=s.nextFloat();
u.showDetails();
show();
}
catch(Exception e)
{
System.out.println(e);
}
}
}