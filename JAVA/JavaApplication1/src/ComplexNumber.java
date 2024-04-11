class ComplexNumber {  
    int real, imag;  
  
    public ComplexNumber(int r, int i) {  
        this.real = r;  
        this.imag = i;  
    }  
  
    public void showC() {  
        System.out.print("(" + this.real + " + " + this.imag + "i" + ")");  
    }  
   
    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {  
  
        
        ComplexNumber res = new ComplexNumber(0, 0);  
  
        
        res.real = n1.real + n2.real;  
  
        
        res.imag = n1.imag + n2.imag;  
  
       
        return res;  
    }  
  
    public static void main(String arg[]) {  
  
      
        ComplexNumber c1 = new ComplexNumber(4, 5);  
        ComplexNumber c2 = new ComplexNumber(10, 5);  
  
        
        System.out.print("First Complex number: ");  
        c1.showC();  
        System.out.print("\nSecond Complex number: ");  
        c2.showC();  
      
        ComplexNumber res = add(c1, c2);  
  
        System.out.println("\nAddition is :");  
        res.showC();  
    }  
}  