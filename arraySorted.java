import java.util.Scanner;
public class arraySorted{

    public static boolean sortedorNot(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){



            sortedorNot(arr ,idx+1);
            return true;

        }else{

            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int[] array=new int[n];
        for(int i=0;i<=n;i++){

            Scanner bc=new Scanner(System.in);
            array[i]=bc.nextInt();
            System.out.print("the element of arrays are"+array[i]);

            System.out.print(sortedorNot(array,0));
            return ;



        }
    }
}