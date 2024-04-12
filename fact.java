import java.util.Scanner;
class fact
{
int n;
public void factorial()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
n=sc.nextInt();
int i=1;
int f=1;
while(i<=n)
{
f=f*i;
i=i+1;
}
System.out.println("Factorial:"+f);
}
public static void main(String args[])
{
fact t=new fact();
t.factorial();
}
}
