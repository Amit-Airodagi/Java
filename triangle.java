import java.util.Scanner;
public class triangle{
public static void main (String args[])
{
Scanner t=new Scanner(System.in);
System.out.println("Enter the length of the side1");
int side1=t.nextInt();
System.out.println("Enter the length of the side2");
int side2=t.nextInt();
System.out.println("Enter the length of the side3");
int side3=t.nextInt();
if(side1==side2&&side2==side3){
System.out.println("It is equilateral triangle");
}
else if(side1==side2||side2==side3||side1==side3){
System.out.println("It is isoceles traingle");
}
else{
System.out.println("It is scalene triangle");
}
}
}




