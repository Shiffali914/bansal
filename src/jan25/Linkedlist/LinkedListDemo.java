package jan25.Linkedlist;

public class LinkedListDemo
{
    public static class Node
    {
        Node next; //address of next node
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
       public static void main(String[] args)
       {
           Node a=new Node(5);
           Node b=new Node(3);
           Node c=new Node(9);
           Node d=new Node(10);
           Node e=new Node(16);

           a.next=b;    // it connect a node to b address of b is come in a node like 5 -> 3 9 10 16
           b.next=c;    // 5 -> 3 -> 9 10 16
           c.next=d;    // 5->3->9->10 16
           d.next=e;    //5->3->9->10->16

          display(a);

           //System.out.println(a.data+"->"+a.next.data+"->"+b.next.data+"->"+c.next.data+"->"+d.next.data+"->"+e.next);

          /* for(int i=1;i<=5;i++){
               System.out.println(temp.data+" ");
               temp=temp.next;
           }*/



       }


    }

