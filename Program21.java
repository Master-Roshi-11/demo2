import java.util.Scanner;

class Program21
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num1,num2,result=0,choice;
char op;
System.out.print("Enter Number 1 ");
num1=stdin.nextInt();

System.out.print("Enter Number 2 ");
num2=stdin.nextInt();

System.out.print("Enter Operator : ");
op=stdin.next().charAt(0);
switch(op)
{
case '+':result=num1+num2;
	break;
case '-':result=num1-num2;
	break;
case '*':result=num1*num2;
	break;
case '/':result=num1/num2;
	break;
default:
	System.out.println("Enter Correct Operator");
}
System.out.println("Result = "+result);

}
}