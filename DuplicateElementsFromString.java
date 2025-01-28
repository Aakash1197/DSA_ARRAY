package operators;

import java.util.Scanner;

public class DuplicateElementsFromString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER AN STRING WHICH YOU WANT CHECK DUPLICATE ");
        String str=sc.next();

       /* Consider one array with size 26 because total alphabets are 26 and array wil
        start from 0-25 and 1 element is for buffer*/
        int [] arr=new int[26];

        for(int i=0;i<str.length();i++){

            //first get char index value according to ASCII code standard
        /*  A-->65  a-->97
            B-->66  b-->98
            Z-->90  z-->122*/
           int asciiValue= str.charAt(i);

           /*Once we get ASCII value then while inserting digits into array we should
            to minus that ASCII value from 97 every time and get the index value between
            our range 0-25*/
            int indexValue=asciiValue-97;

            /*now if once we get index value then fetch corresponding value from
            array for that index and increase count by one every time.
            First time :
            char =a; ASCII value=97; indexValue=ASCII_VAUE-97=0;
            arr[indexValue]==> arr[o]==>0;
            increase count by one
            arr[indexValue]++;==> 0+1==>1;
            */
            arr[indexValue]++;
        }

        for (int j=0;j<arr.length;j++){

            //Fetch array values which is greater than '1' that means those are the duplicate
            if(arr[j]>1){

                //now we get number (means duplicate count)
                //we need to focus on index this loop
                /*here we need to convert current index position to ASCII char for that
                position and also add 97 digit into it.*/

                char c= (char) (j+97);
                System.out.println("DUPLICATE CHARACTORS :"+c);

            }
        }
    }

}
