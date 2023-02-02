import java.util.ArrayList;


public class Arraylist{
    public static void main(String[] args){
        //Wrapper classes
       // Integer i=Integer.valueOf(2);

         //System.out.println(i);
         Float f=Float.valueOf(4.5f);
         System.out.println(f);
         ArrayList<Integer>l1=new ArrayList<>();
        //add a new elements
         l1.add(6);
         l1.add(9);
         l1.add(7);
         l1.add(8);
         //get an element at index i
        System.out.println(l1.get(1));
        //output is 7
        //print with for loop
        for(int i=0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        //print the array list directly
        System.out.println(l1);

        // adding element at some index i
        l1.add(1,100);
        System.out.println(l1);
        //modefiy element at index i
        l1.set(1,10);
        System.out.println(l1);//[5,10,6,7,8]
        //removing element at index i
        l1.remove(1);
        System.out.println(l1);
        //removing an element
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
        //checking if elemnt exist or not
        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);
        //if you don t specify class ,you can put anythink inside l
        ArrayList l=new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);

v





    }
}