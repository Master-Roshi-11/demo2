import java.util.Scanner;

class Program2
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num1,num2,sum=0;
System.out.print("Enter Number 1 ");
num1=stdin.nextInt();
System.out.print("Enter Number 2 ");
num2=stdin.nextInt();
sum=num1+num2;
System.out.println("Addition of 2 Nos : "+sum);
}
}