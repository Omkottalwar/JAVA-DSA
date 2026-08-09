public class StringCompression {
    public static String compress(String str){
        String compressed="";
        
        for(int i=0; i<str.length(); i++){
            int count=1;
          while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
            count++;
            i++; 
             }
             compressed+=str.charAt(i);
             if(count > 1){
                compressed += count;
             }    

        }
        return compressed;
    }
    public static void main(String args[]){
        String str="abcc";
        System.out.print(compress(str));

    }
}
