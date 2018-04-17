import javafx.fxml.FXML;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CreateUserAccountController {

    public void HandleBackButton(ActionEvent actionEvent) throws IOException {
        try{//this switches the scene to the create user page
            Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        }catch(IOException e1){
            System.out.println(e1);
        }
    }
}