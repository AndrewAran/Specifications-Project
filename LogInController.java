

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController implements Initializable {

    @FXML
    public TextField UNTextField;
    public static boolean isAdmin = false;

    public void HandleCreateButtonAction(ActionEvent event){//currently it just goes to appropriate page
        try{//this switches the scene to the create user page
        Parent UserFrame = FXMLLoader.load(getClass().getResource("CreateAccountPage.fxml"));
        Scene UserFrameScene = new Scene(UserFrame);
        Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getUserFrame.setScene(UserFrameScene);
        getUserFrame.show();
    }catch(IOException e){
            System.out.println(e);
        }
    }
    public void HandleLogInButtonAction(ActionEvent event) {//this happens when login button is pressed. here we will put password validation
        if(UNTextField.getText().equals("Andrew Aran")){
            isAdmin = true;
        }

        try {//this switches the scene to the create user page
                Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
