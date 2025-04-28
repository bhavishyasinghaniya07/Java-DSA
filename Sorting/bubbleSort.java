// Bubble is a technique in which we compares first two elaments and swap them in increasing order
// then we will take the next two elements and do the same untill the array is sorted.
// Time Complexity  wrost/average case - O(n^2)  and in best case  - O(n)


public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,1,4,9,0,4};
        int n = arr.length;
        boolean flag = false;
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println();

        for(int i= n-1; i>=1 ;i--){
            for(int j=0;j<n-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(flag==false)
            break;
        }
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
    }
}
