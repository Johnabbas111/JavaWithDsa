//how we can make multithread in java using interface runable


package MultiThreading;
import java.util.*;
class Calc extends Thread{
    public void run(){
        System.out.println("calculation Task Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1=sc.nextInt();
        System.out.println("Please enter the 2nd number");
        int num2=sc.nextInt();


        int res=num1+num2;
        System.out.println(res);
        System.out.println("Calculated task ended");
        System.out.println("----------------------------------------------------------------------");
    }


}
class Message extends Thread{
    public void run(){
        System.out.println("Displaying important message Task");
        try{
            for(int i=0;i<3;i++){
                System.out.println("focus is important to master skills");
                Thread.sleep(2000);

            }

        }
        catch(Exception e){
            System.out.println("some problem");

        }


        System.out.println("Displaying important message task ended");
    }

}
public class multiThread1{
    public static void main(String[] args){
        System.out.println("main Thread started");
        Calc t1=new Calc();
        Message t2=new Message();
        t1.start();
        t2.start();


    }

}
