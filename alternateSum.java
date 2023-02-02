import java.util.*;
public class alternateSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int original_n=num;
        int sumalternate=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sumalternate+=i;

            }else{
                sumalternate-=i;

            }
        }
        System.out.print("the sum of number alternate is :"+original_n+"="+"is"+sumalternate);

    }


}
