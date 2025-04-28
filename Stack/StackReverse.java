// Program to push an element at the bottom of the stack 
// and to reverse a stack with the help of recursion




import java.util.*;
public class StackReverse {

    public static void reverseStack(Stack<Integer> s){

        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
       
    }

    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);


        System.out.println(s);

        pushAtBottom(s,4);

        System.out.println(s);

        reverseStack(s);

        System.out.println(s);


    }
}
