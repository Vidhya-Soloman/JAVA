import java.util.Scanner;
class matsum
{
int m1,n1,i,j;
int m2,n2;
int a[][];
int b[][];
int c[][];
public void matrix()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the numebr of rows 1st matrix:");
m1=sc.nextInt();
System.out.println("Enter the numeber of columns 1st matrix:");
n1=sc.nextInt();
System.out.println("Enter the numebr of rows 2nd matrix:");
m2=sc.nextInt();
System.out.println("Enter the numeber of columns 2nd matrix:");
n2=sc.nextInt();
a=new int[m1][n1];
b=new int[m2][n2];
System.out.println("Enter the elements of 1st matrix:");
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Entered elements are:");
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println(" ");
}

System.out.println("Enter the elements of 2nd matrix:");
for(i=0;i<m2;i++)
{
for(j=0;j<n2;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("Entered elements are:");
for(i=0;i<m2;i++)
{
for(j=0;j<n2;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println(" ");
}
}
public void addition()
{
if(m1==m2 && n1==n2)
{
System.out.println("Sum of two matrix is:"); 
c=new int [i][j];
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<m1;i++)
{
for(j=0;j<n1;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println(" ");
}
}
else
{
System.out.println("Addition not possible");
}
}
public static void main(String args[])
{
matsum t=new matsum();
t.matrix();
t.addition();
}
}