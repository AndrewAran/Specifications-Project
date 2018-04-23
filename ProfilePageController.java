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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProfilePageController implements Initializable {

    Connection conn;
    Statement stat;
    ResultSet rs1;
    String firstName;
    String lastName;
    String email;
    String phone;
    String major;
    String otherInformation;
    @FXML
    public TextField FirstNameTextField;
    @FXML
    public TextField LastNameTextField;
    @FXML
    public TextField EmailTextField;
    @FXML
    public TextField PhoneTextField;
    @FXML
    public TextField MajorTextField;
    @FXML
    public TextArea OtherInformationTextArea;


    public String CurrentPage = "ProfilePage.fxml";


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {

            Class.forName("org.h2.Driver");

            conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
            stat = conn.createStatement();
            firstName =null;
            lastName=null;
            email=null;
            phone=null;
            major=null;
            otherInformation=null;

            rs1 = stat.executeQuery("select * from profile where account_id = '" + Main.currentAccount + "'");

            while (rs1.next()) {
                firstName = rs1.getString("firstname");
                lastName = rs1.getString("lastname");
                email = rs1.getString("email");
                phone = rs1.getString("phone");
            }
            System.out.println("working");
            System.out.println(firstName);
            FirstNameTextField.setText("this is a test");
            LastNameTextField.setText(lastName);
            EmailTextField.setText(email);
            PhoneTextField.setText(phone);
            MajorTextField.setText(major);
            OtherInformationTextArea.setText(otherInformation);



        } catch (java.lang.Exception e) {

        }
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

            while (!Main.BackStack.empty()) {
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


    public void HandleConfirmButton(MouseEvent mouseEvent) throws Exception {

        firstName = FirstNameTextField.getText();
        lastName = LastNameTextField.getText();
        email = EmailTextField.getText();
        phone = PhoneTextField.getText();
        major = MajorTextField.getText();
        otherInformation = OtherInformationTextArea.getText();

        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
        Statement stat = conn.createStatement();
        stat.execute("insert into profile(firstname,lastname,email,phone,major,other) values( '" + firstName + "'," +
                " '" + lastName + "','" + email + "', '" + phone + "', '" + major + "', '" + otherInformation + "')");
    }
}