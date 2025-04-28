import java.util.*;
public class StackUsingQueue {

    static class Stack{
       static Queue<Integer> q1 = new LinkedList<>();
       static  Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if(q1.isEmpty()){
                q1.add(data);
                while(!q2.isEmpty()){
                    q1.add(q2.remove());
                }
            }
            else{
                q2.add(data);
                while(!q1.isEmpty()){
                    q2.add(q1.remove());
                }
            }

           
        }

        public static int pop(){
            if(!q1.isEmpty()){
                return q1.remove();
            }
            else if(!q2.isEmpty()){
                return q2.remove();
            }
            else{
                System.out.println("Stack is empty");
                return -1;
            }
        }

        public static int peek(){
            if(!q1.isEmpty()){
                return q1.peek();
            }
            else if(!q2.isEmpty()){
                return q2.peek();
            }
            else{
                System.out.println("Stack is empty");
                return -1;
            }
        }

    }
    public static void main(String[] args) {
       Stack s = new Stack();
       s.push(10);
       s.push(20);
       s.push(30);
       System.out.println(s.peek());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());

    }
}
