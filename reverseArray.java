public class reverseArray{



  static  int[] reverseArrayGiven(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int j=0;
        //traverse original array in reverse direction\
        for(int i=n-1;i<=0;i--){
            ans[j++]=arr[i];

        }
        return ans;



    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }
    public static void main(String[] args){
        int a=9;
        int b=3;
        int[] arr={1,2,3,4,5};
        int[] ans=reverseArrayGiven(arr);
        printArr(ans);






    }


}