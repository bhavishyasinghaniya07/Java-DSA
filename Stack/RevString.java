// Reverse a string with the help of a stack 



import java.util.*;
public class RevString {

    

    public static String revString(String str){
        Stack<Character> s = new Stack<>();
        int i =0;
        while(i< str.length()){
            s.push(str.charAt(i));
            i++;

        }

        StringBuilder ss = new StringBuilder();

        while(!s.isEmpty()){
            ss.append(s.pop());
        }
        return ss.toString();
    }
    public static void main(String[] args) {
        String str = "abcde";

        String result = revString(str);
        System.out.println(result);

    }
}
