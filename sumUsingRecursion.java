public class sumUsingRecursion{
    public static void sumRecursion(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.print(sum);
            return;

        }
        sum+=i;
        sumRecursion(i+1,n,sum);


        sumRecursion(i+1,n,sum);




    }
    public static void main(String[] args){
        int i=1;
        int n=8;
        int sum=0;
        sumRecursion(i,n,sum) ;

    }


}
