public class SL{
    public Node head;
    public Node tail;
    public SL(){
        head=null;
        tail=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
     
    public void push(String x){
        Node newNode=new Node(x);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=tail.next;
    }
    public String pop(){
        Node current=head;
        if(isEmpty()){
            return null;
        }
        else if(head.next==null){
            String val=head.data;
            head=null;
            tail=null;
            return val;
        }
        while(current.next.next!=null){
            current=current.next;
        }
        String val=current.next.data;
        current.next=null;
        tail=current;
        return val;
    }
    public String peek(){
        if(isEmpty()){
            return null;
        }
        return tail.data;
    }
} 