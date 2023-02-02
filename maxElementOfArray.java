public class maxElementOfArray{
    public static void main(String[] args){
        int[] arr={5,3,6,2,8,4};
        int ans=0;
        for(int i=0;i<arr.length; i++){
            if(ans<arr[i]){
                ans=arr[i];


            }

        }
        System.out.println("the max value is"+" " +ans);
    }
}