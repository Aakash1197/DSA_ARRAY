package dsa.array;

import java.util.Arrays;

public class ArrayColordPractise {
    public static void main(String[] args) {
        //l m h
        //swap m <->l
        int [] arr={0,1,0,2,0,2};
        //1st iteration [0,1,0,2,0,2] m=0, l=0 -->[0,1,0,2,0,2]
        //2nd iteration [0,1,0,2,0,2] m=1, l=1,h=5-->[0,2,0,2,0,1] h--
        //3rd iteration [0,2,0,2,0,1] m=1, l=1, h=4 -->[0,0,0,2,2,1] h--
        //4t iteration [0,0,0,2,2,1] m=2, l=2, h=3 -->[0,0,0,2,2,1] m++ l++
        //5th iteration [0,0,0,2,2,1] m=3, l=3, h=3 -->[0,0,0,2,2,1] m++ l++
        //

        int l = 0,m=0;
        int h=arr.length-1;

        while (m<=h){
            if(arr[m]==0){
               int temp =arr[l];
               arr[l]=arr[m];
               arr[m]=temp;
                m++;
                l++;

            }
            else if( arr[m]!=0){
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
