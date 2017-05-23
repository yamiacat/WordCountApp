package com.codeclan.example.wordcounterapp;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by user on 23/05/2017.
 */
public class WordCounterTest {

    @Test
    public void canAcceptInputString() {
        WordCounter wordCounter = new WordCounter("test");
        assertNotNull(wordCounter.getInputString());
    }

    @Test
    public void canWordCount() {
        WordCounter wordCounter = new WordCounter("test this");
        assertEquals(2, wordCounter.countWords());
    }


    @Test
    public void canWordCountOneWord() {
        WordCounter wordCounter = new WordCounter("test");
        assertEquals(1, wordCounter.countWords());
    }


    @Test
    public void canWordSentencesWithPunctuation() {
        WordCounter wordCounter = new WordCounter("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity.");
        assertEquals(36, wordCounter.countWords());
    }

    @Test
    public void canReturnWordFrequency() {
        WordCounter wordCounter = new WordCounter("test this test");
        HashMap<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("test", 2);
        expectedResult.put("this", 1);
        assertEquals(expectedResult, wordCounter.wordFrequency());
    }


}



