import java.util.*;
class funcsum
{
int a,b;
public void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
a=sc.nextInt();
System.out.println("Enter a number:");
b=sc.nextInt();
}
public void printdata()
{
int sum=a+b;
System.out.println("SUM = "+sum);
}
public static void main(String args[])
{
funcsum f=new funcsum();
f.getdata();
fC.printdata();
}
}