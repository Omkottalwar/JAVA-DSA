public class RecursionAssignment {
    public static void occurence(int key,int arr[],int indx){  
         if(indx==arr.length){
            return ;

        }
        if(arr[indx]==key){
            System.out.print(indx);
            ;
        }
        occurence(key, arr, indx+1); 
    };
   static  String digest[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
   
    public static void numToStr(int n){
         
        if(n==0){
            return ;
        }
        int lastNum=n%10;
        numToStr(n/10);
        System.out.print(digest[lastNum]+" ");

        

    }
    
    public static void strLen(String str,int indx,int count){
         
        if(indx==str.length()){
           System.out.println(count);
           return ;
        }

        strLen(str, indx+1,count+1);
       

}

public static void towerOfHanoi(int n, String src, String helper, String dest) {


        if (n == 1) {

            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

            return;

        }

        towerOfHanoi(n - 1, src, dest, helper);


        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);

  

        towerOfHanoi(n - 1, helper, src, dest);}

  public static void main(String[] args) {
    int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
    towerOfHanoi(3, "S", "H", "D");
    
  }
    
}
