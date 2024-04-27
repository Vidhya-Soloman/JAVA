import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
    int n;
    int i,rem,rev=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    n=sc.nextInt();
    int t=n;
    while(n>0)
    {
    rem=n%10;
    rev=rev+(rem*rem*rem);
    n=n/10;
    }
    if(t == rev)
    System.out.println("Armstrong");
    else
    System.out.println("Not Armstrong");

}
}