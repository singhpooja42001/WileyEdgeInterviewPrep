import java.util.HashMap;
//strivers code(take u forward)
//Code to clone a linkedlist of having next pointers as well as random pointers.
public class A6 {
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    //with auxilary space.
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hashmap=new HashMap<>();
        Node temp=head;
        while(temp!=null)
       {
           Node newlist=new Node(temp.val);
           hashmap.put(temp,newlist);
           temp=temp.next;
       }

       Node newTemp=head;
       while(newTemp!=null)
       {
        Node curr=hashmap.get(newTemp);
        curr.next=hashmap.get(newTemp.next);
        curr.random=hashmap.get(newTemp.random);
        newTemp=newTemp.next;
       }
       

        return hashmap.get(head);
    }
}
