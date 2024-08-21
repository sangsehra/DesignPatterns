package DesignPatterns.StructuralDesignPatterns.FlyWeightDesignPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterFactory {
    /*
    it's caching the objects if object is already there then reuse that
     */
    static HashMap<Character,ILetter> letterObjectList = new HashMap<>();
    public static ILetter getLetterObject(char k, String font, int size){
        if (letterObjectList.containsKey(k)){
            return letterObjectList.get(k);
        } else {
            System.out.println("creating new object");
            ILetter letter = new Letter(font,size,k);
            letterObjectList.put(k,letter);
            return letter;
        }
    }
}
