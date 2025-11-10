module lolhd.java_kart {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens lolhd.java_kart to javafx.fxml;
    exports lolhd.java_kart;
}