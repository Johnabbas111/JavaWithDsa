import java.util.*;
public class reverseNum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int original_num=number;
        int reverseNum=0;
        while(number>0){

            reverseNum=reverseNum*10+number%10;
            number/=10;



        }
        System.out.print("the reverse of a number  :"+original_num+"="+"is"+reverseNum);
    }

}