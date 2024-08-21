package DesignPatterns.StructuralDesignPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    private final String name;
    private List<FileSystem> files;
    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public void add(FileSystem file){
        this.files.add(file);
    }

    @Override
    public void ls() {
        System.out.println(this.name);
        for (FileSystem file : files){
            file.ls();
        }
    }
}
