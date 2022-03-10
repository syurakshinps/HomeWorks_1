package com.company;

public class StringTrix {
    public String str;
    public String[] outStrArray, ReversedStrArray, PalindromesArray;

    String maxString;

    public StringTrix(String str) {
        this.str = str;
        outStrArray = new String[str.toLowerCase().replace(" ", "").length() * str.toLowerCase().replace(" ", "").length()];
        ReversedStrArray = new String[str.toLowerCase().replace(" ", "").length() * str.toLowerCase().replace(" ", "").length()];
        maxString = outStrArray[0];
        PalindromesArray = new String[str.toLowerCase().replace(" ", "").length() * str.toLowerCase().replace(" ", "").length()];
    }

    public void FindAllStrings() {
        String Inside = str.toLowerCase().replace(" ", "");
        int k = 0;
        int l = 0;
         for (int i = 0; i < Inside.length(); i++) {
            for (int j = i + 1; j <= Inside.length(); j++) {
                outStrArray[k] = Inside.substring(i, j);
                if (outStrArray[k].equals(Rev1Str(outStrArray[k])) && outStrArray[k] != null)
                    PalindromesArray[l] = outStrArray[k];
                l += 1;
                k += 1;
            }
        }
    }

    public String Rev1Str(String TryToReverse) {
        char[] inCharArray = TryToReverse.toCharArray();
        char[] outCharArray = new char[TryToReverse.length()];
        int i;
        for (i = 0; i < TryToReverse.length(); i++) {
            outCharArray[i] = inCharArray[TryToReverse.length() - 1 - i];
        }
        String reversed_string1 = new String(outCharArray);
        return reversed_string1;
    }

    public String FindMaxString() {
        int i;
        FindAllStrings();
        maxString = PalindromesArray[0];
        for (i = 0; i < PalindromesArray.length; i++) {
            if ((PalindromesArray[i] != null) && (PalindromesArray[i].length() > maxString.length()))
            {
                maxString = PalindromesArray[i];
            }
        }
        return maxString;
    }
}