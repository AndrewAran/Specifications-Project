

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController implements Initializable {

    @FXML
    public TextField UserNameTextField;
    public static boolean isAdmin = false;

    public void HandleCreateButtonAction(ActionEvent event){//currently it just goes to appropriate page
        try{//this switches the scene to the create user page
        Parent UserFrame = FXMLLoader.load(getClass().getResource("CreateAccountPage.fxml"));
        Scene UserFrameScene = new Scene(UserFrame);
        Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
        getUserFrame.setScene(UserFrameScene);
        getUserFrame.show();
    }catch(IOException e){
            System.out.println(e);
        }
    }
    public void HandleLogInButtonAction(ActionEvent event) throws Exception{//this happens when login button is pressed. here we will put password validation
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
        Statement stat = conn.createStatement();
        ResultSet rs1;
        ResultSet rs2;
        String temp;
        rs1 = stat.executeQuery("select username from account");
        while (rs1.next()) {
            if(UserNameTextField.getText().equals(rs1.getString("username"))){

                System.out.println(rs1.getString("username"));
                temp = rs1.getString("username");

                rs2 = stat.executeQuery("select password from account");
                while (rs2.next()) {

                    System.out.println(rs2.getString("password"));
                }
                break;

            }

            System.out.println(rs1.getString("username"));
        }
        if(UserNameTextField.getText().equals("Andrew Aran")){
            isAdmin = true;
        }

        try {//this switches the scene to the create user page
                Parent UserFrame = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
                Scene UserFrameScene = new Scene(UserFrame);
                Stage getUserFrame = (Stage) ((Node) event.getSource()).getScene().getWindow();
                getUserFrame.setScene(UserFrameScene);
                getUserFrame.show();
            } catch (IOException e) {
                System.out.println(e);
            }
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
