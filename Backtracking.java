public class Backtracking {
    public static void ChangeArr(int arr[],int i,int val){
        if(i==arr.length){
            print(arr);
            return ;
        }
        arr[i]=val;
        ChangeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printSubSets(String str,String newStr , int i){
        if(i==str.length()){
            if(newStr.length()==0){
                System.out.println("null");
            }else{
            System.out.println(newStr);
            }
            return ;
        }
        printSubSets(str, newStr+str.charAt(i), i+1);
        printSubSets(str, newStr, i+1);
    }
    public static void findPermutation(String str,String ans) {
        if (str.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0; i<str.length(); i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            findPermutation(newStr, ans+currChar);

        }
        
    }
    public static void main(String[] args) {
        // int arr[]=new int[5];
        // ChangeArr(arr, 0, 1);
        // print(arr);
        // printSubSets("abc", "", 0);
        findPermutation("abc", "");
        

        
    }
    
}
