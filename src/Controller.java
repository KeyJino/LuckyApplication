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
    private Label textLabel;

    @FXML
    void initialize() {
        generatedButton.setOnMouseClicked(event -> {
//            for(int i = 0; i < 10; i++) {


                Generator generator = new Generator();
                generator.settingRandomNumbers();
                generator.getWinCombination();

                Number[] tempNumbers = generator.getNumbers();

                numberLabel.setText(tempNumbers[0].getValue() + " " + tempNumbers[1].getValue() + " " +
                        tempNumbers[2].getValue() + " " + tempNumbers[3].getValue() + " " + tempNumbers[4].getValue() + " " +
                        tempNumbers[5].getValue());

                try {
                    textLabel.setText(generator.getCombinationItem().getTitle());
                } catch (Exception e){
                    textLabel.setText("Неудача");
                } finally {
                    tempNumbers = null;
                    generator = null;
                }


//            }
        });


    }
}
