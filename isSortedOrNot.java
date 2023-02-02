import java.util.*;
public class isSortedOrNot{
    public static void printArr(int[] arr){
        System.out.println("the Input Array Is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
        System.out.println();



    }
    public static boolean isSorted(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                check=false;
                break;
            }
        }
        return check;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int x=sc.nextInt();
        int[] arr=new int[x];

        System.out.println("please enter the array elemets");
        for(int i=0;i<=arr.length;i++){
            arr[i]=sc.nextInt();
            printArr(arr);
            System.out.println(isSorted(arr));


        }



    }
}