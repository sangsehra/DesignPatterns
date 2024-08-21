package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class PepproniDecorator extends PizzaDecorator{

    PepproniDecorator(IPizza iPizza){
        super(iPizza);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("added pepproni");
    }
}
