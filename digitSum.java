import java.util.*;
public class digitSum{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int original_n=n;
        while(n>0){
            sum += n % 10;
            n = n / 10;
        }
        System.out.print("the sum of a number:"+original_n+"="+sum);

    }

}