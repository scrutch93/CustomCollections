package com.pluralsight.collection;

import java.util.List;

public class FixedList<T> {

    protected List<T> items;

    protected int maxSize;


    public FixedList(int maxSize) {
        this.maxSize = maxSize;
    }



    public void setItems(List<T> items) {
        this.items = items;
    }
    public List<T> getItems() {
        return items;
    }
    public void add(T item){

        if(items.size() < maxSize ){

            items.add(item);
        }

    }

}
