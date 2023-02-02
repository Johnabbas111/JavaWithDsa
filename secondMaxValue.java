import java.util.*;


public class secondMaxValue{
    public static int secondMax(int[] arr){
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            if(arr[i]>mx){
                mx=arr[i];

            }
        }
        return mx;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        int[] arr=new int[n];
        for(int i=0;i<=n;i++){
            arr[i]= sc.nextInt();

        }
        System.out.println(secondMax(arr));

    }
}