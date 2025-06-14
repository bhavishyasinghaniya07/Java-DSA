public class MergeSort {

  public static void mergeSort(int nums[], int si, int ei) {
    if (si >= ei)
      return;

    int mid = si + (ei - si) / 2;
    mergeSort(nums, si, mid);
    mergeSort(nums, mid + 1, ei);
    merge(nums, si, mid, ei);

  }

  public static void merge(int nums[], int si, int mid, int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= ei) {
      if (nums[i] <= nums[j]) {
        temp[k] = nums[i];
        i++;
        k++;
      } else {
        temp[k] = nums[j];
        j++;
        k++;
      }
    }

    while (i <= mid) {
      temp[k] = nums[i];
      i++;
      k++;
    }

    while (j <= ei) {
      temp[k] = nums[j];
      j++;
      k++;
    }

    for (k = 0, i = si; k < temp.length; k++, i++) {
      nums[i] = temp[k];
    }
  }

  public static void main(String[] args) {
    int nums[] = { 4, 2, 3, 1, 5 };
    mergeSort(nums, 0, nums.length - 1);

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

  }
}
