
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The Welcome scene
 */
public class AnxietyBattle{

    /**
     * Initializes the Welcome scene.
     */
    public void initialize(){
    }

    /**
     * Creates a new scene and displays that scene.
     */
    public void setNewScene(ActionEvent event, FXMLLoader loader) {
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}
