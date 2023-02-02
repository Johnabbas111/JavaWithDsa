import java.util.*;
public class rectangleSum{
    static int sumArray(int[][]arr,int r1,int r2 ,int l1 ,int l2){
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=l1;j<=l2;j++){
                sum+=arr[i][j];

            }
        }
        return sum;
    }
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(+arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of r and c");
        int r= sc.nextInt();
        int c= sc.nextInt();

        int[][]arr=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        printArray(arr);
        System.out.println("Enter the value of l1,l2,r1,r2");
        int r1= sc.nextInt();
        int r2= sc.nextInt();
        int l1= sc.nextInt();
        int l2=sc.nextInt();

       int sum= sumArray(arr,r1,r2,l1,l2);
       System.out.println(sum);


    }

}