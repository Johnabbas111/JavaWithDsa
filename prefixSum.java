import java.util.*;
public class prefixSum{
    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }


    }
    static int[] makePrefixSumArray(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr);
        int[] pref=makePrefixSumArray(arr);
        printArray(pref);


    }
}