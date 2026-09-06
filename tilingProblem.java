public class tilingProblem{
    public static int tilingWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tilingWays(n-1);
        int fnm2=tilingWays(n-2);
        return fnm1+fnm2;
    }
    public  static  void main(String args[]){
        System.out.println(tilingWays(3));

    }
}