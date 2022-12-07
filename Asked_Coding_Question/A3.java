//linkedlist implementation and optimized ways of reversing it.
import java.util.*;
class A3 {
  class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static int size=0;
    static Node head;
    static Node tail;

    public void addFirst(String data)
    {
        ++size;
        if(head==null)
        {
            Node newNode=new Node(data);
            head=tail=newNode;
            return;
        }
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data)
    {
        ++size;
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }


    public void removeFirst()
    {
        if(head==null)
        {
            return;
        }
        if(size==1)
        {
            --size;
            head=tail=null;
            return;
        }
        --size;
        head=head.next;
    }


    public void removeLast()
    {
        if(head==null)
        {
            return;
        }
        if(size==1)
        {
            --size;
            head=tail=null;
            return;
        }
        --size;
        Node temp=head;
        for (int i = 0; i < size-2; i++) {
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }

    public void traverse(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println(" ");
    }

    //reverse an linkedlist.
    public void iterativereverseLinkedList()
    {
    Node prev=head;
    Node curr=head.next;
    while(curr!=null && prev !=null)
    {
        Node nex=curr.next; 
        curr.next=prev;

        //update
        prev=curr;
        curr=nex;
    }
    head.next=null;
    head=prev;
   }

   public Node recursiveReverseLinkedList(Node head)
   {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newHead=recursiveReverseLinkedList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
   }

    public static void main(String[] args) {
    A3 list=new A3();
    System.out.println("size of linked list before adding any element: "+A3.size);
    list.addLast("girl");
    list.addFirst("good");
    list.addFirst("is");
    list.addFirst("Pooja");
    list.addFirst("momdu");
    list.removeFirst();
    list.traverse(head);
    System.out.println("size of linked list: "+A3.size);
    System.out.println("reverse a linkedlist in iterative way :");
    list.iterativereverseLinkedList();
    list.traverse(head);  
    A3.head=list.recursiveReverseLinkedList(A3.head); 
    System.out.println("reverse recursive linked list:");
    list.traverse(A3.head);
    }    
}
