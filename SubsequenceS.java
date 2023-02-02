import java.util.*;
public class SubsequenceS{
    public static void Subsequences(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;

        }
        char currChar=str.charAt(idx);
        //to be  in
        Subsequences(str,idx+1,newString+currChar);

        //not to be in
        Subsequences(str,idx+1,newString);
    }
    public static void main(String[] args){
        String str="abc";
        Subsequences(str,0,"");
    }


}