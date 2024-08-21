package DesignPatterns.StructuralDesignPatterns.CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*
        when there is a tree kind of call or recursion call is needed this design pattern is useful
         */

        Directory mainDirectoy = new Directory("Main");

        FileSystem movie = new File("MainHooNa");

        mainDirectoy.add(movie);

        Directory secondaryDir = new Directory("secondary");
        FileSystem javaFile = new File("javaFile");
        FileSystem thirdDir =  new Directory("third");
        secondaryDir.add(javaFile);
        secondaryDir.add(thirdDir);

        mainDirectoy.add(secondaryDir);


        mainDirectoy.ls();

    }
}
