import java.util.Scanner;
class complex
{
public static void main(String args[])
{
float x;
float y;
float sum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st complex number:");
x=sc.nextFloat();
System.out.println("Enter 2nd complex number:");
y=sc.nextFloat();
sum=x+y;
System.out.println("Sum of two complex number is:"+sum);
}
} 