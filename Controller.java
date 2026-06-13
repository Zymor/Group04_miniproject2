import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.util.Duration;

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
    private Label timerLabel;

    private Timeline timeline;
    private int remainingSeconds;

    @FXML
    private void timeClock() {
        if (timeline != null) {
            timeline.stop();
        }

        remainingSeconds = 120;
        timerLabel.setText(formatTime(remainingSeconds));

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            remainingSeconds--;
            timerLabel.setText(formatTime(remainingSeconds));
            if (remainingSeconds <= 0) {
                timeline.stop();
            }
        }));
        timeline.setCycleCount(120);
        timeline.play();
    }
    
    private String formatTime(int seconds) {
        int minutes = seconds / 60;
        int secs = seconds % 60;
        return String.format("%d:%02d", minutes, secs);
    }

    @FXML
    void input_onbutton(ActionEvent event) {
        String choice1 = choicebox1.getValue();
        String choice2 = choicebox2.getValue();
        String choice3 = choicebox3.getValue(); 

        Integer score = 0;
        if (choice1.equals("String")) {
            score += 1;
        } else if (choice1.equals("class")) {
            score += 0;
        } else if (choice1.equals("System")) {
            score += 0;
        }
        if (choice2.equals("String")) {
            score += 0;
        } else if (choice2.equals("class")) {
            score += 1;
        } else if (choice2.equals("System")) {    
            score += 0;
        }
        if (choice3.equals("String")) {
            score += 0;
        } else if (choice3.equals("class")) {
            score += 0;
        } else if (choice3.equals("System")) {
            score += 1;      
    }

    String string_score = score.toString();
    label_result.setText("Your score is: " + string_score + "/3");

    
    }
   
    @FXML
    void initialize() {
        choicebox1.setValue("Select");
        choicebox1.getItems().addAll("String", "class", "System");
        choicebox2.setValue("Select");
        choicebox2.getItems().addAll("String", "class", "System");
        choicebox3.setValue("Select");
        choicebox3.getItems().addAll("String", "class", "System");
        timeClock();
    }
}
