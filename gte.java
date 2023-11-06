import java.util.Scanner;
public class gte{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=s.nextInt();
System.out.println("Enetr the second number:");
int num2=s.nextInt();
if(num1>num2)
{
System.out.println(num1+"is greater");
}
else if(num2>num1)
{
System.out.println(num2+"is greater");
}
else
{
System.out.println("Both are equal");
}
}
}