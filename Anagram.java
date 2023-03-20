//just to test
public class Anagram{
    boolean flag=false;
    public static void main(String[] args){
        int[] arr={1,2,3,4,3,4,3,3,3};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==3){

                System.out.println(i);

                break;

            }

        }
    }
}