public class stringRecursion{
    public static void stringReverse(String b,int idx){
        if(idx==0){
            System.out.println(b.charAt(idx));
            return;
        }
        System.out.println(b.charAt(idx));

        stringReverse(b ,idx-1) ;

    }
    public static void main(String args[]){

        String s="abcd";
        stringReverse(s, s.length()-1);
    }

}