import java.util.Scanner;

class Program12
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num,sum=0;
System.out.print("Enter a Number : ");
num=stdin.nextInt();
for(int i=1;i<=num;i++)
{
sum=sum+i;
System.out.print(i);
if(i==num)
break;
System.out.print("+");
}
System.out.print("="+sum);
}
}