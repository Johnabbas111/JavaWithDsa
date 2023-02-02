import java.util.*;
public class bitManupulation{
    public static void main(String[] args){
        int number=8;
        int pos=2;
        int bitMask=1<<pos;
        if((bitMask & number)==0){
            System.out.println("the bit is zero");
        }else{
            System.out.println("the bit isn't zero");
        }

    }

}
