 public class Backtracking{

    public static void printPerm(String str,String Per, int idx){
        if(str.length()==0){
            System.out.println(Per);
            return;

        }
        for(int i=0;i<str.length();i++){
            char CurrChar=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPerm(newstr,Per+CurrChar,idx+1);
        }
    }

    public static void main(String[] args){
        String str="ABC";
        String per=" ";
        printPerm(str,per,0);

    }
 }