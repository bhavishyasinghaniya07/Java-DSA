// code - 2
// Program to create , detect and remove cycle in a LL




public class Linkedlist2{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail; 

    public void addAtLast(int data){
        Node newNode = new Node(data);

        
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
        

    }

    public void printLl(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void createCycle(){
        Node temp = head;

        for (int i = 0; i < 5; i++) {
            temp = temp.next;

        }

        temp.next = head;
    }


    // A method to detect cycle in a LL using slow fast tecnique


    public void detectCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                System.out.println("Cycle detected");
                return;
            }

            
        }

        System.out.println("No cycle detected");
            return;
    }



    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){

                cycle = true;
                break;
                
            }

        }

            if(cycle == false){
                System.out.println("No cycle detected");
                return;
            }
                slow = head;
                Node prev = null;

                while(slow!=fast){
                    prev = fast;
                    slow = slow.next;
                    fast = fast.next;
                }


                prev.next = null;
            
          
    }
 

    public static void main(String[] args) {
        Linkedlist2 ll2 = new Linkedlist2();
        // ll2.addAtLast(20);
        // ll2.addAtLast(30);
        // ll2.addAtLast(40);
        // ll2.addAtLast(50);
        // ll2.addAtLast(60);
        // ll2.addAtLast(70);
        // ll2.addAtLast(80);
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // ll2.createCycle();
       
        ll2.removeCycle();
        ll2.printLl();
        
    }
}