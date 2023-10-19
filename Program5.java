import java.util.Scanner;

class Program5
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num;
System.out.print("Enter a Number : ");
num=stdin.nextInt();
if(num%5==0)
{
	if(num%7==0)
	{
	System.out.println(num+" is Divisible by 5 and 7 Both");
	}
	else
	{
	System.out.println(num+" is Divisible by Only 5");
	}
}
else if(num%7==0)
{
System.out.println(num+" is Divisble by only 7");
}
else
System.out.println(num+" is not Divisible by 5 or 7 Both");

}
}