package org.example.assignment2.ex24;

import java.util.Arrays;

public class AnagramDetector {
    public boolean isAnagram(String word1, String word2){
        if(word1.length() == word2.length()) {

            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);
            return true;
        }
        else{
            return false;
        }
    }
}
