import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i,b=0;
        for(i=0;i<=a;i++){
            b=b+i;
            System.out.println(b);
        }
    }
}
