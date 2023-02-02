public class firstlast{
    public static int first=-1;
    public static int last=-1;
    public static void occurance(String s,int idx,char element) {
        if(idx==s.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = s.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

       occurance(s,idx+1,element);

    }
    public static void main(String[] args){

        String s="abaaacdacfaah";
        occurance(s,0,'a');
    }
}