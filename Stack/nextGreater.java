// find the next greater element in right side and store its value at adjacent position
// in another array otherwise store -1;


import java.util.*;
public class nextGreater {

    public static void findGreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int arr2[] = new int[arr.length];

        for(int i = arr.length-1;i>= 0 ; i--){

            while(!s.isEmpty() && arr[s.peek()] <= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                arr2[i] = -1;
            }
            else{
                arr2[i] = arr[s.peek()];
            }
            s.push(i);

        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        findGreater(arr);

    }
}
