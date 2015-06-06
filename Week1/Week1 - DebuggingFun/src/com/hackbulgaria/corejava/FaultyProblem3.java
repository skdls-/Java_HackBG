package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
        String[] words = sentence.split(" ");
        for (int i = 0 ; i < words.length ; i ++ ){
            sentence = sentence.replaceFirst(words[i], (String)reverse(words[i]));
        }
        return sentence;
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}
