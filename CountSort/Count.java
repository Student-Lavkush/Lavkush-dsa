package CountSort;
public class Count {
    public static void countSort(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] countArray = new int[max + 1];
        for (int num : arr) {
            countArray[num]++;
        }
        int index=0;
        for(int i=0;i<=max;i++){
            while(countArray[i]>0){
                arr[index++]=i;
                countArray[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int[] arr ={ 4,2,5,2,4,5,5,5,2};
        countSort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
}
}
