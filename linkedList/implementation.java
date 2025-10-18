public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class LL{
        Node head = null;
        Node tail = null;
        public void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                tail = temp;

            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }
        public void insertAtBeginning(int data){
           Node temp = new Node(data);
           if(head == null){
            head = temp;
            tail = temp;
           }
           else{
            temp.next = head;
            head = temp;
           }
        }
        public void insertAt(int idx,int data){
            Node temp = head;
            Node t = new Node(data);
            if(idx == 0){
                insertAtBeginning(data);
                return;
            }
            if(idx == length()){
                insertAtEnd(data);
                return;
            }
            if(idx < 0 || idx > length()){
                System.out.println("Invalid Index");
                return;
            }
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        public void getElementAt(int idx){
            Node temp = head;
            for(int i = 0;i<idx;i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        public void deleteAt(int idx){
            Node temp = head;
            for(int i =0;i<idx-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            int size = length();
            size--;
        }
        public void display(){
            Node temp = head;
            while(temp !=  null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        public int length(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        // ll.display();
        // // ll.length();
        // ll.insertAtBeginning(5);
        // ll.display();
        // ll.insertAt(3, 15);
        // ll.display();
        // ll.getElementAt(4);
        // ll.deleteAt(4);
        ll.display();
        ll.deleteAt(2);
        ll.display();
        
    }
    
}
