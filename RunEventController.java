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

public class RunEventController implements Initializable {

    @FXML
    public javafx.scene.control.TextField CheckInTextBox;
    public javafx.scene.control.TextField CheckOutTextBox;
    public int checkIn = 0;
    public javafx.scene.control.Label CheckedInLabel;

    public javafx.scene.control.Label CheckedIn1Label;
    public javafx.scene.control.Label CheckedIn2Label;
    public javafx.scene.control.Label CheckedIn3Label;
    public javafx.scene.control.Label CheckedIn4Label;
    public javafx.scene.control.Label CheckedIn5Label;
    public javafx.scene.control.Label CheckedIn6Label;
    public javafx.scene.control.Label CheckedIn7Label;
    public javafx.scene.control.Label CheckedIn8Label;
    public javafx.scene.control.Label CheckedIn9Label;
    public javafx.scene.control.Label CheckedIn10Label;

    public javafx.scene.control.Label CheckOut1Label;
    public javafx.scene.control.Label CheckOut2Label;
    public javafx.scene.control.Label CheckOut3Label;
    public javafx.scene.control.Label CheckOut4Label;
    public javafx.scene.control.Label CheckOut5Label;
    public javafx.scene.control.Label CheckOut6Label;
    public javafx.scene.control.Label CheckOut7Label;
    public javafx.scene.control.Label CheckOut8Label;
    public javafx.scene.control.Label CheckOut9Label;
    public javafx.scene.control.Label CheckOut10Label;





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

        CheckedIn1Label.setVisible(false);
        CheckedIn2Label.setVisible(false);
        CheckedIn3Label.setVisible(false);
        CheckedIn4Label.setVisible(false);
        CheckedIn5Label.setVisible(false);
        CheckedIn6Label.setVisible(false);
        CheckedIn7Label.setVisible(false);
        CheckedIn8Label.setVisible(false);
        CheckedIn9Label.setVisible(false);
        CheckedIn10Label.setVisible(false);

        CheckOut1Label.setVisible(false);
        CheckOut2Label.setVisible(false);
        CheckOut3Label.setVisible(false);
        CheckOut4Label.setVisible(false);
        CheckOut5Label.setVisible(false);
        CheckOut6Label.setVisible(false);
        CheckOut7Label.setVisible(false);
        CheckOut8Label.setVisible(false);
        CheckOut9Label.setVisible(false);
        CheckOut10Label.setVisible(false);



    }

    public void HandleCheckIn(MouseEvent mouseEvent) {
        if(CheckInTextBox.getText().equals("815025602")){
            CheckedIn1Label.setVisible(true);
            CheckedIn1Label.setText("Andrew Aran ");
            CheckedInLabel.setText(Integer.toString(++checkIn));
        }
    }

    public void HandleCheckOut(MouseEvent mouseEvent) {
        if(CheckOutTextBox.getText().equals("815025602")){
            CheckOut1Label.setVisible(true);
            CheckOut1Label.setText("Andrew Aran");
            CheckedInLabel.setText(Integer.toString(--checkIn));
        }
    }
}
