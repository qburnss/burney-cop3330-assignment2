package org.example.assignment2.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams(){
        AnagramDetector detector = new AnagramDetector();
        boolean actual = detector.isAnagram("note", "note");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void isAnagram_returns_false_for_anagrams(){
        AnagramDetector detector = new AnagramDetector();

        boolean actual = detector.isAnagram("difo", "god");
        assertFalse(actual);
    }
}