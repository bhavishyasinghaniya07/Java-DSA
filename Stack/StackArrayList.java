// Implementing the concept of a stack with the help of Arraylist




import java.util.ArrayList;

public class StackArrayList {

    public static class Stack{

        static ArrayList<Integer> s = new ArrayList<>();

        public void push(int data){
            s.add(data);
        }

        public int pop(){

            if(isEmpty()==true){
                return -1;
            }

            int top = s.get(s.size()-1);
            s.remove(s.size()-1);
            return top;
        }

        public int peek(){

            if(isEmpty()==true){
                return -1;
            }

            return s.get(s.size()-1);

        }

        public boolean isEmpty(){
            if(s.size()==0){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack S = new Stack();
        S.push(30);
        S.push(20);
        S.push(10);
        System.out.println(S.peek());
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());
        
        
    }
}
