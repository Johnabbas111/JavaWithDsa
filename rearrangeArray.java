import java.util.*;

public class rearrangeArray{
    static void Swap(int[] array,int i,int j){
        int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
    }
    static void sortedArray(int[] array){
        int n=array.length;
        int left=0;int right=n-1;

        while(left<right){


            if(array[left]%2!=0&&array[right]%2==0){
                Swap(array,left,right);
                left++;
                right--;

            }

            if(array[left]%2==0){
                left++;
            }
            if(array[right]%2!=0){
                right--;
            }
        }
    }
    static void printArray(int[] array){
        System.out.print("the Array is");
        int n=array.length;
        for(int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("enter the array elements");
        int[] array=new int[n];
        for(int i=0;i<n;i++){

            array[i]= sc.nextInt();

        }
        printArray(array);
        sortedArray(array);
        printArray(array);


    }

}