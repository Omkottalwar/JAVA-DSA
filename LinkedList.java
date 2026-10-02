public class LinkedList {
    public static  class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }    
    }
   public  static Node head;
    public  static Node tail;
    public static int size;
    public void addFirst(int data){
        size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
         size++;
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
 System.out.print("LL is empty");
        }
        Node temp=head;
        while(temp !=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
        }
        System.out.println();
    }
    public  void add(int idx,int data){
         size++;
        if(idx==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){
            i++;
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            size=0;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int  removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val=head.data;
            tail=head=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;

        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    public int itrSearch(int key){
        Node temp=head;
        int idx=0;
        while(temp.next!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            



        }
        head=prev;
    }
    public void deleteNthFromEnd(int n ){
        int sz=0;
        Node temp=head;
        while (temp !=null) {
            temp=temp.next;
            sz++;
            
        }
        if(n==sz){
            head=head.next;
            return ;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while (i<iToFind) {
            prev=prev.next;
            i++;
            
        }
        prev.next=prev.next.next;
        return ;

    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast != null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;


        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head == null || head.next==null){
            return true;
        }
        Node mid=findMid(head);
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right !=null){
            if(left.data != right.data){
                return false;

            }
            right=right.next;
            left=left.next;

        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.print();
        System.out.println(ll.checkPalindrome());
        // ll.add(2, 3);
        
        // ll.print();
        // ll.deleteNthFromEnd(3);
        // ll.print();
        // System.out.println(ll.recSearch(4));

        // ll.removeFirst();

    
        // ll.print();
        // ll.removeLast();
        // ll.print();

        // System.out.println(ll.size);

        
    }
}
