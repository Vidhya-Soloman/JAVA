import java.util.Scanner;
class t
{
    public static void main(String args[])
    {
        int n;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n%2 == 0 && n!=2)
        {
            flag=1;
        }
        if(flag==0)
        System.out.println("Prime number");
        else
        System.out.println("Not prime");

    }
}