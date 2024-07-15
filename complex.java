//ADDING TWO COMPLES NUMBER
import java.util.Scanner;
class complex
{
    double i;
    double r;
    Scanner sc=new Scanner(System.in);
    public void add()
    {
        System.out.println("Enter the number:");
        r=sc.nextDouble();
        i=sc.nextDouble();
    }
    public static void main(String args[])
    {
        double real;
        double img;
complex c=new complex();
c.add();
complex c1=new complex();
c1.add();
real=c.r+c1.r;
img=c.i+c1.i;
System.out.print(c.r+" + "+c1.r+"i"+" + "+c.i+" + "+c1.i+" = ");
System.out.println(real+" + "+img+"i");
    }

}