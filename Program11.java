import java.util.Scanner;

class Program11
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num;
System.out.print("Enter a Number : ");
num=stdin.nextInt();
int fact=2;
for(int i=2;i<num;i++)
{
	if(num%i==0)
	{
	fact++;
	break;
	}
	
}
if(fact==2)
System.out.println(num+" is Prime Number ");
else
System.out.println(num+" is NOT Prime Number ");
}
}