package DesignPatterns.BehaviouralDesignPatterns.IteratorDesignPattern;

public class MyList implements Collections{

    int[] arr;

    MyList(int[] arr){
        this.arr=arr;
    }

    @Override
    public Iterator createIterator() {
       return new ListIterator(arr,0);
    }
}
