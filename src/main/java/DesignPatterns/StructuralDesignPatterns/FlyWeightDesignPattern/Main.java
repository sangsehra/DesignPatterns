package DesignPatterns.StructuralDesignPatterns.FlyWeightDesignPattern;

public class Main {
    public static void main(String[] args) {
        ILetter letterR = LetterFactory.getLetterObject('R',"Areal",10 );
        ILetter lettereR = LetterFactory.getLetterObject('R',"Areal",10 );

        letterR.display(2,2);
        lettereR.display(4,5);
    }
}
