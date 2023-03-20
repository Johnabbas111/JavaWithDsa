public class reverseString3{
    public static void main(String[] args){
        String str1="pwjava java";
        String str2=" ";
        String arr[]=str1.split(" ");
        for(int i=arr.length-1;i<=0;i--){
            str2=str2+arr[i]+" ";

        }
        System.out.print(str2);

    }
}