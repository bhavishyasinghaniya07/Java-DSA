// Finding the span of a stock 
// means - the number of previous day stocks which are less or equal to current day stock


import java.util.*;

public class stockSpan {
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        ArrayList<Integer> a  = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        a.add(1);
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            while( !s.isEmpty() && stocks[i] > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                a.add(i+1);
            }
            else{
                int pH = s.peek();
                a.add(i-pH);

            }
            s.push(i);
        }

        System.out.println(a);
    }
}
