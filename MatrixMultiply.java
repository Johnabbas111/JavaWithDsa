import java.util.*;
public class MatrixMultiply{
    static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                System.out.println("matrix is"+" "+arr);

            }
            System.out.println();
        }




    }
    static void Multiply(int[][]a,int r1,int c1,int[][]b,int r2,int c2){
        if(c1!=r2){
            System.out.println("Multiplication not possible-Wrong Dimensions");
            return;
        }
        int [][] mul=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    /*
                    i=1,j=0
                    mul[i][j]=ith row of a *jth col of b
                     */
                    mul[i][j]+=(a[i][k]*b[k][j]);
                }

            }
        }
        System.out.println("Multiplication of 2 Matrices");
        printMatrix(mul);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns of first matrix");
        int r1=sc.nextInt();
        int c1= sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the Matrix1 elements");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        int r2=sc.nextInt();
        int c2= sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter the Matrix2 elements");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Matrix 1");
        printMatrix(arr1);
        System.out.println("Matrix 2");
        printMatrix(arr2);
        Multiply(arr1,r1,c1,arr2,r2,c2);





    }

}
