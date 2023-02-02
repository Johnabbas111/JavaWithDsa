import java.util.*;
public class sumPartitions{
    static int findArraySum(int[] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;

    }
    static boolean equalSumPartition(int[] arr){
      int totalSum=findArraySum(arr);
      int prefixSum=0;
      for(int i=0;i<arr.length;i++){
          prefixSum+=arr[i];
          int SuffixSum = totalSum-prefixSum;
          if(SuffixSum==prefixSum){
              return true;

          }



      }
      return  false;




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the array elements");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();

        }
       boolean ans= equalSumPartition(array);
        System.out.println(ans);

    }
}

