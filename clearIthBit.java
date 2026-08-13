public class clearIthBit {
    public static int clearithBit(int n, int i){
        int bitMask= ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i, int newBit){
        n=clearithBit(n, i);
        return n | (newBit<<i);
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2,1));
        
    }
    
}
