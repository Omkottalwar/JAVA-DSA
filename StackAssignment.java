import java.util.*;
public class StackAssignment {
    public static class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
            this.next=null;
        }
      
    }
     public  static Node head;
    public static Node tail;
    public void addFirst(char data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;    
        }
    }
public static boolean isPalindrome(){
    Stack<Character> s=new Stack<>();
    Node temp=head;
        while (temp!=null) {
            s.push(temp.data);
            temp=temp.next;    
        }
       
       Node temp1=head;
       while(temp1!=null && !s.isEmpty()){
        if(temp1.data!=s.pop()){
            return false;
        }
        temp1=temp1.next;
       }
       return true;
}
public static String simplifyPath(String path){
    String[] parts=path.split("/");
    Stack<String> s=new Stack<>();
    for(int i=0; i<parts.length; i++){
        if(parts[i].equals("")|| parts[i].equals(".")){
            continue;
        }else if(parts[i].equals("..")){
            if(!s.isEmpty()){
                s.pop();
            }
            }else{
                s.push(parts[i]);
        }
    }
   StringBuilder result = new StringBuilder();

    for(String str : s) {

        result.append("/");

        result.append(str);

    }

    if(result.length() == 0) {

        return "/";

    }

    return result.toString();


}
public static String decodeString(String str) {
     Stack<Integer> counterStack=new Stack<>();
     Stack<String> stringStack=new Stack<>();
     StringBuilder current= new StringBuilder();
     int num=0;
   for(int i=0; i<str.length(); i++){
    char ch=str.charAt(i);
    if(Character.isDigit(ch)){
        num=num*10 + (ch -'0');

    }else if(ch == '['){
        counterStack.push(num);
        stringStack.push(current.toString());
        num=0;
        current=new StringBuilder();

    }else if(Character.isLetter(ch)){
        current.append(ch);
    }else if(ch==']'){
        int count =counterStack.pop();
        StringBuilder temp= new StringBuilder();
        for(int j=0; j<count; j++){
            temp.append(current);
        }
        current=new StringBuilder(stringStack.pop() + temp);
    }

   }

 return current.toString();

    }

    public static int trap(int arr[]){
        Stack<Integer> s=new Stack<>();

        int trappedWater=0;
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
             int curr=s.pop();
              if(s.isEmpty()){
                break;
              }

            int distance=i-s.peek()-1;
            int height=Math.min(arr[i], arr[s.peek()])-arr[curr];
             trappedWater += distance * height;

            }
            s.push(i);
           
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        StackAssignment s=new StackAssignment();
        // s.addFirst('A');
        // s.addFirst('B');
        // s.addFirst('C');
        // s.addFirst('B');
        // s.addFirst('A');
      int arr[]={7,0,4,2,5};


        System.out.println(trap(arr));
        
        
        
        
       
    
        
    }
}
