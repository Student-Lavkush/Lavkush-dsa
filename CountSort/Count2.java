package CountSort;

import java.util.Arrays;

public class Count2 {
  public static void countSort(int[] arr) {
    int max = Arrays.stream(arr).max().getAsInt();
    int[] count = new int[max + 1];
    // counting the frequency
    for (int num : arr) {
      count[num]++;
    }
    for (int i = 1; i <= max; i++) {
      count[i] = count[i] + count[i - 1];
    }
    int[] output = new int[arr.length];
    for (int i = arr.length - 1; i >= 0; i--) {

      output[--count[arr[i]]] = arr[i];
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = output[i];
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    int[] arr = { 5, 2, 3, 3, 0, 0, 6 };
    countSort(arr);
  }
}
