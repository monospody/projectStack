package podhajecka.Main.Stack.Queue;

import podhajecka.Main.Stack.Exception.Overflow;
import podhajecka.Main.Stack.Exception.Underflow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Queue<T> {

    private int size;
    private int capacity;
    private List<T> list;

    public Queue(int capacity) {
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

    public void enqueue(T obj) throws Overflow {
        if(obj==null)
            return;
        if(!isFull()){
            list.add(obj);
            size++;

/*
            for (int i = 0; i < list.size(); i++) {
                int j;
                for(j = list.size()-1; j > 0; j--){
                    list.set(j, list.get(j - 1));
                }
                list.set(0, list.get(list.size() - 1));
                clone = (List<T>) list.remove(clone.size()-1);
                list.add(0, clone);
                clone.add(list.get(i));
                list.add(clone.get(i));
                System.out.println(list.get(i));
            }
           *//*
            System.out.println(list);
            Collections.rotate(list,0);
            System.out.println(list);*//*
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) +" ");
            }*/
            int rear = -1;
            rear = (rear + 1) % capacity;
            list.set(rear, obj);
            size++;
            System.out.println(obj);


            System.out.println();
            System.out.println();
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) +" ");
            }
        }

        else throw new Overflow("a stack is full");

    }
    public T front() {
        if(isEmpty()){
            return null;
        }else{
            return list.get(0);
        }

    }
    public void dequeue() throws Underflow {
        if(isEmpty()){
            throw new Underflow("a stack is empty");
        }
        else {
            list.remove(size-1);
            size--;

        }
    }
    public T frontAndDequeue() throws Underflow {
        T temp = front();
        dequeue();
        return temp;
    }
    public void empty(){
        list.clear();
        size=0;
    }
}
