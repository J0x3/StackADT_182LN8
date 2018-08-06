package ArrayBased;

import Exception.StackException;

public class ArrayBased implements Interface {
    private final int MAX_STACK = 50;
    private Object items[];
    private int top;

    public ArrayBased() {
        items = new Object[MAX_STACK];
        top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == MAX_STACK-1;
    }

    public void push(Object newItem) throws StackException {
        if (!isFull()) {
            items[++top] = newItem;
        }
        else {
            throw new StackException("StackException on push: stack full");
        }
    }

    public void popAll() {
        items = new Object[MAX_STACK];
        top = -1;
    }

    public Object pop() throws StackException {
        if(!isEmpty()) {
            return items[top--];
        }
        else {
            throw new StackException("StackException on pop: stack empty");
        }
    }

    public Object peek() throws StackException {
        if (!isEmpty()) {
            return items[top];
        }
        else {
            throw new StackException("StackException on peek: stack empty");
        }
    }
}
