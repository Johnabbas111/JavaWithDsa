public class fixTiles{
    public static  int PlaceTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;

        }
        //vertical
        int vertPlacements=PlaceTiles(n-m,m);
        //placehorizontal
        int horiPlacements=PlaceTiles(n-1,m);
        return vertPlacements + horiPlacements;


    }
    public static void main(String[] args){
        int n=4;
       int m=2;
       System.out.println(PlaceTiles(n,m));


    }
}