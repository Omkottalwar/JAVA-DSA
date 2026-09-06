public class DuplicateInString {
    public  static void duplicate(String str, int idx,boolean map[],StringBuilder newStr){
        if(idx==str.length()){
            System.err.println(newStr);
            return;
        }
        char currChr=str.charAt(idx);
        if(map[currChr-'a']==true){
            duplicate(str, idx+1, map, newStr);
        }else{
            map[currChr-'a']=true;
             duplicate(str, idx+1, map, newStr.append(currChr));

        }
    }
   
    public static void main(String[] args) {
        duplicate("aab", 0, new boolean[26], new StringBuilder(""));
        
    }
}
