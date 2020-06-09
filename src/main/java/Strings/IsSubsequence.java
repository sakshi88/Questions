package Strings;

import java.util.Scanner;

public class IsSubsequence {

    private static boolean isSubsequenceCheck(String s, String t) {
        if(s.length()==0)
            return true;
        int i=0,j=0;
        while(i<s.length() && j<t.length()) {
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        return i==s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 - ");
        String s = sc.next();
        System.out.println("Enter string 2 - ");
        String t= sc.next();
        System.out.println("String s is subsequence of t : " +  isSubsequenceCheck(s,t));
    }
}
