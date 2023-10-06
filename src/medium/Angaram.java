package medium;

import java.util.*;

public class Angaram {
    public static void main(String[] args) {
        String[] words={"eat","tea","tan","ate","nat","bat"};
        List<List<String>>anagramGroup=groupAngars(words);
        for(List<String> group:anagramGroup){
            System.out.println(group);
        }
    }

    private static List<List<String>> groupAngars(String[] words) {
        Map<String,List<String>>angarams=new HashMap<>();

        for(String word:words){
            char[]charArray=word.toCharArray();
            Arrays.sort(charArray);
            String sortedWOrd=new String(charArray);
            angarams.putIfAbsent(sortedWOrd,new ArrayList<>());
            angarams.get(sortedWOrd).add(word);
        }

        return new ArrayList<>(angarams.values());
    }
}
