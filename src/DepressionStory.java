import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The Depression story scene
 */
public class DepressionStory {
    @FXML private ImageView bg;
    @FXML private Button b1;
    @FXML private Button b2;
    @FXML private Button b3;
    @FXML private Button b4;
    @FXML private Button b5;
    @FXML private Button b6;

    /**
     * The Depression story initialized scene
     */
    public void initialize(){
        Image img = new Image("Images/ds1.png");
        bg.setImage(img);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
    }

    /**
     * The Scene 2 button
     */
    @FXML public void scene2b1(){
        Image img = new Image("Images/ds2.png");
        bg.setImage(img);
        b3.setVisible(true);
        b4.setVisible(true);
        b1.setVisible(false);
        b2.setVisible(false);
    }
    /**
     * The Scene 2 button
     */
    @FXML public void scene2b2(){
        Image img = new Image("Images/ds2.png");
        bg.setImage(img);
        b3.setVisible(true);
        b4.setVisible(true);
        b1.setVisible(false);
        b2.setVisible(false);
    }

    /**
     * The Scene 3 button
     */
    @FXML public void scene3b3(){
        Image img = new Image("Images/ds4.png");
        bg.setImage(img);
        b5.setVisible(true);
        b6.setVisible(true);
        b3.setVisible(false);
        b4.setVisible(false);
    }
    /**
     * The Scene 3 button
     */
    @FXML public void scene3b4(){
        Image img = new Image("Images/ds4.png");
        bg.setImage(img);
        b5.setVisible(true);
        b6.setVisible(true);
        b3.setVisible(false);
        b4.setVisible(false);
    }

    /**
     * The Scene 4 button
     */
    @FXML public void scene4b5(ActionEvent event){
        b5.setVisible(false);
        b6.setVisible(false);
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setHeaderText(null);
        alert1.setContentText("Time to Battle!");
        alert1.setTitle(null);
        alert1.showAndWait();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("DepressionBattle.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setMinHeight(800);
        stage.setMinWidth(1100);
        stage.setResizable(false);
        stage.setScene(scene);


    }

    /**
     * The Scene 4 button
     */
    @FXML public void scene4b6(ActionEvent event){
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setHeaderText(null);
        alert1.setContentText("Time to Battle!");
        alert1.setTitle(null);
        alert1.showAndWait();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("DepressionBattle.fxml"));
        Parent root = null;
        try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setMinHeight(800);
        stage.setMinWidth(1100);
        stage.setResizable(false);
        stage.setScene(scene);

    }

}