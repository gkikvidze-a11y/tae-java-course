package homework9;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "java git java oop java git python";

        // split(" ")-ით გაყავი სიტყვებად
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordMap = new HashMap<>();

        // სიხშირის დათვლა: if containsKey -> count+1, else put(1)
        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        // დაბეჭდე შედეგი
        System.out.println(wordMap);
    }
}