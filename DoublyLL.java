

public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;
       public  Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
       }
    }
        public static Node head;
        public static Node tail;
         public static int size;


    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        
        return ;


    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            head=tail=null;
            size--;

        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<-->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    

    public void addLast(int data){

        Node newNode = new Node(data);

        if(head == null){

            head = tail = newNode;

            size++;

            return;

        }

        tail.next = newNode;

        newNode.prev = tail;

        tail = newNode;

        size++;

    }
    public void removeLast(){
        if(head==null){
            System.out.println("Dll is epmty");
            return ;
        }
        if(size==1){
            head=tail=null;
            size--;
            return ;

        }
        tail.prev.next=null;
        tail=tail.prev;
         size--;
        return ;


    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
        return ;
    }
        public static void main(String[] args) {
            DoublyLL Dll=new DoublyLL();
            Dll.addFirst(1);
            Dll.addFirst(2);
            Dll.addFirst(3);
            Dll.print();
            Dll.reverse();
            Dll.print();
            //  System.out.println(size);
            // Dll.addLast(5);
            //  Dll.addLast(6);
            //  Dll.addLast(7);
            //  Dll.removeLast();
            //   Dll.removeLast();
              
            // Dll.print();
            // System.out.println(size);


        }
}
