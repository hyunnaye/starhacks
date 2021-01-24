
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The Depression Battle scene
 */
public class DepressionBattle {
    @FXML private ImageView bg;
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;
    @FXML private Button button10;
    @FXML private Button button11;
    @FXML private Button button12;
    @FXML private Button button13;
    @FXML private Button button14;
    @FXML private Button button15;
    @FXML private Button button16;
    @FXML private Button button17;
    @FXML private Button button18;
    @FXML private Button button19;
    @FXML private Button button20;



    /**
     * Initializes the Depression Battle scene. This is the beginning of the battle,
     * hiding every question button except first question.
     */
    public void initialize(){
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);
        button13.setVisible(false);
        button14.setVisible(false);
        button15.setVisible(false);
        button16.setVisible(false);
        button17.setVisible(false);
        button18.setVisible(false);
        button19.setVisible(false);
        button20.setVisible(false);
        Image img = new Image("Images/dq4.png");
        bg.setImage(img);
    }

    /**
     * Bad Answer prompt
     */
    @FXML protected void badAction(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incorrect");
        alert.setHeaderText(null);
        alert.setContentText("This is a bad move to deal with the Depression Monster. Try to use another move!");
        alert.showAndWait();
    }

    /**
     * Neutral Answer prompt
     */
    @FXML protected void neutralAction(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incorrect");
        alert.setHeaderText(null);
        alert.setContentText("This is not a bad move to deal with the Depression Monster " +
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
        alert.setContentText("Correct move! Try to be active and exercise. Know your limits, " +
                "but sports can promote the release of endorphins, neurotransmitters that can help relieve pain and stress. " +
                "Physical activity " + "can also stimulate the release of dopamine, norepinephrine," +
                " and serotonin which may help boost your mood!");
        alert.showAndWait();
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);
        button8.setVisible(true);
        Image img = new Image("Images/dq1.png");
        bg.setImage(img);
    }
    /**
     * Correct 2nd Answer prompt
     */
    @FXML protected void correctAction2(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Correct");
        alert.setContentText("Correct move! Set realistic goals for yourself. Know your \nlimits and when to say no.\n");

        alert.showAndWait();
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(true);
        button10.setVisible(true);
        button11.setVisible(true);
        button12.setVisible(true);
        Image img = new Image("Images/dq2.png");
        bg.setImage(img);
    }
    /**
     * Correct 3rd Answer prompt
     */
    @FXML protected void correctAction3(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Correct move! Try not to isolate yourself, and let others help you.\n");
        alert.setTitle("Correct");
        alert.showAndWait();
        button9.setVisible(false);
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);
        button13.setVisible(true);
        button14.setVisible(true);
        button15.setVisible(true);
        button16.setVisible(true);
        Image img = new Image("Images/dq3.png");
        bg.setImage(img);
    }

    /**
     * Correct 4th Answer prompt
     */
    @FXML protected void correctAction4(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("Correct move! Expect your mood to improve gradually, not \nimmediately, when taking this medication.\n");
        alert.setTitle("Correct");
        alert.showAndWait();
        button13.setVisible(false);
        button14.setVisible(false);
        button15.setVisible(false);
        button16.setVisible(false);
        button17.setVisible(true);
        button18.setVisible(true);
        button19.setVisible(true);
        button20.setVisible(true);
        Image img = new Image("Images/dq5.png");
        bg.setImage(img);
    }
    /**
     * Correct 5th Answer prompt
     */
    @FXML protected void correctAction5(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Correct");
        alert.setContentText("Correct move! Postpone important decisions, such as getting married or divorced, or changing jobs. " +
                "Discuss decisions with others who know you well and may have a more objective view of your situation." );
        alert.showAndWait();

        Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
        alert1.setHeaderText(null);
        alert1.setTitle(null);
        alert1.setContentText("You have finally tamed the Depression Monster!" );
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
        Image img = new Image("Images/dq1.png");
        bg.setImage(img);
    }
}

