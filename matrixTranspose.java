import java.util.*;

public class matrixTranspose{
    static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr);
            }
        }
    }
    static int[][]Transpose(int[][]arr,int r1,int c1) {
        int[][] ans = new int[c1][r1];
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }
    static void transposeInPlace(int[][]Matrix,int r,int c) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = i; j < Matrix[i].length; j++) {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;

            }
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the array");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int[][]arr1=new int[r1][c1];
        System.out.println("Enter the array elements");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
       /* printArray(arr1);
        Transpose(arr1,r1,c1);
        printArray(arr1);*/
                transposeInPlace(arr1,r1,c1);


    }
}

