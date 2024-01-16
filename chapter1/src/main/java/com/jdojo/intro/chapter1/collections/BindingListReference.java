package com.jdojo.intro.chapter1.collections;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

public class BindingListReference {

    public static void main(String[] args) {
        ListProperty<String> lp1 =
            new SimpleListProperty<>(FXCollections.observableArrayList());

        ListProperty<String> lp2 =
            new SimpleListProperty<>(FXCollections.observableArrayList());

        lp1.bind(lp2);

        System.out.println("Before addAll(): " + lp1 + " " + lp2);
        lp1.addAll("One", "Two");
        System.out.println("After addAll(): " + lp1 + " " + lp2);

        lp2.set(FXCollections.observableArrayList("1", "2"));
        System.out.println("After lp2.set(): " + lp1 + " " + lp2);

        lp1.unbind();
        System.out.println("After unbind(): " + lp1 + " " + lp2);

        lp1.bindBidirectional(lp2);
        System.out.println("After bindBidirectional(): " + lp1 + " " + lp2);

        lp1.set(FXCollections.observableArrayList("X", "Y"));
        System.out.println("After lp1.set(): " + lp1 + " " + lp2);
    }
}
