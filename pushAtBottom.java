import java.util.*;
public class pushAtBottom {
    public static  void pushAtBtm(Stack <Integer> s,int data){
      if(s.isEmpty()){
        s.push(data);
        return ;
      }
      int top=s.pop();
      pushAtBtm(s, data);
      s.push(top);
    }
    public static String reverseString(String str){
        Stack <Character> s=new Stack<>();
        int idx=0;
        while(idx < str.length()){
              s.push(str.charAt(idx));
              idx++;
        }
        StringBuilder newStr=new StringBuilder("");
        while (!s.isEmpty()) {
            newStr.append(s.pop());
        }
        return newStr.toString();
    }
    public static void reverseStack(Stack <Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBtm(s, top);

    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
            
        }
    //    String str="HelloWorld";
    //    System.out.println(reverseString(str));

    }
}
