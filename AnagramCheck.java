package dsa.string;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class AnagramCheck {

    public static void main(String[] args) {

        String str = "listen";
        String str1 = "silent";

        str = str.toLowerCase().trim();
        str1 = str1.toLowerCase().trim();

        boolean  res =  anagramCheck(str,str1);
        if(res){
            System.out.println("IT'S ANAGRAM");
        }else{
            System.out.println("IT'S NOT AN ANAGRAM");
        }

    }

    private static boolean anagramCheck(String str, String str1) {

        //1.First we findout the length of two string,

        int  s1=str.length();
        int  s2=str1.length();
        boolean res=false;
        if(s1!=s2){
            return res;
        }
        else{
            //2.Create an array which store unique alphabets count
            //3.Total alphabets are 26 (0-25) but we consider upto 26 because extra one size for buffer
            int[] alphabetsCountAsAscii= new int[26];

            //4.Find out the ASCII value for particular character using with loop
            //Incremental loop for first string
            for(int i=0;i<s1;i++){
                //here we get ASCII value for particular character
                int charIndex=str.charAt(i);
                //5.Now we need to minus 97 value from 'charIndex' variable.
                //while insertion in ascii array we need to do minus and checking we need do addition 97
                int indexPostionAsPerAscii=charIndex-97;

               /*
               6.Once we findout the index value for particular character as per ASCII
                then we need to find that index position value from array and do that
                 value increase by one.
                 */
                alphabetsCountAsAscii[indexPostionAsPerAscii]++;

            }

            //Decremental loop for second string
            for(int j=0;j<s2;j++){

                //here we get ASCII value for particular character
                int charIndex=str.charAt(j);
                //7.Now we need to minus 97 value from 'charIndex' variable.
                //while insertion in ascii array we need to do minus and checking we need do addition 97
                int indexPostionAsPerAscii=charIndex-97;

               /*
               8.Once we findout the index value for particular character as per ASCII
                then we need to find that index position value from array and do that
                 value decreased by one.
                 */
                alphabetsCountAsAscii[indexPostionAsPerAscii]--;

            }
            /*9.Iterate the final array and check whether any index position value
            is more than 1
            if it more than 1 then it's not anagram.
            */
            for(int k=0;k<alphabetsCountAsAscii.length;k++){
                if(alphabetsCountAsAscii[k]!=0){
                    return res;
                }


            }
            res=true;



        }


        return res;
    }
}