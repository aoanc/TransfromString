package com.company;

public class Main {

    public static void main(String[] args) {
        String s = "baaaabbbccrrrrrrrdeffi";

        int i = 0;
        while (i < s.length()) {
            int start = i;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                i++;
            }
            s =  s.substring(0, start + 1) + (i - start + 1) + s.substring(i + 1);
            i = start + 1 + ("" + (i - start + 1)).length();
        }
        System.out.println(s);
    }
}
