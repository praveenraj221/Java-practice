package Arrays;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12, 1, 20,40};
        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
