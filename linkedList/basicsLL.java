public class basicsLL {
    public static void display(Node head){
        Node temp = head;
        System.out.println("Linked List using while loop by method display:");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void displayRecursive(Node head){
        
        if(head == null){
            return;
        }
        System.out.println(head.data);
        displayRecursive(head.next);
        
    }
    public static class Node{
        int data; // it contains the data part of the node
        Node next; // it contains the address of the next node
        Node(int data){
            this.data = data;
        }

    }
    public static void main(String[] args) {
        Node a = new Node(5);
        //System.out.println(a.next);
        // System.out.println(x.data);
        // System.out.println(x);
        // System.out.println(x.next);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(17);
        // 5 3 8 9 17
        a.next = b; //linking a to b 5->3 8 9 17
        b.next = c; //linking b to c 5->3->8 9 17
        c.next = d; //linking c to d 5->3->8->9 17
        d.next = e; //linking d to e 5->3->8->9->17

        // System.out.println(a.next);
        // System.out.println(b); // both will give the same address
        // System.out.println(a.next.data);
        // System.out.println(b.data); // both will give the same data

        // Displaying the linked list
        System.out.println("Linked List:");
        // System.out.println(a.data);
        // System.out.println(a.next.data); // or System.out.println(b.data);
        // System.out.println(a.next.next.data);// or System.out.println(c.data);
        // System.out.println(a.next.next.next.data); // or System.out.println(d.data);
        // System.out.println(a.next.next.next.next.data); // or System.out.println(e.data)

        // Node temp = a; // temp is pointing to head node
        // for(int i=0;i<5;i++){ 
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }
        // always we do not have the size of linked list
        // so we will use while loop

        // System.out.println("Linked List using while loop:");
        // while(temp!= null){
        //     System.out.println(temp.data);
        //     temp = temp.next;
        // }

        display(a); // passing head node to the method display

        displayRecursive(a); // passing head node to the method displayRecursive

    }
}
