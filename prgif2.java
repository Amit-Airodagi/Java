import java.util.Scanner;
public class prgif2{
public static void main(String args[])
{
Scanner num=new Scanner(System.in);
System.out.println("Enter the first number:");
int num1=num.nextInt();
if(num1>0){
System.out.println("Posivitive number!");
}
else
{
System.out.println("Negative number");
}
}
}