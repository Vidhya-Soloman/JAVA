import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int n;
int fact=1;
int i=1;
Scanner myObj=new Scanner(System.in); 
System.out.println("Enter a number:");
n=myObj.nextInt();
while(i<=n)
{
fact*=i;
i++;
}
System.out.println("Factorial:"+ fact);
}
}