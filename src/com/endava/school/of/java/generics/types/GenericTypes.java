package com.endava.school.of.java.generics.types;

public class GenericTypes {

    public static void main(String ... args) {
        Box<Bottle> box = new Box<>();
        box.packBox(new Bottle("Coca-cola"));

        Bottle cocaCola = box.emptyBox();
        System.out.println(cocaCola);

        // compiler checks
//         box.packBox(new Fruit(300));


    }

}
