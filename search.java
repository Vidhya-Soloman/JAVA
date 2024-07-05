import java.util.Scanner;
class search
{
    int a[];
    int n;
    int s;
    int i;
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

    }
    public void printdata()
    {
        System.out.println("Entered elements are:");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+"\t");
    }
    public void searching()
    {
        int t=0;
        int e=0;
System.out.println("\nEnter the element to be searched");
s=sc.nextInt();
for(int i=0;i<n;i++)
{
    if(s==a[i])
    {
        t=1;
        e=a[i];
        break;
    }
    else
    {
        t=0;
    }
}
if(t==1)
{
    System.out.println("Element found: "+e);

}
else
{
    System.out.println("Not found");
}

    }
    public static void main(String args[])
    {
        search sr=new search();
        sr.getdata();
        sr.printdata();
        sr.searching();

    }
}