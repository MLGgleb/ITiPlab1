package org.lab1;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)) System.out.println(s);
        }
    }
    public static String reverseString(String s) {
        String d = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            d += s.charAt(i);
        }
        return d;
    }
    public static boolean isPalindrome(String s) {
        String rs = reverseString(s);
        if (rs.equals(s)) return true;
        else return false;
    }
}