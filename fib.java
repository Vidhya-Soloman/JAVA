import java.util.Scanner;
class fib
{
    public static void main(String args[])
{
    int limit;
    int n1=0;
    int n2=1;
    int n3;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a limit: ");
    limit=sc.nextInt();
    System.out.println(n1);
    System.out.println(n2);
    for(int i=2;i<limit;i++)
    {
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.println(n3);
    }
}
}