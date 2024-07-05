import java.io.*;

class fileread
{
    public static void main(String args[]) throws IOException
    {
        String s;
        FileReader f=new FileReader("D:\java prgrms\file1.txt");
        BufferedReader  br = new BufferedReader(f);

        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }
        br.close();
    }
}