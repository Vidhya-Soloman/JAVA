import java.util.Scanner;
class prod
{
int pcode;
String pname;
double price;
public void readdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter product code:");
this.pcode=sc.nextInt();
System.out.println("Enter product name:");
this.pname=sc.next();  
System.out.println("Enter product price:");
this.price=sc.nextDouble();
}
}
public class product
{
public static void main (String args[])
{
prod p1=new prod();
prod p2=new prod();
prod p3=new prod();
p1.readdata();
p2.readdata();
p3.readdata();
if(p1.price<p2.price && p1.price<p3.price)
System.out.println("Product 1 is lowest"+ p1.price);
else if(p2.price<p1.price && p2.price<p3.price)
System.out.println("Product 2 is lowest"+ p2.price);
else
System.out.println("Product 3 is lowest"+ p3.price);
}
}
