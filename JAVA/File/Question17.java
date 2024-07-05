import java.io.*;

class Question17
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        
        FileWriter f=new FileWriter("D:/Nikhila/OOPS/File/input.txt");
        BufferedWriter bw=new BufferedWriter(f);

        System.out.println("Enter Content");
        do{
            String s=br.readLine();
        }while(s!=null);
        

        bw.write(s);

        bw.close();

    }
}