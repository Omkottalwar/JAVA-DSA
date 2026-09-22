public class Keypad {
    public static void printCombinations(String keypad[],String digit,int i,String newStr ){
        if(i==digit.length()){
            System.out.println(newStr);
            return ;
        }
       int currdigit=digit.charAt(i)-'0';
       String letters=keypad[currdigit];
       for(int j=0; j<letters.length(); j++){
        char chr=letters.charAt(j);
        printCombinations(keypad, digit, i+1, newStr+chr);
       }


    }
    public static void main(String[] args) {
      String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
      printCombinations(keypad, "23", 0, "");
      
      
    }
    
}
