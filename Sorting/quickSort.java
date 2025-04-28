// DIVIDE AND QUENQER
// this sorting algorithm again works on recursion 
// here first of all a random element is picked and placed at its right position 
// after then arrange all the  elements according to this using recursion
// Time complexity = O(nlogn) , Space Complexity = O(1)


public class quickSort {

    public static int findPivot(int arr[] , int low , int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j){
            while(arr[i] <= pivot && i<= high-1){
                i++;
            }
            while(arr[j] >= pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
        int temp2 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp2;
        return j;
    }

    public static void quick(int arr[] , int low , int high){
        if(high>low){
           int pivot =  findPivot(arr,low,high);
           quick(arr,low, pivot-1);
           quick(arr, pivot+1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,6,3,7,2,9,1,0};

        quick(arr , 0 , arr.length-1);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
