package jan25.Linkedlist;

public class LinkedList1 {
    private int size;

    public LinkedList1() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next=null;
            size++;
        }
    }

    // add-- first, last
    Node head;
   public void addFirst(String data){

        Node newnode=new Node(data);

        if(head ==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
    }

    //add-last

 public void addLast(String data){
        Node newnode=new Node(data);
        if(head ==null){
            head=newnode;
            return;
        }
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    // delete first
   public void deleteFirst(){
       if(head==null){
           System.out.println("list is empty");
       }
       size--;
       head=head.next;
    }

    //delete last
    public void deletelast(){
       if(head==null){
           System.out.println("list is empty");
       }
       size--;
       if(head.next==null){
           head=null;
       }
       Node SecondLast=head;
       Node lastnode=head.next;
       while(lastnode.next!=null){
           lastnode=lastnode.next;
           SecondLast=SecondLast.next;
       }
       SecondLast.next=null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args)
    {
        LinkedList1 list=new LinkedList1();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("this");

        list.printlist();

        list.deleteFirst();
        list.deletelast();

        list.printlist();

        System.out.println(list.getSize());
    }
}

