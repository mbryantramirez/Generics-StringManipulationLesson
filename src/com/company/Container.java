package com.company;

public class Container<T> {

    private T item;

    public void setItem(T input) {
        item = input;
    }

    public T getItem(){
        return item;
    }
}
