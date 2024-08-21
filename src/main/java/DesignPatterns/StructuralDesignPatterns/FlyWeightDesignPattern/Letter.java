package DesignPatterns.StructuralDesignPatterns.FlyWeightDesignPattern;

public class Letter implements ILetter{
    /*
    this is intrinsic class, It should be immutable. For that we made members private
    Other data variables will be moved in a method those are called extrinsic
     */
    private String font;
    private int size;
    private char aChar;

    public Letter(String font, int size, char aChar) {
        this.font = font;
        this.size = size;
        this.aChar = aChar;
    }



    @Override
    public void display(int x, int y) {
        for(int i =0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i == x-1 && j == y-1){
                    System.out.println(this.aChar);
                }else {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
    }
}
