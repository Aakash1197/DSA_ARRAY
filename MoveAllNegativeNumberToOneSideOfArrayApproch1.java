package dsa.array;

import java.util.Arrays;

public class MoveAllNegativeNumberToOneSideOfArrayApproch1 {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        //Output: -12 -13 -5 -7 -3 -6 11 6 5
        //negative number move at left of array(beginning)
        //positive number move at right side of array(end)
        int[] refArray = new int[arr.length];
        int forward=0;
        int backword=refArray.length-1;
// two pointer reference array we used
       while(forward!=backword){

           if(arr[forward]<0){
               forward++;
           }
           else if(arr[backword]>0){
               backword--;
           }
           //If forward element has positive number and backward element has negative number then do the swap
           else{
               //first step is to take the forward postive number and store into one temp variable
              int temp=arr[forward];
              //second step is to take replace the forward direction positive number with backward direction negative number
              arr[forward]=arr[backword];
              //Third step is to replace backward direction negative number with temp variable data
              arr[backword]=temp;
           }
       }
            System.out.println(Arrays.toString(arr));

        }
    }
