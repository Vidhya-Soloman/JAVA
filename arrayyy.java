//Array printing
//1D ARRAY
//READING LIMIT FROM THE USER
import java.util.Scanner;
class arrayyy
{
    public static void main(String args[])
    {
        int a[];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        n=sc.nextInt();
        a=new int[n];
        int i;
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        //Printing
        System.out.println("Entered array elements:");
        for(i=0;i<n;i++)
        System.out.println(a[i]);

    }
}