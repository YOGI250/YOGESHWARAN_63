import java.util.*;
public class prime
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if(n==1)
{
System.out.println("1 is a composite number");
}
for(int i=2;i<=n;i++)
{
if(n%i==0)
{
System.out.println("not a prime");
}
}
else
{
System.out.println("Prime number");
}
}
}