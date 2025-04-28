// Code - 1
// All the basic methods and implementationn of linkedlist




import java.util.ArrayList;

public class Linkedlist {

    // Creating a Node 

    public static class Node {
        int data;
        Node next;

        // Constructer

        public Node(int data){
            this.data = data;
            this .next = null;
        }
    }

    // Declearing head and tail globally 

    public static Node head;
    public static Node tail;

    // Method to add data at first


    public void addFirst(int data){
        Node newNode = new Node(data);

        // if LL is empty 

        if(head == null){
            head = tail = newNode;
            return;
        }

  
        newNode.next = head;
        head = newNode;
    }

        // Method to add data at end

    public void addLast(int data){
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

        // Method to add data at any index


    public void addAtIndex(int data, int index){
        Node newNode = new Node(data);
        int i =0 ;
        Node temp = head;

        while(index-1 > i){
            temp = temp.next;
            i++;
        }
    
        newNode.next = temp.next;
        temp.next = newNode;

    }

        // Method to add data after any specific data


    public void addAfterData(int data , int value){
        Node newNode = new Node(data);

        Node temp = head;

        while(temp.data != value || temp.next!=null){
            temp = temp.next;
        }

        newNode.next = temp.next.next;
        temp.next = newNode;
    }

        // Method to remove data from first


    public void removeFromBeg(){
        if(head==null){
            System.out.println("Linkedlist Is Empty");
            return;
        }
        head = head.next;
    }

            // Method to remove data from last

    public void removeFromEnd(){
        if(head==null){
            System.out.println("Linkedlist Is Empty");
            return;
        }
        Node temp = head;

        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

                // Method to remove data from Mid

    public void removeFromMid(int index){
        Node temp = head;
      

        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }


            // Method to search data using loops


    public void iterativeSearch(int value){
        Node temp = head;
        int i =0;
        while(temp!=null ){
            i++;
            if(temp.data == value){
                System.out.println("The Data is found at index : " + (i-1));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data does not exist");
    }

                // Method to search data using recursion


    public void recursiveSearch(int value , Node temp , int i){
       
        if(temp==null ){
            System.out.println("Data does not exist");
            return;
        }

        recursiveSearch(value, temp.next, i+1);

        if(temp.data==value){
            System.out.println("The Data is found at index : " + (i));
            return;
        }
    }

                // Method to reverse Linkedlist using loops


    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next ;

        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }


                // Method to find length of LL



    public void length(){
        Node temp = head;
        int count = 0;

        while(temp!=null){
            temp = temp.next;
            count++;
        }
        System.out.println("Length : " + count);
    }


                // Method to print a LL


    public void printLl(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    // Check wheather a LL is Pailindrom or not using an extra array

    public void pailindrrom(){
        int arr[] = new int[11];
        int i = 0;
        Node temp = head;
        while(temp!=null){
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        
        
        for(int j=0;j<=arr.length/2;j++){
            if(j==arr.length/2){
                System.out.println("LL is Pailindrom");
                return;
            }
            if(arr[j]==arr[arr.length-1-j]){
                continue;
            }
            else{
                System.out.println("LL is not a Palindrom");
                return;
            }

        }
    }


    // Check wheather a LL is Pailindrom or not using an extra arraylist

    public void pailindrrom2(){
        
        ArrayList<Integer> arr = new ArrayList<>();

        Node temp = head;
        while(temp!=null){
            arr.add(temp.data);
            temp = temp.next;
        }

        
        
        for(int j=0;j<=arr.size()/2;j++){
            if(j==arr.size()/2){
                System.out.println("LL is Pailindrom");
                return;
            }
            if(arr.get(j)==arr.get(arr.size()-1-j)){
                continue;
            }
            else{
                System.out.println("LL is not a Palindrom");
                return;
            }

        }
    }


        // find mid slow fast technique

        public Node findMid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }


        // Check wheather a LL is Pailindrom or not without using any extra space 


        public boolean pailindrom3(){

            if(head==null || head.next==null){
                return true;
            }
           
            Node mid = findMid(head);
            Node temp = mid;

           Node prev = null;
           Node curr = mid;
           Node next;

           while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
           }

           Node left = head;
           Node right = prev;

           while(right!=null){

            if(right.data != left.data){
                return false;
            }

            right = right.next;
            left = left.next;

           }

           return true;
        }

    // Main functiion 



    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(40);
        ll.addLast(60);
        ll.addLast(70);
        ll.addLast(80);
        ll.addLast(70);
        ll.addLast(60);
        ll.addLast(40);
        ll.addLast(20);
        ll.addLast(10);
        // ll.addAtIndex(30, 2);
        // ll.addAfterData(30, 20);
        ll.length();
        ll.printLl();
        //ll.pailindrrom();
        System.out.println(ll.pailindrom3());

        // ll.reverse();
        // ll.removeFromMid(4);
        // System.out.println();
        // ll.printLl();
        // ll.iterativeSearch(60);
        // ll.recursiveSearch(60, head, 0);
        // ll.removeFromBeg();
        // ll.removeFromEnd();
        // System.out.println();
        // ll.printLl();
    }
}

