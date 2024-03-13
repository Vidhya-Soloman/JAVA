import java.util.Scanner;
class shapes
{
public void area(float l,float b)
{ 
float rect=l*b;
System.out.println("Area of rectangle: "+rect);
}
public void area(float radius)
{
float circle=3.14f*radius*radius;
System.out.println("Area of circle: "+circle);
}
public void area(int side)
{
int square=side*side;
System.out.println("Area of square: "+square);
}
public void area(double b,double h)
{
double triangle=(0.5*b*h);
System.out.println("Area of triangle: "+triangle);
}
public static void main(String args[])
{
shapes s=new shapes();
s.area(2.2f,1.2f);
s.area(3.2f);
s.area(5);
s.area(2.0,3.0);
}
}


