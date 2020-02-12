package podhajecka.Main.Stack.Stack;

import podhajecka.Main.Stack.Exception.Overflow;
import podhajecka.Main.Stack.Exception.Underflow;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int size;
    private int capacity;
    private List<T> list;
    public Stack(int capacity) {
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==capacity;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getSize() {
        return size;
    }
    public void push(T obj) throws Overflow {
        if(obj==null)
            return;
       if(!isFull()){
            list.add(obj);
            size++;
       }
        else throw new Overflow("a stack is full");

    }
    public T top() throws Underflow {
        if(isEmpty()){
            return null;
        }else{
            return list.get(size-1);
        }

    }
    public void pop() throws Underflow {
        if(isEmpty()){
            throw new Underflow("a stack is empty");
        }
        else {
            list.remove(size-1);
            size--;

        }
    }
    public T topAndPop() throws Underflow {
        T temp = top();
        pop();
        return temp;
    }
    public void empty(){
        list.clear();
        size=0;
    }


}
