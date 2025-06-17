// in this sorting technique , we will first select the minimum element among the all
// and swap it value with the 0th index and so on until the array is sorted
// Time Complexity  wrost/average/best case - O(n^2) 

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 5, 7, 1, 4, 9, 0, 4 };
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "->");
        }
    }
}
