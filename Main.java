/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.h2.tools.DeleteDbFiles;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Stack;

public class Main extends Application {

    static public int eventCount =-1;
    static public String[] eventArray;
    static public String[] announcementArray;
    public static boolean isAdmin = false;
    public static Stack BackStack = new Stack();

    //This will launch the login frame starting the program
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception     {
        DeleteDbFiles.execute("~", "H2Test", true);

        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
        Statement stat = conn.createStatement();

        // this line would initialize the database
        // from the SQL script file 'init.sql'
        // stat.execute("runscript from 'init.sql'");

        stat.execute("CREATE TABLE account" +
                "(account_id SMALLINT NOT NULL AUTO_INCREMENT," +
                "username VARCHAR(20)," +
                "password VARCHAR(20)," +
                "uin INT," +
                "CONSTRAINT pk_account PRIMARY KEY (account_id)" +
                ");");

        stat.execute("CREATE TABLE profile" +
                "(account_id SMALLINT UNSIGNED," +
                "firstname VARCHAR(30)," +
                "lastname VARCHAR(30)," +
                "email VARCHAR(30)," +
                "major VARCHAR(20)," +
                "other VARCHAR(50)," +
                "CONSTRAINT pk_profile PRIMARY KEY (account_id)," +
                "CONSTRAINT fk_profile_account_id FOREIGN KEY (account_id) " +
                "REFERENCES account (account_id)" +
                ");");

        stat.execute("CREATE TABLE event" +
                "(event_id SMALLINT UNSIGNED," +
                "eventname VARCHAR(20)," +
                "eventlocation VARCHAR(20)," +
                "eventdate DATE," +
                "eventtime VARCHAR(20)," +
                "sorority VARCHAR(20)," +
                "description VARCHAR(50)," +
                "CONSTRAINT pk_event PRIMARY KEY (event_id)," +
                ");");


        stat.execute("CREATE TABLE announcement" +
                "(announcement_id SMALLINT UNSIGNED," +
                "description VARCHAR(50)," +
                "CONSTRAINT pk_announcement PRIMARY KEY (announcement_id)," +
                ");");



        stat.execute("insert into account(username,password,uin) values('BJSIMMONS0221','12345', 815070221)");

        stat.execute("insert into account(username,password,uin) values('bjsimmons0221','12345', 815070221)");
        stat.execute("insert into account(username,password,uin) values('andrew','23456', 11111111)");
        stat.execute("insert into account(username,password,uin) values('shane','34567', 222222222)");
        stat.execute("insert into profile values(1, 'Bryan','Simmons','fgcu@fgcu.edu', 'Software Engineering',null)");
        stat.execute("insert into event values(1, 'Group Presentation','classroom','2018-04-19', '11:00AM','Omega Chi','present')");
        stat.execute("insert into event values(2, 'Group Presentation2','classroom2','2018-04-19', '11:02AM','Omega Chi','present2')");
        stat.execute("insert into announcement values(1, 'This is a test announcement')");
        stat.execute("insert into announcement values(2, ' Chi Omega Monthly meeting is canceled for April')");

        ResultSet rs;

        // print user/pass/uin from account
        rs = stat.executeQuery("select * from account");
        while (rs.next()) {
            System.out.println(rs.getString("username"));

            System.out.println(rs.getString("password"));

            System.out.println(rs.getString("uin"));
        }

        // print user from account where account_id =1
        rs = stat.executeQuery("select username from account WHERE account_id = 1");
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }

        // print first/last name, major, sorority from profile where account_id =1
        rs = stat.executeQuery("select * from profile WHERE account_id = 1");
        while (rs.next()) {
            System.out.println(rs.getString("firstname"));
            System.out.println(rs.getString("lastname"));
            System.out.println(rs.getString("major"));
            System.out.println(rs.getString("email"));
        }

        eventArray = new String[5];
        rs = stat.executeQuery("select * from event");
        while (rs.next()) {
            System.out.println(rs.getString("eventname"));
            System.out.println(rs.getString("eventlocation"));
            System.out.println(rs.getString("eventdate"));
            System.out.println(rs.getString("eventtime"));
            System.out.println(rs.getString("sorority"));
            System.out.println(rs.getString("description"));
            eventCount++;
            eventArray[eventCount] = rs.getString("eventname")+"    "+rs.getString("eventlocation")+"    "+
                    rs.getString("eventdate")+"    "+rs.getString("eventtime")+"    "+rs.getString("sorority")+"    "+
                    rs.getString("description");
            System.out.println("eventarray1 "+eventArray[0]);
        }

        rs = stat.executeQuery("select * from announcement WHERE announcement_id = 1");
        while (rs.next()) {
            System.out.println(rs.getString("description"));
        }

        rs = stat.executeQuery("select * from event");
        while (rs.next()) {
            System.out.println(rs.getString("eventname"));
            System.out.println(rs.getString("eventlocation"));
            System.out.println(rs.getString("eventdate"));
            System.out.println(rs.getString("eventtime"));
            System.out.println(rs.getString("sorority"));
            System.out.println(rs.getString("description"));


        }
        announcementArray = new String[5];

        rs = stat.executeQuery("select * from announcement");
        int annCount = 0;
        while (rs.next()){
            annCount++;
            announcementArray[annCount] = rs.getString("description");
            System.out.println("eventarray1 "+announcementArray[0]);
        }
        stat.close();
        conn.close();
        launch(args);
    }
}