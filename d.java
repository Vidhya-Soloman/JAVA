//sum of 2 numbers from user 
//user input

import java.util.Scanner;
public class d 
{
    public static void main(String args[])
    {
        int x;
        int y;
        int sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        x=sc.nextInt();
        System.out.println("Enter second number:");
        y=sc.nextInt();
        sum=x+y;
        System.out.println("Sum of two numbers: "+sum);
    }
    
}
