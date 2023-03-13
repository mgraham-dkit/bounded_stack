/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.EmptyStackException;

/**
 *
 * @author grahamm
 */
public class Stack {
    private static final int DEFAULT_CAPACITY = 10;
    private final int capacity;
    private Node first;
    private int size;
    
    public Stack() {
        first = null;
        size = 0;
        capacity = DEFAULT_CAPACITY;
    }
    
    public Stack(int capacity){
        first = null;
        size = 0;
        this.capacity = capacity;
    }
    
    public boolean push(int value) {
        if(isFull()){
            throw new StackFullException("No space available in stack.");
        }
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
        return true;
    }
    
    public int peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return first.data;
    }
    
    public int pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int original = first.data;
        first = first.next;
        size--;
        return original;
    }
    
    public boolean isEmpty() {
        return first == null;
    }

    public int count() {
        return size;
    }

    public boolean isFull(){
        return size >= capacity;
    }

    private static class Node {

        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }
}
