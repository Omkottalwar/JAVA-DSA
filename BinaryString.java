public class BinaryString {
    public static void build(String str,int lastNum,int n){
        if(n==0){
            System.out.println(str);
            return ;
        }
        build(str+'0', 0, n-1);
        if(lastNum==0){
            build(str+'1', 1, n-1);

        }
    }
public static void main(String[] args) {
    build("", 0, 3);
    
}
    
}
