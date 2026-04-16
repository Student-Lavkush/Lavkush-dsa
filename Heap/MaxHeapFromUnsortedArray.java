
import java.util.Arrays;

public class MaxHeapFromUnsortedArray {
    private int left(int index) {
        return 2 * index + 1;
    }

    private int right(int index) {
        return 2 * index + 2;
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public void sort(int[] arr) {

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            downHeap(arr, i);

        }
    }

    public void downHeap(int[] arr, int i) {
        int max = i;
        int leftindex = left(i);
        int rightindex = right(i);
        if (leftindex < arr.length && arr[max] < arr[leftindex]) {
            max = leftindex;

        }
        if (rightindex < arr.length && arr[max] < arr[rightindex]) {
            max = rightindex;

        }
        if (max != i) {
            swap(arr, max, i);
            downHeap(arr, max);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 20, 40, 30, 1, 200 };
        System.out.println(Arrays.toString(arr));
        MaxHeapFromUnsortedArray t = new MaxHeapFromUnsortedArray();
        t.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
