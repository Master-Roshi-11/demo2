import java.util.Scanner;

class Program8
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int angle1,angle2,angle3;
System.out.print("Enter Angle 1 : ");
angle1=stdin.nextInt();
System.out.print("Enter Angle 2 : ");
angle2=stdin.nextInt();
System.out.print("Enter Angle 3 : ");
angle3=stdin.nextInt();
if((angle1+angle2+angle3) > 180)
System.out.println("Given Triangle is NOT Valid");
else
System.out.println("Given Triangle is Valid");
}
}