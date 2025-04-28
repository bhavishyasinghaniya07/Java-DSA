// In this sorting alogorithm every elemrnt is picked up and checked if it is at its right position or not ?
// if it is not its right place then swap the values otherwise remain constant
// Time Complexity  wrost/average case - O(n^2)  and in best case  - O(n)


public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,1,4,9,0,4};
        int n = arr.length;
       
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println();

        
       for(int i=0;i<n;i++){
        int j = i;
        while(j>0 && arr[j-1] > arr[j]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
       }
        

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
    }
}
