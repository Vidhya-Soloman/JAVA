//sum of elments in an array
import java.util.Scanner;
class arraysum
{
    public static void main(String args[])
    {
        int n;
        int i;
        int a[];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit:");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter the elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Sum of elements in the arrary: "+sum);
    }
}