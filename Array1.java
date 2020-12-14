package array1;
import java.util.Scanner;
class Array1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a array length");
int len = sc.nextInt();
int mark[] = new int[len];
for(int i=0;i<mark.length;i++)
{
System.out.println("Enter Marks");
mark[i] = sc.nextInt();
}
System.out.println("Enter a value");
int key = sc.nextInt();
for(int i=0;i<mark.length;i++)
{
	if(mark[i]==key)
	{
	 System.out.println("Key is present in index : "+i);
	}
}
}
}
