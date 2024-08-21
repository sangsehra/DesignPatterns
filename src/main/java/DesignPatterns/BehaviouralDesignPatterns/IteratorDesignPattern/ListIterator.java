package DesignPatterns.BehaviouralDesignPatterns.IteratorDesignPattern;

public class ListIterator implements Iterator{

    int[] arr;
    int pointer;
    ListIterator(int[] arr, int pointer){
        this.arr=arr;
        this.pointer=pointer;
    }

    @Override
    public boolean hasNext() {
     return arr.length>pointer;
    }

    @Override
    public int next() {
        return arr[pointer++];
    }
}
