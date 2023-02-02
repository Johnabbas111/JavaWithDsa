 public class lastOccurance{
    static int lastSearchFind(int[] a,int b){
        int lastIndex=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                lastIndex=i;


            }
        }
        return lastIndex;
    }
    public static void main(String[] args){
        int x=5;
        int[] arr={3,4,5,6,5,7,5,4};
       System.out.println(lastSearchFind(arr,x)) ;


    }
 }