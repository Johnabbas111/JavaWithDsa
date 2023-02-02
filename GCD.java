

import java.util.*;
public class GCD{
    static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    static int funGCD(int a,int b){
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;





        }
        return b;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(funGCD(a,b));
        System.out.println(gcd(a,b));

    }
}

