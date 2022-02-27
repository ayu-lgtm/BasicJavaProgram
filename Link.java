import java.util.Scanner;

//structure of link list node
class Node {
    int x;
    Node next;

    Node(int x) {
        this.x = x;
    }
}

public class Link {
    //print the linked list
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.x + " ");
            head = head.next;
        }

    }


    //serach a given value
    public static int search(Node head, int x) {
        int count = 1;
        boolean b = true;
        while (head != null) {
            if (head.x == x) {
                b = false;
                return count;
            }
            head = head.next;
            count++;
        }
        if (b == true) {
            return -1;
        }
        return count;

    }


    //insert at begining
    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);

        if (head == null) {
            return temp;
        }
        temp.next = head;
        return temp;
    }

    //delete first

    public static Node deleteFirst(Node head) {
        if (head == null) {
            return null;
        }
        System.out.println(head.x + " Deleted");
        head = head.next;

        return head;

    }

    //delete last

    public static Node deleteLast(Node head) {
        Node curr = head;
        if (curr == null) {
            return null;
        }
        while (curr.next.next != null) {
            curr = curr.next;
        }
        System.out.println(curr.next.x + " Deleted");
        curr.next = null;
        return head;
    }

    //insert at end
    public static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);

        if (head == null) {
            return temp;
        }
        if (head.next == null) {
            return null;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = temp;
        return head;
    }

    //Insert  At POsition Node

    public static Node insertPos(Node head, int pos, int x) {
        Node temp = new Node(x);
        Node curr = head;
        if (pos == 1) {
            return insertBegin(head, x);
        }

        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;

        return head;

    }

    //Delete at pos Node
    public static Node Deletepos(Node head, int pos) {

        Node curr = head;
        if (pos == 1) {
            return deleteFirst(head);
        }

        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }
        if (curr == null) {
            return head;
        }
        System.out.println(curr.x + " Deleted");
        curr.next = curr.next.next;
        return head;

    }

    //if link list sorted then InsertNode at Right position

    public static Node SortedIndser(Node head, int x) {
        Node temp = new Node(x);
        Node curr = head;

        if (head == null) {
            return temp;
        }
        if (x < head.x) {
            temp.next=head;
            return temp;
        }

        while (curr.next != null && curr.next.x < x) {
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    //middle node in linked list
    public static int middleNode(Node head) {
        if (head == null) {
            return -1;

        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.x;

    }


    //find out pos Node(right to left) Linked List
    public static int nthNodeReverse(Node head,int pos){
        Node fast=head;
        Node slow=head;
        if(head==null)return -1;
        for(int i=0;i<pos;i++){
            if(fast==null)return -1;
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow.x;
    }

    //Reverse Linked List
    public static Node reverse(Node head){

        Node curr=head;
        
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;

        }
        return prev;
    }

    //Duplicates in LinkedList Sorted
    public static void Removeduplicates(Node head){

        if(head==null)
        {
            return;
        }
        Node curr=head;
        while(curr!=null && curr.next!=null){
            
            if(curr.x==curr.next.x){
               
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        //head = insertBegin(head, 7);
        head = insertBegin(head, 6);
        head = insertBegin(head, 5);
        head = insertBegin(head, 4);
        head = insertBegin(head, 3);
        head = insertBegin(head, 2);
        head = insertBegin(head, 1);

        //print(head);

        //System.out.print("\n");

        // head = deleteFirst(head);
        // head = deleteLast(head);

        // head = insertPos(head, 2, 9);
        // head=Deletepos(head, 2);

        head = SortedIndser(head, 4);

        print(head);

        System.out.print("\n");

        //System.out.println(middleNode(head));

        //System.out.println(nthNodeReverse(head,2));

        Removeduplicates(head);

        print(head);

        //System.out.print("\n");
        //head=reverse(head);

        //print(head);
    
        sc.close();
    }
}
