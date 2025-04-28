// Implementing the concept of a stack with the help of Linkedlist





public class StackLinkedList {

    public static Node head;

    public static class Node {
        int data ;
        Node next ;

        public Node(int data){
            this.data = data;
            this.next = null;

        }
    }

    public static class Stack{

        public static boolean isEmpty(){
            return head==null;
        }

        public static void push(int data){
            Node newNode = new Node(data);

            newNode.next = head;
            head = newNode;
        }

        public static int pop(){

            if(isEmpty()==true){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()==true){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(30);
        s.push(20);
        s.push(10);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
