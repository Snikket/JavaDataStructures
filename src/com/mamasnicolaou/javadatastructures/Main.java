package com.mamasnicolaou.javadatastructures;

public class  Main {

    public static void main(String[] args) {
        testStack();
        System.out.println();
        testSimpleStack();
        System.out.println();
        testQueue();
    }

    public static void testStack(){
        System.out.println("Testing Stack");
        Stack stack = new Stack<String>();
        stack.push("World!");
        stack.push("Hello ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }

    public static void testSimpleStack(){
        System.out.println("Testing SimpleStack");
        SimpleStack stack = new SimpleStack<String>();
        stack.push("World!");
        stack.push("Hello ");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }

    public static void testQueue(){
        System.out.println("Testing Queue");
        Queue queue = new Queue<String>();
        queue.push("Hello ");
        queue.push("World! ");
        while(!queue.isEmpty()) {
            System.out.print(queue.remove());
        }
    }
}
