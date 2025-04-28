import java.util.HashSet;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class HashSetA {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(10);
        h.add(50);
        h.add(10);
        h.add(20);

        // System.out.println(h);
        // System.out.println(h.size());
        // System.out.println(h.contains(50));
        // System.out.println(h.isEmpty());
        // h.remove(10);
        // System.out.println(h);


        // Iterating on HashSet


        // Iterator it = h.iterator();

        // while(it.hasNext()){
        //     System.out.println(h.next());
        // }


        // or

        for(int i : h){
            System.out.println(i);
        }
    }
}
