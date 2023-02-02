import java.util.*;
public class spiral2DMatrix{
    static void  printMatrix(int[][]matrix){
        System.out.println("The array is");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }
    }
    static void spiralMatrix(int[][]arr,int r, int c){
        int topRow=0; int bottomRow=r-1;int leftCol=0;int rightCol=c-1;
        int totalElements=0;
        while(totalElements<r*c) {
            for (int j = leftCol; j < rightCol && totalElements < r * c; j++) {
                System.out.println(arr[topRow][j] + " ");
                totalElements++;
            }
            for (int i=topRow; i<bottomRow && totalElements < r * c; i++) {
                System.out.println(arr[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            for (int j = rightCol; j>leftCol && totalElements < r * c; j++) {
                System.out.println(arr[bottomRow][j] + " ");
                totalElements++;
            }
            for (int i= bottomRow; i>topRow  && totalElements < r * c; i++) {
                System.out.println(arr[i][leftCol] + " ");
                totalElements++;
            }

        }





    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int r= sc.nextInt();
        System.out.println("Enter the size of columns");
        int c= sc.nextInt();
        int[][]arr=new int[r][c];
        System.out.println("Enter the matrix elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }


        }
        printMatrix(arr);
        spiralMatrix(arr,r,c);

    }
}