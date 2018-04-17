import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {


    public void HandleEB(ActionEvent e){
        try{

            Parent UserFrame = FXMLLoader.load(getClass().getResource("EventsPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) e.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();

        }catch(IOException e1){
            System.out.println(e);
        }

    }

    public void HandleHBA(ActionEvent actionEvent) {

        try{//this will allow the user to essentially refresh the page since they are already on the home page
            Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();

        }catch(IOException e){//Catches Io exception and prints out the error to the console.
            System.out.println(e);
        }
    }

    public void HandleAB(ActionEvent actionEvent) {

    }

    public void HandlePB(ActionEvent actionEvent) {

    }

    public void HandleGB(ActionEvent actionEvent) {

    }

    public void HandleULB(ActionEvent actionEvent) {

    }

    public void HandleLOB(ActionEvent actionEvent) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
