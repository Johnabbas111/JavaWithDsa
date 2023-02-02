import java.util.*;
public class ArrayAdd{
    static void printMatrix(int[][]Matrix){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] add(int[][]a,int r1,int c1,int[][]b,int r2,int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("Wrong Input-Addition Not Possiblr");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=a[i][j]+b[i][j];

            }
            return sum;
        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows and columns");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][]arr=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]= sc.nextInt();

            }
        }
        System.out.println("Enter the no of rows and columns of second array");

        int r2=sc.nextInt();
        int c2= sc.nextInt();
        int[][]arr2=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]= sc.nextInt();

            }
        }
        System.out.println("Matrix 1");

        printMatrix(arr);
        System.out.println("Matrix 2");
        printMatrix(arr2);

         int [][]arr3=add(arr,r1,c1,arr2,r2,c2);
        System.out.println("The Sum Of 2dArray is");
        printMatrix(arr3);






    }
}