public class setIthBit {
    public static int setithBit(int n, int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        System.out.print(setithBit(10,2));

    }
    
}
