import java.util.*;
public class ageGroups{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age<12){
            System.out.println("the group belong to child:" +age);
        }else if(age>12&&age<18){
            System.out.println("the group of belonging is tennage:" +age);
        }else{
            System.out.println("Adult" +age);
        }





    }
}