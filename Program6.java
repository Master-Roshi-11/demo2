import java.util.Scanner;

class Program6
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int salary;
double iTax;
System.out.print("Enter Salary : ");
salary=stdin.nextInt();
if(salary>300000)
iTax=salary*0.30;
else if(salary<300000 && salary >150000)
iTax=salary*0.20;
else
iTax=0;
System.out.println("Income Tax : Rs "+iTax);

}
}