package com.mamasnicolaou.javadatastructures;

import java.util.EmptyStackException;

/**
 * Created by mamasnicolaou on 4/29/17.
 */
public class Stack<T> {

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data){
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop(){
        if (top==null){
            throw new EmptyStackException();
        }
        T lastIn = top.data;
        top = top.next;
        return lastIn;

    }

    public void push(T item){
        StackNode<T> newItem = new StackNode<T>(item);
        newItem.next=top;
        top = newItem;
    }

    public T peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }


}
