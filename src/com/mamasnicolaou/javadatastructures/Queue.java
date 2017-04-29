package com.mamasnicolaou.javadatastructures;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * Created by mamasnicolaou on 4/29/17.
 */
public class Queue<T> {

    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public T remove(){
        if (first==null){
            throw new NoSuchElementException();
        }else {
            T nextElement = first.data;
            first = first.next;
            return nextElement;
        }
    }

    public void push(T item){
        QueueNode<T> newItem = new QueueNode<T>(item);
        if(first==null){
            last=newItem;
            first=newItem;
        }else {
            last.next = newItem;
            last = newItem;
        }
    }

    public T peek(){
        if(first == null){
            throw new EmptyStackException();
        }
        return first.data;
    }

    public boolean isEmpty(){
        return first == null;
    }

}
