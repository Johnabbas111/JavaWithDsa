class SsumArray{
    void Sum(){
        int[] array={1,5,3};
        int sum=0;
        for(int i=0;i<=array.length-1;i++){
            sum+=array[i];

        }
        System.out.println(sum);



    }

}



public class Main7{
    public static void main(String[] args){

        SsumArray obj=new SsumArray();
        obj.Sum();



    }
}