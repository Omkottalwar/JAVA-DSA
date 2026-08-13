public class bitOddEven {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) ==0){
            System.out.print("Even ");

        }else{
            System.out.print("Odd ");

        }
    }
    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(4);
        oddOrEven(7);

    }
    
}
