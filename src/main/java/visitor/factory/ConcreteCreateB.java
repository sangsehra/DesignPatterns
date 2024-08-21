package visitor.factory;

public class ConcreteCreateB extends Creator {

    @Override
    public Product getProductType(){
        return new ConcreteProductB();
    }
}
