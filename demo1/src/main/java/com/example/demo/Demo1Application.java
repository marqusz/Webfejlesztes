package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);




    }

    public static List<DatabaseInfo> kimenet(){
        List<DatabaseInfo> output = new ArrayList<>();
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nevek1","root","alma");

            Statement myStm= myConn.createStatement();

            ResultSet myRs=myStm.executeQuery("select * from users");

            while(myRs.next()){


                output.add(new DatabaseInfo(myRs.getString("id"),
                        myRs.getString("first_name"),
                        myRs.getString("last_name"),
                        myRs.getString("date_created"),
                        myRs.getString("num_points")));




            }

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

        return output;
    }

}
