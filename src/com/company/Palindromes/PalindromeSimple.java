package com.company.Palindromes;

public class PalindromeSimple{
    /*Обучение Java/AT 2022, [15.02.2022 20:43]
Задача 1 (простая) - Дана строка. Проверить, является ли она палиндромом.

Обучение Java/AT 2022, [15.02.2022 20:44]
Задача 2 (средняя) - Дана строка. Найти в ней подстроку-палиндром максимальной длины.

Обучение Java/AT 2022, [15.02.2022 20:45]
Задача 2* (сложная) - Дана строка. Найти в ней подстроку-палиндром максимальной длины за время O(n^2).

     */
    public String ReverseString (String str1){
        char[] inCharArray = str1.toCharArray();
        char[] outCharArray = new char[str1.length()];
        int i;
        for (i=0; i<str1.length(); i++){
            outCharArray[i] = inCharArray[str1.length()-1-i];
        }
        String reversed_string1 = new String(outCharArray);
        return reversed_string1;
    }


}
