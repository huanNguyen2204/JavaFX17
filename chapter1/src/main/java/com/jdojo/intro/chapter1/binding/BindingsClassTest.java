package com.jdojo.intro.chapter1.binding;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringExpression;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

import java.awt.geom.Area;
import java.util.Locale;

public class BindingsClassTest {

    public static void main(String[] args) {
        DoubleProperty radius = new SimpleDoubleProperty(7.0);
        DoubleProperty area = new SimpleDoubleProperty(0.0);

        area.bind(Bindings.multiply(
            Bindings.multiply(radius, radius),
            Math.PI
        ));

        StringExpression desc = Bindings.format(Locale.US, "Radius = %2f, Area = %2f", radius, area);

        radius.set(14.0);

        System.out.println(desc.getValue());
    }
}
