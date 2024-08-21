package visitor.factory;

public  class ConcreteProductA implements Product{
    @Override
    public void doSomething() {
        System.out.println("creating product A");
    }

}
