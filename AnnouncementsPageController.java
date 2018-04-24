/*
Controller for Announcements Page
*/

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class AnnouncementsPageController implements Initializable {
    static public String[] announcementArray;
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
    public Button CreateButton;

    @FXML
    public Button EditButton;

    @FXML
    public Button DeleteButton;

    @FXML
    private Label label21;

    public Label Label1;

    public Label Label2;

    public Label Label3;

    public Label Label4;

    public Label Label5;

    public String CurrentPage = "AnnouncementsPage.fxml";

    public void HandleHomeButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();

            String Location = "HomePage.fxml";
            Main.BackStack.push(Location);
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

            String Location = "AnnouncementsPage.fxml";
            Main.BackStack.push(Location);
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

            String Location = "EventsPage.fxml";
            Main.BackStack.push(Location);
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

            String Location = "GroupsPage.fxml";
            Main.BackStack.push(Location);
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

            String Location = "UserListPage.fxml";
            Main.BackStack.push(Location);
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

            String Location = "ProfilePage.fxml";
            Main.BackStack.push(Location);
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
        if(Main.BackStack.peek().equals(CurrentPage)){
            String TempStore = Main.BackStack.pop().toString();
            Location = (Main.BackStack.pop()).toString();
            Main.BackStack.push(TempStore);
            try {
                Parent UserFrame = FXMLLoader.load(getClass().getResource(Location));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }

        }else{
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
    }
    public void HandleCreateButton(MouseEvent mouseEvent) {
        try {
            Parent UserFrame = FXMLLoader.load(getClass().getResource("CreateAnnouncementPage.fxml"));
            Scene UserFrameScene = new Scene(UserFrame);
            Stage getUserFrame = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            getUserFrame.setScene(UserFrameScene);
            getUserFrame.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void HandleEditButton(MouseEvent mouseEvent) {
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("test1");
        if(!LogInController.isAdmin){
            DeleteButton.setVisible(false);
            EditButton.setVisible(false);
            CreateButton.setVisible(false);
/*            RunEventButton.setVisible(false);
            StatisticsButton.setVisible(false);*/
        }
        try {

            Class.forName("org.h2.Driver");

            Connection conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
            Statement stat = conn.createStatement();

            ResultSet rs = stat.executeQuery("select description from announcement");
            int i=0;
            while (rs.next()) {
                System.out.println("test2");
                announcementArray[i] = rs.getString("description");
                System.out.println(announcementArray[i]);
                i++;
            }



        } catch (java.lang.Exception e) {

        }
        Label1.setText(Main.announcementArray[0]);
        Label2.setText(Main.announcementArray[1]);
        Label3.setText(Main.announcementArray[2]);
        Label4.setText(Main.announcementArray[3]);
        Label5.setText(Main.announcementArray[4]);
    }

}
