/*
Controller for events Page
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EventsPageController implements Initializable{

    public String CurrentPage = "EventsPage.fxml";

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

    public boolean isSelceted = false;

    public static int currentEvent;



    @Override
    public void initialize(URL url, ResourceBundle rb) {
/*        if(!LogInController.isAdmin){
            DeleteButton.setVisible(false);
            EditButton.setVisible(false);
            CreateButton.setVisible(false);
            RunEventButton.setVisible(false);
            StatisticsButton.setVisible(false);
        }*/
        Label1.setText(Main.eventArray[0]);
        Label2.setText(Main.eventArray[1]);
        Label3.setText(Main.eventArray[2]);
        Label4.setText(Main.eventArray[3]);
        Label5.setText(Main.eventArray[4]);
    }

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

    public void HandleRunEventButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("RunEventPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();

            Main.BackStack.push(CurrentPage);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleStatisticsButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("StatisticsPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();

            Main.BackStack.push(CurrentPage);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleDelete(MouseEvent mouseEvent) {
        Label2.setVisible(false);
    }


    public void HandleCreateButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("CreateEventPagePage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();

            Main.BackStack.push(CurrentPage);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void HandleEditButton(MouseEvent mouseEvent) {
    }

    public void HandleLabel1(MouseEvent mouseEvent) {
        if(isSelceted) {
            Label2.setTextFill(Color.BLACK);
            Label3.setTextFill(Color.BLACK);
            Label4.setTextFill(Color.BLACK);
            Label5.setTextFill(Color.BLACK);
        }
            Label1.setTextFill(Color.RED);
            isSelceted = true;
    }

    public void HandleLabel2(MouseEvent mouseEvent) {
        if(isSelceted) {
            Label1.setTextFill(Color.BLACK);
            Label3.setTextFill(Color.BLACK);
            Label4.setTextFill(Color.BLACK);
            Label5.setTextFill(Color.BLACK);
        }
        Label2.setTextFill(Color.RED);
        isSelceted = true;
    }

    public void HandleLabel3(MouseEvent mouseEvent) {
        if(isSelceted) {
            Label2.setTextFill(Color.BLACK);
            Label1.setTextFill(Color.BLACK);
            Label4.setTextFill(Color.BLACK);
            Label5.setTextFill(Color.BLACK);
        }
        Label3.setTextFill(Color.RED);
        isSelceted = true;
    }

    public void HandleLabel4(MouseEvent mouseEvent) {
        if(isSelceted) {
            Label2.setTextFill(Color.BLACK);
            Label3.setTextFill(Color.BLACK);
            Label1.setTextFill(Color.BLACK);
            Label5.setTextFill(Color.BLACK);
        }
        Label4.setTextFill(Color.RED);
        isSelceted = true;
    }

    public void HandleLabel5(MouseEvent mouseEvent) {
        if(isSelceted) {
            Label2.setTextFill(Color.BLACK);
            Label3.setTextFill(Color.BLACK);
            Label4.setTextFill(Color.BLACK);
            Label1.setTextFill(Color.BLACK);
        }
        Label5.setTextFill(Color.RED);
        isSelceted = true;
    }
}