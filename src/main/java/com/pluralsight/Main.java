package com.pluralsight;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Application needs two arguments to run: " +
                            "java com.hca.jdbc.UsingDriverManager <username> " +
                            "<password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        DealershipDatabaseManager dataManager = new DealershipDatabaseManager(username, password);
        UserInterface user = new UserInterface();
        user.display(dataManager);



    }
    //Create instance of UserInterface class and call display() method
    //At this point, you can list all vehicles and quit
    //The customer must be able to add/remove vehicles
}