package feb1;

import java.util.HashMap;

public class CountWord {
    public static void main(String[] args) {
        HashMap<Character,Integer> wordcount=new HashMap<>();

        String s="Pragra";
        char[] word= s.toCharArray();
        for(char c:word){
            wordcount.put(c,wordcount.getOrDefault(c,0)+1);
        }
        for(char ch:word){
            System.out.println(ch+" "+wordcount.get(ch));
        }

    }
}
