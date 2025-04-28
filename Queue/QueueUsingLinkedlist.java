public class QueueUsingLinkedlist {

    static class Node{
        int data;
        Node next;
        

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue{
        static Node front = null;
        static Node rear = null;

        public static boolean isEmpty(){
            return front ==null && rear == null;
        }
        
        public static void add(int data){
            Node newNode = new Node(data);

            if(front == null){
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = rear.next;

        }

        public static int remove(){

            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
           

            int x = front.data;
            front = front.next;
            return x;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return front.data;
        }


    }
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println(q.peek());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
       
        
    }
}
