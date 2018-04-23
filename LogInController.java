import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Stack;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController implements Initializable {

    @FXML
    public TextField UserNameTextField;
    @FXML
    public TextField PasswordTextField;
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
        String nameTemp;
        String passTemp;
        rs1 = stat.executeQuery("select username from account");
        while (rs1.next()) {
            if(UserNameTextField.getText().equals(rs1.getString("username"))){
                System.out.println(rs1.getString("username"));
                nameTemp = rs1.getString("username");
                rs2 = stat.executeQuery("select password,account_id from account where username = '"+nameTemp+"'");
                while (rs2.next()) {
                    passTemp = rs2.getString("password");
                    System.out.println(passTemp);
                    if(PasswordTextField.getText().equals(passTemp)){
                        System.out.println("success");
                        Main.currentAccount =rs2.getInt("account_id");
                        System.out.println(Main.currentAccount);
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
                }
                break;


            }
            if(rs1.isLast()){
                System.out.println("notfound");
            }
         //   System.out.println(rs1.getString("username"));
        }
        if(UserNameTextField.getText().equals("Andrew Aran")){
            isAdmin = true;
        }


    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}