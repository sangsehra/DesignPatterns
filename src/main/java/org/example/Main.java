package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "rajatsehara";
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> charCount = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(charCount.containsKey(s.charAt(i))){
                charCount.put(s.charAt(i),charCount.get(s.charAt(i))+1);
            }
            else {
                charCount.put(s.charAt(i),1);
            }
        }

        System.out.println(charCount);
    }
}