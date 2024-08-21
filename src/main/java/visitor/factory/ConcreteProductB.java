package visitor.factory;

public class ConcreteProductB implements Product{
    @Override
    public void doSomething() {
        System.out.println("creating product B");
    }
}
