import java.util.Scanner;

class Program3
{
public static void swapNumber(int[] arr)
{
int temp;
temp=arr[0];
arr[0]=arr[1];
arr[1]=temp;


}

public static void main(String atgs[])
{
Scanner stdin=new Scanner(System.in);
int[] arr=new int[2];
System.out.print("Enter Number 1 ");
arr[0]=stdin.nextInt();

System.out.print("Enter Number 2 ");
arr[1]=stdin.nextInt();

System.out.println("Before Swapping A = "+arr[0]+" and B = "+arr[1]);
swapNumber(arr);
System.out.println("After Swapping A = "+arr[0]+" and B = "+arr[1]);
}
}