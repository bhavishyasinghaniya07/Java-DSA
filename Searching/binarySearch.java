public class binarySearch {

    public static int binary(int arr[], int key , int high , int low){
        int mid = (high + low )/2;

        if(low > high)
        return -1;

        if(arr[mid]==key){
            return mid;
        }
        else if(key<arr[mid]){
            high = mid-1;
            return  binary(arr, key, high, low);
        }
        else{
            low = mid+1;
            return binary(arr, key, high, low);
        }
       
        
    }

    

    
    public static void main(String[] args) {
        
       int arr[] = {0,1,2,3,4,5,6,7,8,9};
       System.out.println("Found at Index" + binary(arr, 5, arr.length-1, 0));


    }
}
