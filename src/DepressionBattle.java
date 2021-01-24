
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The Welcome scene
 */
public class DepressionBattle {

    /**
     * Initializes the Welcome scene.
     */
    public void initialize(){
    }

    @FXML protected void badAction(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText("This is a bad move to deal with the Depression Monster. Try to use another move!");
        alert.showAndWait();
    }

    @FXML protected void neutralAction(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setContentText("This is not a bad move to deal with the Depression Monster " +
                "but there is definitely a better action to choose. Try to use another move!");
        alert.showAndWait();
    }

    @FXML protected void correctAction1(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("An effective move has been played!");
        alert.showAndWait();

    }
}

