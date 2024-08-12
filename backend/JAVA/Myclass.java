import java.util.Scanner;
public class Myclass{
public static void main(String []args){
int sum=0;
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
sum=sum+arr[i];
}
System.out.print(sum);
}
}