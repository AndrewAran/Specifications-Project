import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CreateUserAccountController implements Initializable {

    @FXML
    public PasswordField CPWTextField;

    @FXML
    public PasswordField UINTextField;

    @FXML
    public Button CButton;

    @FXML
    public TextField UNTextField;

    @FXML
    public PasswordField PWTextField;

    @FXML
    private Button BButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        assert BButton != null;
        assert CButton != null;

        BButton.setOnAction(new javafx.event.EventHandler<>() {//When the back button is clicked it will return to the login page
            @Override
            public void handle(javafx.event.ActionEvent event) {
                try {//this switches the scene to the login page
                    Parent UserFrame = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
                    Scene UserFrameScene = new Scene(UserFrame);
                    Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    getUserFrame.setScene(UserFrameScene);
                    getUserFrame.show();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
    });

        CButton.setOnAction(new javafx.event.EventHandler<>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {//This needs to have the database stuff to add the new user to the user list, currently it just brings you to the home page
                try {
                    Parent UserFrame = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
                    Scene UserFrameScene = new Scene(UserFrame);
                    Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    getUserFrame.setScene(UserFrameScene);
                    getUserFrame.show();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        });
    }
}