import java.util.*;
public class countDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int originaln=number;
        int counter = 0;
        while(number>=0){
            number=number/10;
            counter++;




        }
        System.out.println( originaln +counter);
    }

}

