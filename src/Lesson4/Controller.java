package Lesson4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {
    @FXML
    public javafx.scene.control.Button btnSent;

    @FXML
    public javafx.scene.control.TextField textField;

    @FXML
    public javafx.scene.control.TextArea textArea;

    @FXML
    public void sent(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();
    }

    @FXML
    public void sentMsg(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            textArea.appendText(textField.getText() + "\n");
            textField.requestFocus();
        }
    }
}
