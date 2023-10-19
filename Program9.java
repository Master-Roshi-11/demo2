import java.util.Scanner;

class Program9
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num,fact=1;
System.out.print("Enter a Number : ");
num=stdin.nextInt();
for(int i=1;i<=num;i++)
fact=fact*i;
System.out.println("Factorial of "+num+" is "+fact);

}
}