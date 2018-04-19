import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Date;

public class RunEventController implements Initializable {

    @FXML
    public javafx.scene.control.Label CheckedIn1Label;
    public javafx.scene.control.TextField CheckInTextBox;
    public javafx.scene.control.TextField CheckOutTextBox;

    public void HandleHomeButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleAnnButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("AnnouncementsPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleEventsButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("EventsPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleGroupsButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("GroupsPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleUserListButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("UserListPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleProfileButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("ProfilePage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleLogOutButton(MouseEvent mouseEvent) {
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
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("EventsPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void initialize (URL url, ResourceBundle rb){

    }

    public void HandleCheckIn(MouseEvent mouseEvent) {
        if(CheckInTextBox.getText() == "815025602"){
            java.util.Date date=new java.util.Date();
            CheckedIn1Label.setText("Andrew Aran "+date);
        }
    }

    public void HandleCheckOut(MouseEvent mouseEvent) {

    }
}
