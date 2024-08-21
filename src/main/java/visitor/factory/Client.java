package visitor.factory;

public class Client {
    public static void main(String[] args) {

        Creator createA = new ConcreteCreateA();
        Product productA =  createA.getProductType();
        productA.doSomething();

        Creator createB = new ConcreteCreateB();
        Product productB = createB.getProductType();
        productB.doSomething();

        Product productB1 = new ConcreteProductB();
        productB1.doSomething();
    }
}
