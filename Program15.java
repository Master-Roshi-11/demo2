import java.util.Scanner;

class Program15
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int num;
System.out.print("Enter a Number : ");
num=stdin.nextInt();
System.out.println("Number : "+num);
StringBuffer ss=new StringBuffer(Integer.toString(num));
String txt=new String(ss.reverse());
num=Integer.parseInt(txt);
System.out.println("Reverse : "+num);

}
}