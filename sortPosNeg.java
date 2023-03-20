public class sortPosNeg{
    static void sortPosNeg2(int[] arr){
        int n=arr.length;
        //imaginary pivot

        int p=0;
        int l=0;
        int r=n-1;
        while(l<r){
            if(arr[l]<0){
                l++;

            }
            if(arr[r]>=0){
                r--;
            }else{
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;



            }
        }


    }
    public static void displayArr(int[] arr){
        for(int val:arr){
            System.out.print(" "+val);
        }
    }
    public static void main(String[] args){
        int[] arr={19,-20,7,-4,-13,11,-5,3};
        sortPosNeg2(arr);
        displayArr(arr);

    }

}