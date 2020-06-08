package Strings;

public class ReverseStringInNoExtraSpace {

    public static String reverseString(char string[]){
        int start = 0;
        int end = string.length-1;
        while(start<end){
            char temp = string[start];
            string[start] = string[end];
            string[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(string);
    }

    public static void main(String[] args) {
        String str = "Sakshi";
        System.out.println("String after reverse is - " + reverseString(str.toCharArray()));
    }
}
