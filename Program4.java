import java.util.Scanner;

class Program4
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num;
System.out.print("Enter a Number : ");
num=stdin.nextInt();
if(num%2==0)
System.out.println(num+" is Even");
else
System.out.println(num+" is Odd");

}
}