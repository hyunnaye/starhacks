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

public class DepressionStory {
    @FXML private ImageView bg;
    @FXML private Button b1;
    @FXML private Button b2;
    @FXML private Button b3;
    @FXML private Button b4;
    @FXML private Button b5;
    @FXML private Button b6;

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

    @FXML public void scene2b1(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("You realize that if you love the outfit it doesn’t matter what anyone thinks. " +
                "Besides, everyone is too focused on themselves to care what you are wearing.\n");
        alert.setTitle(null);
        alert.showAndWait();
        Image img = new Image("Images/ds2.png");
        bg.setImage(img);
        b3.setVisible(true);
        b4.setVisible(true);
        b1.setVisible(false);
        b2.setVisible(false);
    }
    @FXML public void scene2b2(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("It’s better to be safe than sorry.");
        alert.setTitle(null);
        alert.showAndWait();
        Image img = new Image("Images/ds2.png");
        bg.setImage(img);
        b3.setVisible(true);
        b4.setVisible(true);
        b1.setVisible(false);
        b2.setVisible(false);
    }

    @FXML public void scene3b3(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Ms. Jones calls on you. You repeat the answer you came up with. Ms. Jones replies " +
                "“Good job! That is correct!” You smile at the anxiety creature and say “Looks like I was right after all.”\n");
        alert.setTitle(null);
        alert.showAndWait();
        Image img = new Image("Images/as3.png");
        bg.setImage(img);
        b5.setVisible(true);
        b6.setVisible(true);
        b3.setVisible(false);
        b4.setVisible(false);
    }
    @FXML public void scene3b4(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(" You shrink down into your seat, as you wait for someone to raise their hand." +
                " Someone finally raises their hand and repeats the solution that was already on your paper. " +
                "Ms. Jones replies with “Good job! That is correct!” Turns out you were right.");
        alert.setTitle(null);
        alert.showAndWait();
        Image img = new Image("Images/as3.png");
        bg.setImage(img);
        b5.setVisible(true);
        b6.setVisible(true);
        b3.setVisible(false);
        b4.setVisible(false);
    }
    @FXML public void scene4b5(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("(anxiety monster gets smaller: The girls look so happy that you are going to go. One of the girls says “ Yay! We can’t wait to see you there!”. \n" +
                "When you go to the sleepover on Friday night, you have a blast. The girls are so nice. You all played board games, watched movies, and talked all night. \n");
        alert.setTitle(null);
        alert.showAndWait();
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setHeaderText(null);
        alert1.setContentText("Time to Battle!");
        alert1.setTitle(null);
        alert1.showAndWait();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AnxietyBattle.fxml"));
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

    @FXML public void scene4b6(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("The girls look very disappointed. One of the girls says “That’s ok. I guess we’ll see you in French class!”");
        alert.setTitle(null);
        alert.showAndWait();
        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setHeaderText(null);
        alert1.setContentText("Time to Battle!");
        alert1.setTitle(null);
        alert1.showAndWait();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("AnxietyBattle.fxml"));
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

    @FXML public void changeToBattle(){

    }
}