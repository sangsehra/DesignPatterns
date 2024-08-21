package DesignPatterns.StructuralDesignPatterns.CompositeDesignPattern;

public class File implements FileSystem{

    private final String name;

    File(String filename){
        this.name=filename;
    }
    @Override
    public void ls() {
        System.out.println(this.name);
    }
}
