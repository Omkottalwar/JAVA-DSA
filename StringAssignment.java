import java.util.*;
public class StringAssignment {
    public static void countVowels(String str){
        int counta=0;
        int counte=0;
        int counti=0;
        int counto=0;
        int countu=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'a'){
                counta++;
            }
            else if(str.charAt(i)== 'e'){
                counte++;
            }
            else if(str.charAt(i)== 'i'){
                counti++;
            }
            else if(str.charAt(i)== 'o'){
                counto++;
            }
            else if(str.charAt(i)== 'u'){
                countu++;
            }
        }
        System.out.println("count a : "+ counta);
        System.out.println("count e : "+ counte);
        System.out.println("count i : "+ counti);
        System.out.println("count o : "+ counto);
        System.out.println("count u : "+ countu);
    }
    public static void anagram(String str1, String str2){
         str1=str1.toLowerCase();
         str2=str2.toLowerCase();
         if(str1.length() == str2.length()){
            char[] str1CharArray=str1.toCharArray();
            char[] str2CharArray=str2.toCharArray();
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);
            boolean result=Arrays.equals(str1CharArray, str2CharArray);
            if(result){
                System.out.print("Strings are anagram");

            }else{
                System.out.print("Strings are not anagram");
            }
         }else{
            System.out.print("Strings are not anagram");
         }

    }
    public static void main(String args[]){
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter a String : ");
        // String str=sc.nextLine();
        // countVowels(str);
        String str1="race";
        String str2="care";
        anagram(str1, str2);



    }
    
}
