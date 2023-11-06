class cal{
float a,b;
public cal(float a, float b){
this.a=a;
this.b=b;
a=12;
b=27;
}
public void add(){  
System.out.println(a+b);
}

public void div()
{
System.out.println(b/a);
}
}

class intern
{
public static void main(String arg[])
{
Scanner s= newScanner(System.in);
System.out.println("Enter a and b values");
float a= s.nextFloat();
float b= s.nextFloat();
cal c1=new cal(a,b);
c1.div();
c1.add(s);
}
}