import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
//import sun.rmi.runtime.Log;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserListController implements Initializable {

    public String CurrentPage = "UserListPage.fxml";

    public ComboBox CBox;

    public Label PlaceHolder1Label;
    public Label PlaceHolder2Label;
    public Label PlaceHolder3Label;
    public Label PlaceHolder4Label;
    public Label PlaceHolder5Label;
    public Label PlaceHolder6Label;
    public Label PlaceHolder7Label;
    public Label PlaceHolder8Label;
    public Label PlaceHolder9Label;
    public Label PlaceHolder10Label;

    public javafx.scene.control.Button SetUserButton;
    public javafx.scene.control.Button SetAdminButton;
    public javafx.scene.control.Button ViewEditButton;



    public void HandleHomeButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();

            Main.BackStack.push(CurrentPage);

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

            Main.BackStack.push(CurrentPage);

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

            Main.BackStack.push(CurrentPage);

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

            Main.BackStack.push(CurrentPage);

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

            Main.BackStack.push(CurrentPage);

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

            Main.BackStack.push(CurrentPage);

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

            while (!Main.BackStack.empty()){
                Main.BackStack.pop();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleBackButton(MouseEvent mouseEvent) {
        String Location;
            Location = (Main.BackStack.pop()).toString();
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource(Location));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }

    public void initialize (URL url, ResourceBundle rb) {

        PlaceHolder1Label.setText("Andrew Aran");
        PlaceHolder2Label.setText("Jane Doe");
        PlaceHolder3Label.setVisible(false);
        PlaceHolder4Label.setVisible(false);
        PlaceHolder5Label.setVisible(false);
        PlaceHolder6Label.setVisible(false);
        PlaceHolder7Label.setVisible(false);
        PlaceHolder8Label.setVisible(false);
        PlaceHolder9Label.setVisible(false);
        PlaceHolder10Label.setVisible(false);
/*
        CBox.setVisible(false);
*/

        if(!LogInController.isAdmin){
            ViewEditButton.setVisible(false);
            SetAdminButton.setVisible(false);
            SetUserButton.setVisible(false);
        }

    }
}
