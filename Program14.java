import java.util.Scanner;

class Program14
{
public static int primeNo(int num)
{
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
return num;
else
return 0;
}
public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
for(int i=1;i<=100;i++)
{
if(primeNo(i)>0)
System.out.print(i+" ");
}
}
}