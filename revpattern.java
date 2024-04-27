import java.util.Scanner;
class revpattern
{
    public static void main(String args[])
    {
        int limit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit: ");
        limit=sc.nextInt();
        for(int i=limit;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}