import java.util.Scanner;
class twoD
{
public void matrix()
{
int m,n,i,j;
int a[][];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numebr of rows");
m=sc.nextInt();
System.out.println("Enter the numeber of columns");
n=sc.nextInt();
a=new int[m][n];
System.out.println("Enter the elements");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Entered elements are:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
}
System.out.println(" ");
}
}
public static void main(String args[])
{
twoD t=new twoD();
t.matrix();
}
}