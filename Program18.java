import java.util.Scanner;


class Program18
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
int a,b,c;
System.out.print("Enter Number 1 : ");
a=sin.nextInt();
System.out.print("Enter Number 2 : ");
b=sin.nextInt();
System.out.print("Enter Number 3 : ");
c=sin.nextInt();
if(a>b && a>c)
System.out.println(a+" is Greater of 3 Nos");
else if(b>c)
System.out.println(b+" is Greater of 3 Nos");
else
System.out.println(c+" is Greater of 3 Nos");


}
}