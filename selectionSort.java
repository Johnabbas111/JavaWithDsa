
public class selectionSort{
    public static void printArr(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(+arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={7,8,3,1,2};
        for(int i=0;i<=arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[j]>arr[i]){
                    smallest=j;
                }

            }
            int temp=arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }
        printArr(arr);
    }
}
