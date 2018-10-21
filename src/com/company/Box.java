package com.company;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T inputitem) {
        if (item != null) {
            System.out.println("Already Full");
        } else {
            item = inputitem;
        }
    }

    public void emptyBox() {
        item = null;
    }
}
