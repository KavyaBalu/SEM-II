import java.util.Scanner;
class inputexample//class name
{
    int rollno;//variable declaration
    String name;
    float mark;
    void showDetails(){
       System.out.println("This is non static method");
       System.out.println("\n.....Student Details....\n");
       System.out.println("Rollno:"+rollno);
       System.out.println("Name:"+name);
       System.out.println("Mark:"+mark);
       
    }
    static void show(){
        System.out.println("\n\nThis is static method");
    }
    public static void main(String arg[])//main class
    {
        try//detect error
        {
            Scanner S=new Scanner(System.in);
            inputexample u=new inputexample();
            System.out.println("enter Rollno");
            u.rollno=S.nextInt(); S.nextLine();
            System.out.println("enter name");
            u.name=S.next();
            System.out.println("enter mark");
            u.mark=S.nextFloat();
            u.showDetails();
            //static method
            show();//static method dosent
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}