module com.example.dojobees {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires org.testng;

    opens com.example.dojobees to javafx.fxml;
    exports com.example.dojobees;
    exports com.example.dojobees.modelos;
    opens com.example.dojobees.modelos to javafx.fxml;
    exports com.example.dojobees.processos;
    opens com.example.dojobees.processos to javafx.fxml;
}