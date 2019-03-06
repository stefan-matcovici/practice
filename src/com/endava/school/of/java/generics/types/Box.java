package com.endava.school.of.java.generics.types;

public class Box<T> {

    private T contents;

    public T emptyBox() {
        return contents;
    }

    public void packBox(T contents) {
        this.contents = contents;
    }

    public void createContents() {
//        contents = new T();
    }
}