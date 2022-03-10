package com.company.palindromes;

import com.company.StringTrix;

public class MaxPalindrome {

    public static void main(String[] args) {
        String str = "aaaaaa bbb ccc dkjhkjhkjhdd hhh haaaaaaah";
        StringTrix AAA = new StringTrix(str);
        System.out.println(AAA.FindMaxString());
    }

}