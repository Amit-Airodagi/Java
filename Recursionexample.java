class Recursionexample{
public static int factorial (int n){
if(n==0){                                          //Base case
return 1;
}
else
{
return n*factorial(n-1);//Recursive case
}
}
public static void main(String args[])
{
int result = factorial(5);//calling the factorial method
System.out.println("Factorial of the given number:"+result);
}
}

