package com.jdojo.intro.chapter1.collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ObservableListTest {

    public static void main(String[] args) {
        ObservableList<String> list = FXCollections.observableArrayList("one", "two");
        System.out.println("After creating list: " + list);

        list.addAll("three", "four");
        System.out.println("After adding elements: " + list);

        list.remove(1, 3);
        System.out.println("After removing elements: " + list);

        list.retainAll("one");
        System.out.println("After retaining \\\"one\\\": " + list);

        ObservableList<String> list2 = FXCollections.<String>observableArrayList("1", "2", "3");

        ObservableList<String> list3 = FXCollections.<String>observableArrayList("ten", "twenty", "thirty");

        ObservableList<String> list4 = FXCollections.concat(list2, list3);

        System.out.println("list2 is: " + list2);
        System.out.println("list3 is: " + list3);
        System.out.println(
            "After concatenating list2 and list3: " + list4
        );
    }
}
