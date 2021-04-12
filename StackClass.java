package com.stacksandqueues;

public class StackClass {
    private final NewLinkedList linkedList;

    public StackClass() {
        this.linkedList = new NewLinkedList();
    }

    public void push(INode node) {
        linkedList.add(node);
    }

    public INode peak() {
        return linkedList.head;
    }

    public INode pop() {
        return linkedList.pop();
    }

    public void enqueue (INode node){
        NewLinkedList.append(node);
    }

    public void dequeue() {
        NewLinkedList.popLast();
    }

    public INode lastestElementOfStack() {
        return NewLinkedList.head();
    }

    public INode firstElementOfQueue() {
        return NewLinkedList.tail();
    }

    public void printStack() {
        linkedList.printNodes();
    }
}
