public class Sort {

  // sabse simple sorting algo hai , bs min element dhundo or use starting m dalte
  // jao

  public static void selectionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int min = i;
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[min]) {
          min = j;
        }
      }
      int temp = nums[i];
      nums[i] = nums[min];
      nums[min] = temp;
    }
  }

  // adjacent elements ko compare kr k swap krte raho jab tk array sort na ho jaye

  public static void bubbleSort(int[] nums) {

    for (int i = nums.length - 1; i >= 1; i--) {
      for (int j = 0; j < nums.length - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
  }

  // array ko 2 parts m divide kro 0 se 0 tk sorted , or 1 se n-1 tk unsorted
  // ab ek ek element unsorted m se utha k sorted m sahi jagah pr rakhte jao

  public static void insertionSort(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int j = i;

      while (j > 0 && nums[j - 1] > nums[j]) {

        int temp = nums[j];
        nums[j] = nums[j - 1];
        nums[j - 1] = temp;
        j--;
      }
    }
  }

  // Merge sort Implementation

  public static void mergeSort(int[] nums, int si, int ei) {

    if (si >= ei)
      return;

    int mid = si + (ei - si) / 2;

    mergeSort(nums, si, mid);
    mergeSort(nums, mid + 1, ei);
    merge(nums, si, mid, ei);

  }

  public static void merge(int[] nums, int si, int mid, int ei) {

    int st1 = si;
    int st2 = mid + 1;
    int k = 0;

    int temp[] = new int[ei - si + 1];

    while (st1 <= mid && st2 <= ei) {
      if (nums[st1] <= nums[st2]) {
        temp[k] = nums[st1];
        st1++;
      } else {
        temp[k] = nums[st2];
        st2++;
      }
      k++;
    }

    while (st1 <= mid) {
      temp[k] = nums[st1];
      st1++;
      k++;
    }

    while (st2 <= ei) {
      temp[k] = nums[st2];
      st2++;
      k++;
    }

    for (int i = 0; i < temp.length; i++) {
      nums[si + i] = temp[i];
    }

  }

  // Quick sort - sabse pehle partition element nikal k use uski sahi jagah pr fix
  // kr do , like mid element in merge sort , fir sub problems k liye recursion
  // call kr do

  public static int partion(int nums[], int low, int high) {
    int i = low;
    int j = high;
    int pivot = nums[low];

    while (i < j) {
      while (i < high && nums[i] <= pivot)
        i++;
      while (j > low && nums[j] >= pivot)
        j--;
      if (i < j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }
    int temp = nums[j];
    nums[j] = nums[low];
    nums[low] = temp;

    return j;
  }

  public static void quickSort(int nums[], int low, int high) {
    if (low >= high)
      return;

    int pi = partion(nums, low, high);
    quickSort(nums, low, pi - 1);
    quickSort(nums, pi + 1, high);
  }

  // Main method ->

  public static void main(String[] args) {
    int nums[] = { 4, 5, 6, 6, 9, 8, 7, 0, 3, 1, 2 };

    // selectionSort(nums);
    // bubbleSort(nums);
    // insertionSort(nums);
    // mergeSort(nums, 0, nums.length - 1);
    quickSort(nums, 0, nums.length - 1);
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }
  }

}