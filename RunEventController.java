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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class RunEventController implements Initializable {

    public String CurrentPage = "RunEventPage.fxml";

    @FXML
    public javafx.scene.control.TextField CheckInTextBox;
    public javafx.scene.control.TextField CheckOutTextBox;
    public int checkIn = 0;
    public javafx.scene.control.Label CheckedInLabel;

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
    public void HandleCheckIn(MouseEvent mouseEvent) throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
        Statement stat = conn.createStatement();

        ResultSet rs1;
        ResultSet rs2;

        rs1 = stat.executeQuery("select uin from account");
        while (rs1.next()){
            if(CheckInTextBox.getText().equals(rs1.getString("uin"))){
                String uniTemp = CheckInTextBox.getText();
                rs2 = stat.executeQuery("select firstname, lastname from profile where account_id = '"+uniTemp+"'");
                while(rs2.next()){

                }
            }
        }
    }

    public void HandleCheckOut(MouseEvent mouseEvent) {

    }

    public void initialize (URL url, ResourceBundle rb){
    }


}
