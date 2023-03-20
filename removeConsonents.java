public class removeConsonents{
    public static void main(String[] args){
        String s="hello have a good day";

        String str2="";
        for(int i=0;i<s.length()-1;i++){
            char[] arr={'a','e','i','o','u'};
            for(int j=0;j<arr.length-1;j++){
                if(s.charAt(i)!=arr[j]){
                    str2= str2+s.charAt(i);

                }
            }
        }
        System.out.print(str2);
    }
}