import java.util.Scanner;
class pattern
{
    public static void main(String args[])
    {
        int limit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a limit: ");
        limit=sc.nextInt();
        for(int i=0;i<limit;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}