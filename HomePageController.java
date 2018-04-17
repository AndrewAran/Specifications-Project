import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {

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
        HomeButton.setOnAction(new EventHandler<>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
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
            public void handle(javafx.event.ActionEvent event) {
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
            public void handle(javafx.event.ActionEvent event) {
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
            public void handle(javafx.event.ActionEvent event) {
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
            public void handle(javafx.event.ActionEvent event) {
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
            public void handle(javafx.event.ActionEvent event) {
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
            public void handle(javafx.event.ActionEvent event) {
                Stage popupwindow = new Stage();

                popupwindow.initModality(Modality.APPLICATION_MODAL);
                popupwindow.setTitle("Log Out Confirmation");

                Label label1 = new Label("Are you sure you want to log out?");

                Button button1 = new Button("Yes");
                Button button2 = new Button("No");

                VBox layout= new VBox(10);


                layout.getChildren().addAll(label1, button1, button2);
                layout.setAlignment(Pos.CENTER);
                Scene scene1= new Scene(layout, 300, 250);
                popupwindow.setScene(scene1);
                popupwindow.showAndWait();

                button2.setOnAction(event1 -> popupwindow.close());
                button1.setOnAction(new EventHandler<>() {

                    @Override
                    public void handle(javafx.event.ActionEvent event) {
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
        });

        BackButton.setOnAction(new EventHandler<>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
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
