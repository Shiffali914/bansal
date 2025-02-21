package feb1.Hashmap;

import java.util.HashMap;

public class FuzzyWuzzy {
    public static void main(String[] args) {

        HashMap<String,Integer> wordcount = new HashMap<>();
        String s="Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn't fuzzy was he?";

        //spilt the text into words
        String[] words=s.split("\\s+");

        //count the occurances of each word
        for(String word:words){
            wordcount.put(word,wordcount.getOrDefault(word,0)+1);
        }

        //Print the word counts
        for(String word:wordcount.keySet()){
            System.out.println(word+" "+wordcount.get(word));
        }

    }
}
