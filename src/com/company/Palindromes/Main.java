package com.company.Palindromes;

public class Main {
    /*

    //This is for Prob_1
        public static void main(String[] args) {
            String[] strArray = {"А роза упала на лапу Азора", "просто бред какой-то",
            "Лёша на полке клопа нашёл", "пил вино Вон и влип"};
            PalindromeSimple test1 = new PalindromeSimple();
            int i;
            for (i=0;i<strArray.length;i++) {
                if (test1.ReverseString(strArray[i].replace(" ", "")).equalsIgnoreCase(strArray[i].replace(" ", "")))
                {                 System.out.println("\"" + strArray[i] + "\"" + " is a palindrome.");            }
                else {                 System.out.println("\"" + strArray[i] + "\"" + " isn't a palindrome.");            }
            }

            //2. средняя
            MaxPalindrome mp = new MaxPalindrome();
    */
    public static void main(String args[]) {
        String str = "abbc";
        System.out.println("All substring of abbc are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}