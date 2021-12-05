package com.futurecollars.CleanCode.Task1;

public class Text {

    public static void main (String[] args) {

        String text = "kkajak kajakk";
        boolean empty = text.isEmpty();
        if (!empty) {
            System.out.println(isPalindrome(text));
            System.out.println(text.length());
        }

    }
    public static boolean isPalindrome(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        String rev = sb.toString();
        return text.equals(rev);
    }

}


