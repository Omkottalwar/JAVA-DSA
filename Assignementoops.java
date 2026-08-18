import java.util.*;
public record Assignementoops() {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real part of 1st number : ");
        int r1=sc.nextInt();
         System.out.print("Enter Imaginary part of 1st number :");
          int i1=sc.nextInt();
            System.out.print("Enter real part of 2nd number :");
        int r2=sc.nextInt();
         System.out.print("Enter Imaginary part of 2nd number :");
          int i2=sc.nextInt();
          Complex c1=new Complex(r1, i1);
          Complex c2=new Complex(r2, i2);
          c1.sum(c2);
          c1.diffrence(c2);
          c1.product(c2);

        

    
        
    }
}
class Complex{
    int real;
    int imag;
    Complex(int real, int imag){
        this.real=real;
        this.imag=imag;
    }
    void sum(Complex c){
        int TotalReal=this.real+c.real;
        int TotalImag=this.imag+c.imag;
        System.out.println("addition is"+"("+TotalReal+","+TotalImag+"i"+")");

    }
    void diffrence(Complex c){
        int TotalReal=this.real-c.real;
        int TotalImag=this.imag-c.imag;
        System.out.println("substraction  is"+"("+TotalReal+","+TotalImag+"i"+")");

    }
    void product(Complex c){
        int TotalReal=(this.real*c.real)-(this.imag*c.imag);
        int TotalImag=(this.real*c.imag) +(this.imag*c.real) ;
        System.out.println("product is"+"("+TotalReal+","+TotalImag+"i"+")");

    }
}