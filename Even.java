import java.util.*;
public class Even{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        String ans;
        ans= (number%2==0)?"even":"odd";
        System.out.println(ans);

    }
}