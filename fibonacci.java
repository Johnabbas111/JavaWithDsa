import java.util.*;
public class fibonacci{
    static int fibonacciN(int n){
        if((n==0)||(n==1)){
            return n;
        }

        return fibonacciN(n-1)+fibonacciN(n-2);

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(" "+fibonacciN(i));

        }

    }
}