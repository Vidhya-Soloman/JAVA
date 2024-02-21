//Array printing
//1D ARRAY
import java.util.Scanner;
class arrayy
{
    public static void main(String args[])
    {
        int a[];
        a=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements:");
        for(i=0;i<5;i++)
        a[i]=sc.nextInt();
        //Printing
        System.out.println("Entered array elements:");
        for(i=0;i<5;i++)
        System.out.println(a[i]);

    }
}