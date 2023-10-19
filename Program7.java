import java.util.Scanner;

class Program7
{
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
char ch;
boolean v=false;
System.out.print("Enter a Character : ");
ch=stdin.next().charAt(0);
char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
for(char c:vowel)
{
	if(ch==c)
	{
	v=true;
	break;
	}
}
if(v)
System.out.println(ch+" is Vowel");
else
System.out.println(ch+" is Consonent");
}
}