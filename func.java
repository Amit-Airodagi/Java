import java.util.*;
class func
{
public static int add (int a,int b)
{
return a+b;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a value:");
int a=s.nextInt();
System.out.println("Enter b value:");
int b=s.nextInt();
System.out.println(add(a,b));
}
}