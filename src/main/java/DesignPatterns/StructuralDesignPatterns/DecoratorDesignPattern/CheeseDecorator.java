package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class CheeseDecorator extends PizzaDecorator{

    CheeseDecorator(IPizza iPizza){
        super(iPizza);
    }
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("added cheese");
    }
}
