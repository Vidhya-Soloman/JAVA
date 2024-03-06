import java.util.Scanner;
class employee
{
int eNo;
String eName;
int salary;
void input()
{
int i;
int s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the details");
System.out.println("Enter the Employee Number:");
eNo=sc.nextInt();
System.out.println("Enter the Employee Name:");
eName=sc.next();
System.out.println("Enter the Salary:");
salary=sc.nextInt();
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of employees:");
int n=sc.nextInt();
employee a[]=new employee[n];  //creating employee class object(Array of objects)
for(int i=0;i<n;i++)
{
a[i]=new employee();
a[i].input();    //Calling the function
}
System.out.println("Enter the eNo to be searched:");
int s=sc.nextInt();
int c=0;
for(int i=0;i<n;i++)
{
if(s==a[i].eNo)
{
c=1;
System.out.println("Employee NUmber: "+a[i].eNo);
System.out.println("Employee Name: "+a[i].eName);
System.out.println("Employee Salary: "+a[i].salary);
break;
}
}
if(c==0)
System.out.println("Not found");
}
}
