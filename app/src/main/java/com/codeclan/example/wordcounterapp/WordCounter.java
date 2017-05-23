package com.codeclan.example.wordcounterapp;

import java.util.HashMap;

/**
 * Created by user on 23/05/2017.
 */

public class WordCounter {
    private String input;
    private String[] wordArray;

    
    public WordCounter(String input) {
        this.input = input;
        this.wordArray = input.split(" ");
    }

    public String getInputString() {
        return input;
    }

    public int countWords() {
        return this.wordArray.length;
    }

    public HashMap<String, Integer> wordFrequency() {
        HashMap<String,Integer> resultsHashMap = new HashMap<>();
        for (int i = 0; i < wordArray.length; i++) {
            if (resultsHashMap.containsKey(wordArray[i])) {
                Integer count = resultsHashMap.get(wordArray[i]);
                resultsHashMap.put(wordArray[i], count + 1);
            }
            else {
                resultsHashMap.put(wordArray[i], 1);
            }

        }
        return resultsHashMap;
    }



}
