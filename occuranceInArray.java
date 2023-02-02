import java.util.*;


public class occuranceInArray{
    static int Arraycount(int[]array,int x){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                count++;
            }

        }
        return count;
    }




    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x= sc.nextInt();



        int[] Array=new int[n];
        for(int i=0;i<=n;i++){
            Array[i]=sc.nextInt();

        }
        System.out.println(Arraycount(Array,x));




    }
}