package com.jdojo.intro.chapter1.binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class BidirectionalBinding {

    public static void main(String[] args) {
        IntegerProperty x = new SimpleIntegerProperty(1);
        IntegerProperty y = new SimpleIntegerProperty(2);
        IntegerProperty z = new SimpleIntegerProperty(3);

        System.out.println("Before binding: ");
        System.out.println("x = " + x.get() + ", y = " + y.get() + ", z = " + z.get());

        x.bindBidirectional(y);
        System.out.println("After binding-1: ");
        System.out.println("x = " + x.get() + ", y = " +  y.get());

        x.bindBidirectional(z);
        System.out.println("After binding-2: ");
        System.out.println("x = " + x.get() + ", y = " + y.get() + ", z = " +z.get());

        x.unbindBidirectional(y);
        x.unbindBidirectional(z);

        System.out.println("After unbinding and changing the separately: ");

        x.set(100);
        y.set(200);
        z.set(300);

        System.out.println("x = " + x.get() + ", y = " + y.get() + ", z = " + z.get());
    }
}
