package com.jdojo.intro.chapter1.collections;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class SimpleListChangeTest {

    public static void main(String[] args) {
        ObservableList<String> list = FXCollections.observableArrayList();

        list.addListener(SimpleListChangeTest::onChanged);

        list.add("one");
        list.add("two");
        FXCollections.sort(list);

        list.clear();
    }

    public static void onChanged(ListChangeListener.Change change) {
        while (change.next()) {
            if (change.wasPermutated()) {
                // Handle permutations
            }
            else if (change.wasUpdated()) {
                // Handle updates
            }
            else if (change.wasReplaced()) {
                // Handle replacements
            }
            else {

            }
        }
    }
}
