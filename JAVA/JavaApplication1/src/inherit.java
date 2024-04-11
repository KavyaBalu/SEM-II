class A
{
    int x=10;
    void show()
    {
        System.out.println("The value of x=" +x);
    }
}
class B extends A
{
    int y=20;
    void display()
    {
        super.show();
        System.out.println("The value of y="+y);
    }
    @Override
    void show()
    {
        System.out.println("X+Y="+(super.x+y));
    }
}
public class inherit{
    public static void main(String arg[])
    {
        B b=new B();
        b.display();
        b.show();
    }
}