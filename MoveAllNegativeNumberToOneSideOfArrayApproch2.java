package dsa.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveAllNegativeNumberToOneSideOfArrayApproch2 {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int j=0;
        for(int i=0;i<arr.length;i++){
            //whenever we get negative value then we increase the j count by 1
            if(arr[i]<0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
