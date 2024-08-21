package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public abstract class PizzaDecorator implements IPizza{

    protected IPizza iPizza;

    public PizzaDecorator(IPizza iPizza){
        this.iPizza=iPizza;
    }

     public void prepare(){
       this.iPizza.prepare();
    }
}

