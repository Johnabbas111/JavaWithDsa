class Algebra{
  //  int a=10;//member variable of class
   // int b=5;
    int Add(){
        int p=100;
        int q=20;
        return p+q;

    }
    //int Sub(){
        //return a-b;

   // }
    void demo(){
        int a=20;
        System.out.println(a);
       // System.out.println(b);//b can not be access here outside the block
        {
            int b=30;
            System.out.println(b);
        }
        {
            int b=100;
            System.out.println(b);

        }

    }
}



public class Main4{
    public static void main(String[] args){
        Algebra obj=new Algebra();
        obj.demo();

    }

}