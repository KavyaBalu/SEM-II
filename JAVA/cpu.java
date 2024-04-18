import java.uti.scanner;
class cpu
{
    int price;
    cpu (int p);
    {
        this.price=p;
        
    }
    class processor
    {
        int cores;
        String manufacturer;
        processor(int c, String m)
        {
            this.cores;
            this.manufacturere=m;
        }
        void display()
        {
            System.out.println("No of cores:"+ this.cores);
            System.out.println("processor manufacturer:"+ this.manufacturer);
        }
    }
    static class ram
    {
        int memory;
        string manufacturer;
        ram(int n, String m)
        {
            this.memory=n;
            this.manufacturer=m;
        }
        void display()
        {
            System.out.println("memory size:"+this.memory);
            System.out.printn("memory manufacturer:"+this.manufacturer);
        }
    }
    void display()
    {
        System.out.println("price of cpu:"+this.price);
    }
    public static void main(String arg[])
    {
       Scanner s=new Scanner(system.in);
       System.out.println("enter the price of cpu:");
       int price=s.nextInt();
       s.nextLine();
       System.out.println("enter the no of cores:");
       int cores = s.nextInt();
       s.nextLine();
       System.out.println("enter the manufacturer of processor:");
    }
}