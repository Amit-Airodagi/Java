import java.util.Scanner;
public class leapy
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int year=a.nextInt();
boolean isLeapYear=false;
if(year%4==0){
if(year%100==0){
if(year%400==0){
 isLeapYear=true;
}
}
else{
isLeapYear=true;
}
}if(isLeapYear){
System.out.println(year+"is leap year:");
}else{
System.out.println(year+"is not a leap year:");
}
}
}