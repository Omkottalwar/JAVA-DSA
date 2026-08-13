public class clearLastIthbits {
    public static int clearithBit(int n, int i){
        int bitMask=(~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.err.print(clearithBit(15, 2));
        

    }
    
}
