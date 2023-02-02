import java.util.Arrays;

public class duplicateString{
    public static boolean[] map=new boolean[26];
    public static void findDublicate(String str,int idx ,String newstring){
        if(idx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            findDublicate(str,idx+1,newstring);

        }else{
            newstring+=currChar;
            map[currChar-'a']=true;
            findDublicate(str,idx+1,newstring);
            }

    }
    public static void main(String[] args){
        String v="abbccda";




        findDublicate(v,0," ");


    }
}
