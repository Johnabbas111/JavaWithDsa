import java.util.Scanner;
public class AddToNum{
    public static void Sum(int a,int b){
        int c=a+b;
        System.out.println(c);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        Sum(a,b);
    }

}