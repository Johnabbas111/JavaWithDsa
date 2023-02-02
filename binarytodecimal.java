import java.util.*;
public class binarytodecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();
        int pw = 1;
        int ans = 0;
        while (binary_num >0) {
            int num = (binary_num) % 10;
            num *= pw;
            ans += num;
            pw *= 2;
            binary_num = (binary_num) / 10;
        }
        System.out.print(ans);

    }





}