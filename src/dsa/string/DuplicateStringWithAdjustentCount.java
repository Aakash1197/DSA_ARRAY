package dsa.string;

public class DuplicateStringWithAdjustentCount {
    public static void main(String[] args) {

        String str="aaabbbcccdd";
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<str.length();i++){

            if(String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(i-1)))){
                count++;
            }
            else{
                sb.append(str.charAt(i-1)).append(count).append(",");
                count=1;

            }
        }
        System.out.println(sb.toString());

    }
}
