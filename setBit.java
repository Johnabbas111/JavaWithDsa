
import java.util.*;
public class setBit{
    public static void main(String args[]){
        int number =5;
        int pos =1;
        int bitMask=1<<pos;
        int newNumber=bitMask | number;
        System.out.println(newNumber);




    }
}