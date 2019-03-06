package com.endava.school.of.java.generics.bounds;

import javafx.beans.binding.IntegerBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Polymorphism<T> {

    static class A{}
    static class B extends A{}

    private static Map<Class<?>, List<?>> schema = new HashMap<>();
    private  Map<Class<T>, List<T>> schema2 = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static void main(String ... args) {
        //No relation between parametrized types and generic arguments
//        ArrayList<Number> numbers = new ArrayList<Integer>();

        // logically immutable
        List<? super Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(1));
//        numbers.get(0).

//        ArrayList<A> value = new ArrayList<>();
//        value.add(new A());
//        schema.put(Integer.class, value);
//
//        List<Integer> integers = (List<Integer>)schema.get(Integer.class);
//        for (Integer integer: integers) {
//            System.out.println(integer.doubleValue());
//        }

//
//        List<? super A> list = new ArrayList<>();
//        list.add(new B());

    }
}
