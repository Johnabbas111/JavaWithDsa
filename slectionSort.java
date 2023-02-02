public class slectionSort{
    static void SelectionSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            int min_idx=i;
            for(int j=i+1;j< n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }



            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    }
    public static void main(String[] args){
        int[]arr={7,4,1,2,100,90};
        SelectionSort(arr);
        for(int  i :arr) {
            System.out.print(arr[i]+" ");
        }

        }

    }

