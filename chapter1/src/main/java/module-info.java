module com.jdojo.intro.chapter1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.jdojo.intro.chapter1 to javafx.fxml, javafx.graphics, javafx.base;
    exports com.jdojo.intro.chapter1;
}