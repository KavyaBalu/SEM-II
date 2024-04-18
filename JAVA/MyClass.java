public class MyClass {
  private static int Count = 0;
  public static String[] 
        Inputs(String name, int age) {
    Count++;
    return new String[] 
    {
        name, String.valueOf(age)
    };  
  }
  public void display(String[] values) {
    System.out.println("Name of the student : " + values[0] + ", Age of the student: " + values[1]);
  }
  public static void main(String[] args) {
    String[] a = MyClass.Inputs("NISHAL", 22);
    String[] b = MyClass.Inputs("APPUKUTTAN", 25);
    
    MyClass obj1 = new MyClass();
    MyClass obj2 = new MyClass();
    obj1.display(a);
    obj2.display(b);
   
    System.out.println("TOTAL NUMBER OF OBJECTS CREATED ->: " + Count);
  }
}