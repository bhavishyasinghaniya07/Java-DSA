// code to sort an array containing only 0 , 1, 2 elements in O(n) time complexity with Dutch National Flag Algorithm



import java.util.*;

public class dutchNationalFlagAlgo {
    
   public static void main(String[] args){
    int arr[] = {1,2,0,1,2,1,0,0};

    int low = 0;
    int mid = 0;
    int high = arr.length-1;

    while(mid<=high){
        if(arr[mid]==0){
            swap(arr[low],arr[mid]);
            low++;
            mid++;
        }
        else if(arr[mid] == 1){
            mid+++;
        }
        else{
            swap(arr[mid],arr[high]);
            high--;
        }
    }
   }


}
