package demo;

import java.util.ArrayList;

public class Stack<E> {

    ArrayList<E> stack = new ArrayList<E>();

    public void push(E newElement){
        stack.add(stack.size()-1, newElement);
    }

    public E pop(){
        return stack.remove(stack.size()-1);
    }
}
