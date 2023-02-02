import java.util.*;
public class nNatural{
    static void recursionN(int n){
        if(n==1){
            System.out.print(" "+n);
            return;

        }
        System.out.print(" "+n);


        recursionN(n-1);


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recursionN(n);



    }
}