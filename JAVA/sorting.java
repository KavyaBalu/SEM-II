import java.util.*;
class sorting
        {
    String str;
    public void get_String()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string:");
        this.str=s.nextLine();
    }
    public void sort_print()
    {
        char charArray[]=str.toCharArray();
        Arrays.sort(charArray);
        String sortedString=" ";
        for(int i=0;i<charArray.length;i++)
        {
            sortedString += charArray[i];
        }
        System.out.println("sorted String is" + sortedString);
    }
    public static void main(String arg[])
    {
        sorting data= new sorting();
        data.get_String();
        data.sort_print();
    }
}