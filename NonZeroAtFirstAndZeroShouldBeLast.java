package dsa;

import java.util.Arrays;

public class NonZeroAtFirstAndZeroShouldBeLast {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (end - i != i) {
                if (arr[i] != 0 && arr[end ] == 0) {
                    end--;

                } else if (arr[i] == 0 && arr[end]!=0 ) {

                    int temp = arr[i];
                    arr[i] = arr[end ];
                    arr[end ] = temp;

                }

            }
            System.out.println(Arrays.toString(arr));
        }

    }
}