import java.util.Scanner;
public class nNaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        for (int i = 0; i <= num; i++) {
            sum += i;

        }
        System.out.println("the sum is :" + sum);
    }


}