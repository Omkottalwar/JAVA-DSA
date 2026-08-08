public class StringSubString {
    public static String printSubString( String str, int si, int ei){
        String sum="";
        for(int i=si; i<ei; i++){
            sum += str.charAt(i);
        }
        return sum;
    }
    public static void main(String args[]){
        String str="HelloWorld";
        System.out.print(printSubString(str, 0, 5));

    }
    
}
