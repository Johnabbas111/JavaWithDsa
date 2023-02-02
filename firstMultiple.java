import java.util.Scanner;
public class firstMultiple{
    public static void main(String[] args){

        int num=1;

        while(true){
            if(num%5==0 && num%7==0){
                System.out.println( "the number is a multiple of both 5 and 7:"+num);
                break;

            }
            num++;



        }

    }
}