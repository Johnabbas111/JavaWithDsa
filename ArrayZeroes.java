import java.util.*;


public class ArrayZeroes{

    static void printArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    static void arraySort(int[] arr){
        int n=arr.length;
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;

            }else{
                arr[i]=1;
            }

        }


    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void printZeroesAndOnes(int[] arr){
        int n=arr.length;
        int left=0;int right=n-1;
        while(left<right){
            if(arr[left]==0&&arr[right]==1){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }


    }


    public static void main(String[] args){
        System.out.println("enter the size of Array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter the array element");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();

        }
        printArray(array);
        //arraySort(array);
        System.out.println("Sorted array is");
       // printArray(array);
        printZeroesAndOnes(array);
        printArray(array);


    }
}