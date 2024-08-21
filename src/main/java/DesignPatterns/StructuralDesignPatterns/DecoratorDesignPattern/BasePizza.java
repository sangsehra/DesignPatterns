package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class BasePizza implements IPizza{

    @Override
    public void prepare() {
        System.out.println("base pizza prepared");
    }
}
