// code - 3
// All the basics to implement Doubly Linkedlist >






public class doublyLinkedlist{

    public class Node{
        int data ;
        Node prev ;
        Node next ;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;


    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

    }

    public void printDll(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data  + "->");
            temp = temp.next;
        }
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next ;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        doublyLinkedlist dll = new doublyLinkedlist();
        dll.addFirst(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.addLast(40);
        dll.addLast(50);
        dll.addLast(60);
        dll.printDll();
        dll.reverse();
        dll.printDll();
    }
}