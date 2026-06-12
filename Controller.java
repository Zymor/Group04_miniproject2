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
    private ChoiceBox<?> choicebox1;

    @FXML
    private ChoiceBox<?> choicebox2;

    @FXML
    private ChoiceBox<?> choicebox3;

    @FXML
    private Label label_result;

    @FXML
    private Label timeClock;

    @FXML
    void input_onbutton(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert choicebox1 != null : "fx:id=\"choicebox1\" was not injected: check your FXML file 'View.fxml'.";
        assert choicebox2 != null : "fx:id=\"choicebox2\" was not injected: check your FXML file 'View.fxml'.";
        assert choicebox3 != null : "fx:id=\"choicebox3\" was not injected: check your FXML file 'View.fxml'.";
        assert label_result != null : "fx:id=\"label_result\" was not injected: check your FXML file 'View.fxml'.";
        assert timeClock != null : "fx:id=\"timeClock\" was not injected: check your FXML file 'View.fxml'.";

    }

}
