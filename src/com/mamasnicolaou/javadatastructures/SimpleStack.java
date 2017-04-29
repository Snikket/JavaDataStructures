package com.mamasnicolaou.javadatastructures;

import java.util.ArrayList;

/**
 * Created by mamasnicolaou on 4/29/17.
 */
public class SimpleStack<T> {

    ArrayList<T> stack = new ArrayList<T>();

    public void push(T item){
        this.stack.add(item);
    }

    public T pop(){
        if(stack.size()==0){
            return null;
        }else{
            T lastIn = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return lastIn;
        }
    }

    public T peek(){
        if(stack.size()==0){
            return null;
        }else{
            return stack.get(stack.size()-1);
        }
    }

    public boolean isEmpty(){
        return stack.size()==0;
    }


}
