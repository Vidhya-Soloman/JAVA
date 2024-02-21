import java.util.Scanner;
class array
{
public static void main(String args[])
{
int [] x=new int[5];
System.out.println("Enter the elements:");
Scanner sc=new Scanner(System.in);
for(int i=0;i<5;i++)
{
x[i]=sc.nextInt();
}
System.out.println("Entered elements are:");
for(int i=0;i<5;i++)
{
System.out.println(x[i]);
}
}
}