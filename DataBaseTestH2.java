/*
 * Copyright 2004-2018 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */

//import org.h2.tools.DeleteDbFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * class that loads the driver, create a database,
 * create table, and inserts data.
 */
public class DataBaseTestH2 {

    public static void main(String[] args) throws Exception {
        // delete the database named 'test' in the user home directory
        //comment out by me because of intellij
     //   DeleteDbFiles.execute("~", "H2Test", true);

        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/H2Test");
        Statement stat = conn.createStatement();

        // this line would initialize the database
        // from the SQL script file 'init.sql'
        // stat.execute("runscript from 'init.sql'");

        stat.execute("CREATE TABLE account" +
                "(account_id SMALLINT UNSIGNED," +
                "username VARCHAR(20)," +
                "password VARCHAR(20)," +
                "uin INT," +
                "CONSTRAINT pk_account PRIMARY KEY (account_id)" +
                ");");

        stat.execute("CREATE TABLE profile" +
                "(account_id SMALLINT UNSIGNED," +
                "firstname VARCHAR(20)," +
                "lastname VARCHAR(20)," +
                "major VARCHAR(20)," +
                "sorority VARCHAR(20)," +
                "CONSTRAINT pk_profile PRIMARY KEY (account_id)," +
                "CONSTRAINT fk_profile_account_id FOREIGN KEY (account_id) " +
                "REFERENCES account (account_id)" +
                ");");

        stat.execute("CREATE TABLE event" +
                "(event_id SMALLINT UNSIGNED," +
                "eventname VARCHAR(20)," +
                "eventdate DATE," +
                "CONSTRAINT pk_event PRIMARY KEY (event_id)," +
                ");");

        stat.execute("CREATE TABLE announcement" +
                "(announcement_id SMALLINT UNSIGNED," +
                "body VARCHAR(50)," +
                "group_ VARCHAR(20)," +
                "CONSTRAINT pk_announcement PRIMARY KEY (announcement_id)," +
                ");");



        stat.execute("insert into account values(1, 'bjsimmons0221','12345', 815070221)");
        stat.execute("insert into profile values(1, 'Bryan','Simmons', 'Software Engineering',null)");
        stat.execute("insert into event values(1, 'Group Presentation','2018-04-19')");
        stat.execute("insert into announcement values(1, 'This is a test announcement','c2019')");
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
            System.out.println(rs.getString("sorority"));
        }

        rs = stat.executeQuery("select * from event WHERE event_id = 1");
        while (rs.next()) {
            System.out.println(rs.getString("eventname"));
            System.out.println(rs.getString("eventdate"));
        }

        rs = stat.executeQuery("select * from announcement WHERE announcement_id = 1");
        while (rs.next()) {
            System.out.println(rs.getString("body"));
            System.out.println(rs.getString("group_"));
        }
        stat.close();
        conn.close();
    }

}