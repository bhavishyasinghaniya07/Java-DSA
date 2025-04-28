 // You  are given an array of size n , you have to return the element which comes in majority (more than n/3 times)

import java.util.*;

public class majorityElement {

    public static int majority(int arr[] ){
        HashMap<Integer , Integer > hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i] , hm.get(arr[i])+1);
            }
            else{
            hm.put(arr[i], 1);
            }
        }

        Set<Integer> keySet  =  hm.keySet();

      
        for (int k : keySet) {
            if(hm.get(k) > arr.length/3){
                return k;
            }
        }
        return -1;
    }
  public static void main(String[] args) {
    int arr[] = {1,6,6,5,6,6,3,5,7,6,6,8,4,6,8,3,3,3,3,3,3,3};
        int x = majority(arr);
        System.out.println(x);
  }  
}
