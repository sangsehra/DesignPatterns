package visitor.factory;

public class ConcreteCreateA extends Creator {

    @Override
    public Product getProductType(){
        return new ConcreteProductA();
    }
}
