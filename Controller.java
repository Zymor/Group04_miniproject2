import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> choicebox1;

    @FXML
    private ChoiceBox<String> choicebox2;

    @FXML
    private ChoiceBox<String> choicebox3;

    @FXML
    private Label label_result;

    @FXML
    private Label timeClock;

    @FXML
    void input_onbutton(ActionEvent event) {

    }

   
    @FXML
    void initialize() {
        choicebox1.setValue("Select");
        choicebox1.getItems().addAll("String", "class", "System");
        choicebox2.setValue("Select");
        choicebox2.getItems().addAll("String", "class", "System");
        choicebox3.setValue("Select");
        choicebox3.getItems().addAll("String", "class", "System");
    }
}
