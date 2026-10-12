import org.w3c.dom.Node;

public class LLAssignment{
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
       

    };
     public static Node head;
        public static Node tail;
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        return ;
    }
   public Node getIntersectionPoint(Node head1,Node head2){
    while(head1!=null){
        Node temp=head2;
        while (temp!=null) {
            if (temp==head1) {
                return head1;
            }
            temp=temp.next;
            
        }
        head1=head1.next;

    }
    return null
    ;
   }
   public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
    }
   public static void printMdeleteM(int n , int m){
    Node curr=head,t;
    int count;
    while(curr!=null){
        for(count=1;count<m && curr!=null; count++){
            curr=curr.next;
        }
        if(curr==null){
            return ;
        }
        t=curr.next;
        for( count=0; count<n && t!=null; count++){
            
            t=t.next;

        }
        curr.next=t;
        curr=t;
    }


   }
   public void swap( Node prevX, Node prevY){
   

    Node X = prevX.next;

    Node Y = prevY.next;

    Node temp = X.next;

    X.next = Y.next;

    Y.next = temp;

    prevX.next = Y;

    prevY.next = X;

   }
   public Node keyPrev(int key1){
    Node temp=head;
    Node prev=null;
    Node X=null;
    while (temp!=null) {
        prev=temp;
        if (temp.next.data==key1) {
            X=temp.next;
           return prev;
        }
        temp=temp.next;
         }
         
         return null;
   }
    public void oddEven(){
        if(head==null || head.next==null){
            return ;
        }
        Node end=head;
        Node prev=null;
        Node curr=head;
        while(end.next!=null){
            end=end.next;
        }
        Node new_end=end;
        while(curr.data%2!=0 && curr!=end){
            new_end.next=curr;
            curr=curr.next;
            new_end.next.next=null;
            new_end=new_end.next;


        }
        if(curr.data%2==0){
            head=curr;
            while(curr !=end){
                if (curr.data%2==0) {
                    prev=curr;
                    curr=curr.next;
                    
                }else{
                    prev.next=curr.next;
                    curr.next=null;
                    new_end.next=curr;
                    new_end=curr;
                    curr=prev.next;


                }
            }
        }else{
            prev=curr;
        }
        if(new_end!=end && end.data%2!=0){
            prev.next=end.next;
            end.next=null;
            new_end.next=end;
        }

    }
    public static void main(String[] args) {
        LLAssignment ll=new LLAssignment();
        // Node head1,head2;
        // head2=new Node(1);
        // Node temp2=new Node(2);
        // head2.next=temp2;
        // temp2=new Node(3);
        // head2.next.next=temp2;
        //  temp2=new Node(6);
        //   head2.next.next.next=temp2;
        //   temp2=new Node(7);
        //   head2.next.next.next.next=temp2;
          


        // head1=new Node(4); 
        // Node temp=new Node(5);
        // head1.next=temp;
        //  head1.next.next=head2.next.next.next;

    
        // System.out.println(ll.getIntersectionPoint(head1,head2).data);


    //     ll.addFirst(10);
    //     ll.addFirst(9);
    //     ll.addFirst(8);
    //     ll.addFirst(7);
    //     ll.addFirst(6);
    //     ll.addFirst(5);
    //     ll.addFirst(4);
    //     ll.addFirst(3);
    //     ll.addFirst(2);
    //     ll.addFirst(1);
    // //    ll.print();
    //    ll.printMdeleteM(2,3);
    //    ll.print();
        ll.addFirst(6);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(8);
        ll.print();
        ll.oddEven();
        ll.print();
        // ll.swap( ll.keyPrev(2),  ll.keyPrev(4));
        // ll.print();
     

        //  ll.print();
        //  ll.swap(2, 4);
        //  ll.print();

    



       


        
    }

    
}