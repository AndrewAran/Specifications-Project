/*
Controller for Announcements Page
*/

import javafx.fxml.FXML;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CreateUserAccountController implements Initializable {

    @FXML
    public PasswordField ConfirmPasswordTextField;

    @FXML
    public PasswordField UINTextField;

    @FXML
    public Button ConfirmButton;

    @FXML
    public TextField UserNameTextField;

    @FXML
    public PasswordField PasswordTextField;

    @FXML
    private Button BButton;




    public void initialize(URL url, ResourceBundle rb) {
    }

    public void HandleConfirmButton(MouseEvent mouseEvent) throws Exception {
        String tempUserName;
        String tempPassword;
        String tempUIN;

        if( UserNameTextField.getText().equals("")|| PasswordTextField.getText().equals("")||
                ConfirmPasswordTextField.getText().equals("")||  UINTextField.getText().equals("")){
            System.out.println("make sure no fields are empty");
            return;

        }
        tempUserName = UserNameTextField.getText();
        tempPassword = PasswordTextField.getText();
        tempUIN = UINTextField.getText();

        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
        Statement stat = conn.createStatement();
        stat.execute("insert into account(username,password,uin) values( '"+tempUserName+"', '"+tempPassword+"','"+tempUIN+"')");

        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleBackButton(MouseEvent mouseEvent) {
        try {//this switches the scene to the login page
            Parent UserFrame = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}