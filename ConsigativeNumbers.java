package dsa.array;

import java.util.Arrays;

public class ConsigativeNumbers {
    public static void main(String[] args) {
       // int []arr={0,1,0,1,1,1,0};
        int []arr={0,1,2,3,3,3,2,6,1,0,2};
        int previousNumber=0;
        int nextNumber=0;
        //ASCII for 0-9 will start from 48 to 57 ASCII number
        int[] asciiCharNumber= new int[11];

        for(int i=0;i<arr.length;i++){
          if(nextNumber ==arr[arr.length-1] &&( i==arr.length-1)) {
            break;
          }
            previousNumber = arr[i];
            nextNumber = arr[i + 1];

            if(previousNumber==nextNumber){
                asciiCharNumber[previousNumber]++;
            }

        }

        System.out.println(Arrays.toString(asciiCharNumber));
        for (int j=0;j<asciiCharNumber.length;j++){
            if(asciiCharNumber[j]!=0){

                System.out.println(j +"  :  "+"Count  : "+asciiCharNumber[j]);
            }
        }
    }
}
