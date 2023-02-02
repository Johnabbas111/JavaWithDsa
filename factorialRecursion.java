public class factorialRecursion{
    public static int fact(int n){
        if(n==0||n==1){
            return 1;




        }
        int factorial=0;
        factorial+=n*fact(n-1);
        return factorial;


    }
    public static void main(String[] args){
        int ans;
       ans= fact(5);
        System.out.print(ans);

    }
}