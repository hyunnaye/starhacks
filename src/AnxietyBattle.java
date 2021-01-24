
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
 * The Anxiety Battle scene
 */
public class AnxietyBattle {
    @FXML private ImageView bg;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button9;
    @FXML private Button button10;
    @FXML private Button button11;
    @FXML private Button button12;
    @FXML private Button button13;
    @FXML private Button button14;
    @FXML private Button button15;
    @FXML private Button button17;
    @FXML private Button button18;



    /**
     * Initializes the Anxiety Battle scene. This is the beginning of the battle,
     * hiding every question button except first question.
     */
    public void initialize(){
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button9.setVisible(false);
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);
        button13.setVisible(false);
        button14.setVisible(false);
        button15.setVisible(false);
        button17.setVisible(false);
        button18.setVisible(false);
        Image img = new Image("Images/aq1.png");
        bg.setImage(img);
    }

    /**
     * Bad Answer prompt
     */
    @FXML protected void badAction(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incorrect");
        alert.setHeaderText(null);
        alert.setContentText("This is a bad move to deal with the Anxiety Monster. Try to use another move!");
        alert.showAndWait();
    }

    /**
     * Neutral Answer prompt
     */
    @FXML protected void neutralAction(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incorrect");
        alert.setHeaderText(null);
        alert.setContentText("This is not a bad move to deal with the Anxiety Monster " +
                "but there is definitely a better action to choose. Try to use another move!");
        alert.showAndWait();
    }

    /**
     * Correct 1st Answer prompt
     */
    @FXML protected void correctAction1(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Correct");
        alert.setContentText("Correct! Keep physically active. Develop a routine so that you're physically active most days of the week. Exercise is a powerful stress reducer. It may improve your mood and help you stay healthy. Start out slowly and gradually increase the amount and intensity of your activities.\n");
        alert.showAndWait();
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);

    }
    /**
     * Correct 2nd Answer prompt
     */
    @FXML protected void correctAction2(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Correct");
        alert.setContentText("Correct Move! Make sleep a priority. Do what you can to make sure you're getting enough sleep to feel rested. If you aren't sleeping well, see your doctor. Teenagers should regularly sleep 9–12 hours.");

        alert.showAndWait();
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button9.setVisible(true);
        button10.setVisible(true);
        button11.setVisible(true);

    }
    /**
     * Correct 3rd Answer prompt
     */
    @FXML protected void correctAction3(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Correct move! Use relaxation techniques. Visualization techniques, meditation, and yoga are examples of relaxation techniques that can ease anxiety.\n");
        alert.setTitle("Correct");
        alert.showAndWait();
        button9.setVisible(false);
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);
        button12.setVisible(true);
        button13.setVisible(true);
        button14.setVisible(true);
    }

    /**
     * Correct 4th Answer prompt
     */
    @FXML protected void correctAction4(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Correct move! Break the cycle. When you feel anxious, take a brisk walk or delve into a hobby to refocus your mind away from your worries.");
        alert.setTitle("Correct");
        alert.showAndWait();
        button13.setVisible(false);
        button14.setVisible(false);
        button12.setVisible(false);
        button15.setVisible(true);
        button17.setVisible(true);
        button18.setVisible(true);
    }
    /**
     * Correct 5th Answer prompt
     */
    @FXML protected void correctAction5(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Correct");
        alert.setContentText("Correct move! Keep a journal. Keeping track of your personal life can help you and your mental health professional identify what's causing you stress and what seems to help you feel better." );
        alert.showAndWait();

        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setHeaderText(null);
        alert1.setTitle(null);
        alert1.setContentText("You have finally tamed the Anxiety Monster!" );
        alert1.showAndWait();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
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

