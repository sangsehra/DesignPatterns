package Tests;

import java.util.LinkedList;

public class EpamTest {
    public static void main(String[] args) {

        /*
               1,2,3,4,5
               1
                 2
                   3
                     4
                        5

                   10
                 9    8
               4  5  1  2

             pre Order :   4,5,9,10,1,2,8

         */

        Stack stack = new Stack();
        stack.push(1);
        stack.push(10);
        stack.pop();
        stack.push(11);

    }
}

class Stack {

    LinkedList<Integer> stackk = new LinkedList<>();
    public void push(int i){
        stackk.addLast(i);
        System.out.println(stackk);
    }

    public void pop(){
        System.out.println(stackk.getLast());
        stackk.remove(stackk.getLast());
    }
}
