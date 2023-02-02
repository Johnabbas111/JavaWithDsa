public class moveX{

    public static void xAtend(String s,int idx,int count,String newString){
        if(idx==s.length()){
            for(int i=0;i<count;i++){
                newString+= 'x';
            }
            System.out.println(newString);
            return;
        }
      int currChar=s.charAt(idx);
      if(currChar=='x'){
          count++;
          xAtend(s,idx+1,count,newString);
        }else{
          newString+=currChar;
          xAtend(s,idx+1,count,newString);

        }

    }
    public static void main(String args[]){

        xAtend("axbcxxd",0,0,"  ");

    }
}