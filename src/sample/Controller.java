package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button generatedButton;

    @FXML
    private Label numberLabel;

    @FXML
    void initialize() {
        generatedButton.setOnMouseClicked(event -> {
            numberLabel.setText("123123");
        });

    }
}
