package main.java;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EventsPageController implements Initializable{

    @FXML
    public Button BackButton;

    @FXML
    public Button HomeButton;

    @FXML
    public Button AnnouncementButton;

    @FXML
    public Button EventsButton;

    @FXML
    public Button GroupsButton;

    @FXML
    public Button UserListButton;

    @FXML
    public Button LogoutButton;

    @FXML
    public Button ProfileButton;

    @FXML
    public Button PageForwardButton;

    @FXML
    public Button PageBackButton;

    @FXML
    public Button CreateButton;

    @FXML
    public Button EditButton;

    @FXML
    public Button DeleteButton;

    @FXML
    public Button RunEventButton;

    @FXML
    public Button StatisticsButton;

    @FXML
    public Label Label1;

    @FXML
    public Label Label2;

    @FXML
    public Label Label3;

    @FXML
    public Label Label4;

    @FXML
    public Label Label5;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(!LogInController.isAdmin){
            DeleteButton.setVisible(false);
            EditButton.setVisible(false);
            CreateButton.setVisible(false);
            RunEventButton.setVisible(false);
            StatisticsButton.setVisible(false);
        }
    HomeButton.setOnAction(new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    });

    EventsButton.setOnAction(new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource("EventsPage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    });

    AnnouncementButton.setOnAction(new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource("AnnouncementsPage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    });

    ProfileButton.setOnAction(new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource("ProfilePage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    });

    GroupsButton.setOnAction(new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource("GroupsPage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    });

    UserListButton.setOnAction(new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource("UserListPage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    });

    LogoutButton.setOnAction(new EventHandler<>() {
        @Override
        public void handle(ActionEvent event) {
            LogInController.isAdmin = false;
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

