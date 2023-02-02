import java.util.*;
public class powOfNum{
    public static int recursion1(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0) {
            return recursion1(x, n / 2) * recursion1(x, n / 2);
        }
    }
    public static void main(String[] args){
        int x=2;
        int n=4;
        int ans=recursion1(x,n);
        System.out.println(ans);


    }
}