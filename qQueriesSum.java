import java.util.Scanner;

public class qQueriesSum{
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <n; i++) {
            System.out.println(arr[i]);
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
        for(int i=1;i<n;i++){
            arr[i]= sc.nextInt();
        }
        printArray(arr);
        int[] prefSum=makePrefixSumArray(arr);
        printArray(prefSum);
        System.out.print("Enter the number of queries");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter range");
            int l= sc.nextInt();
            int r= sc.nextInt();
            int ans=prefSum[r]+prefSum[l-1];
            System.out.println("Sum"+ans);

        }




    }








}