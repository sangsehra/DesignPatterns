package DesignPatterns.BehaviouralDesignPatterns.IteratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        /*
        this array needs to be passed on across like in MyList and iterator
         this is how mostly all the design patterns work !!
         */
        int [] arr = {2,3,4,2,5,2,3,5,66,33};

        MyList myList = new MyList(arr);

        Iterator it = myList.createIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
