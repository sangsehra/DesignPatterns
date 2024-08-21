package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class main {
    public static void main(String[] args) {
        IPizza iPizza =  new CheeseDecorator(new PepproniDecorator(new BasePizza()));
        iPizza.prepare();
    }
}
