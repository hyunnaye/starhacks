
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
public class WelcomeController{

    /**
     * Initializes the Welcome scene.
     */
    public void initialize(){
    }


    @FXML protected void handleDepressionChoice(ActionEvent event){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DepressionBattle.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
    }

    @FXML protected void handleAnxietyChoice(ActionEvent event){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AnxietyBattle.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setScene(scene);
    }
}
