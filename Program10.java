import java.util.Scanner;

class Program10
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int m,n;
System.out.print("Enter M : ");
m=stdin.nextInt();
System.out.print("Enter N : ");
n=stdin.nextInt();
System.out.println(m+" Power "+n+" is "+Math.pow(m,n));
}
}