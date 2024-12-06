package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
    }

    public void display(DealershipDatabaseManager dataManager) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1) PriceRange");
            System.out.println("2) Make/Model");
            System.out.println("3) YearRange");
            System.out.println("4) Color");
            System.out.println("5) MileageRange");
            System.out.println("6) Vehicle Type");
            System.out.println("7) All Vehicles");

            System.out.println("8) Add Vehicles");
            System.out.println("9) Remove Vehicles");

            System.out.println("10) Exit");

            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Type in the max price: ");
                    double priceRange = scanner.nextDouble();

                    List<Vehicle> priceR = dataManager.getPriceRange(priceRange);

                        for (Vehicle vehicle : priceR) {
                            System.out.println("\nVIN: " + vehicle.getVin());
                            System.out.println("Year: " + vehicle.getYear());
                            System.out.println("Make: " + vehicle.getMake());
                            System.out.println("Model: " + vehicle.getModel());
                            System.out.println("Price: " + vehicle.getPrice());
                            System.out.println("--------");
                        }
                    break;
                case 2:
                    System.out.print("Type in the make or model: ");
                    String makeModel = scanner.nextLine();

                    List<Vehicle> theCar = dataManager.getMakeModel(makeModel);

                    for (Vehicle vehicle : theCar) {
                        System.out.println("\nVIN: " + vehicle.getVin());
                        System.out.println("Year: " + vehicle.getYear());
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Price: " + vehicle.getPrice());
                        System.out.println("--------");
                    }
                    break;
                case 3:
                    System.out.print("Type in the max year: ");
                    int yearRange = scanner.nextInt();

                    List<Vehicle> yearR = dataManager.getYearRange(yearRange);

                    for (Vehicle vehicle : yearR) {
                        System.out.println("\nVIN: " + vehicle.getVin());
                        System.out.println("Year: " + vehicle.getYear());
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Price: " + vehicle.getPrice());
                        System.out.println("--------");
                    }
                    break;
                case 4:
                    System.out.print("Type in the color: ");
                    String colorPicker = scanner.nextLine();

                    List<Vehicle> theColor = dataManager.getColor(colorPicker);

                    for (Vehicle vehicle : theColor) {
                        System.out.println("\nVIN: " + vehicle.getVin());
                        System.out.println("Year: " + vehicle.getYear());
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Price: " + vehicle.getPrice());
                        System.out.println("--------");
                    }
                    break;
                case 5:
                    System.out.print("Type in the max mileage: ");
                    int mileage = scanner.nextInt();

                    List<Vehicle> mileR = dataManager.getMileageRange(mileage);

                    for (Vehicle vehicle : mileR) {
                        System.out.println("\nVIN: " + vehicle.getVin());
                        System.out.println("Year: " + vehicle.getYear());
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Price: " + vehicle.getPrice());
                        System.out.println("--------");
                    }
                    break;
                case 6:
                    System.out.print("Type in the type of vehicle: ");
                    String typing = scanner.nextLine();

                    List<Vehicle> theVType = dataManager.getTypeRange(typing);

                    for (Vehicle vehicle : theVType) {
                        System.out.println("\nVIN: " + vehicle.getVin());
                        System.out.println("Year: " + vehicle.getYear());
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Price: " + vehicle.getPrice());
                        System.out.println("--------");
                    }
                    break;
                case 7:
                    List<Vehicle> vehicles = dataManager.getAllVehicles();

                    // Print the results
                    for (Vehicle vehicle : vehicles) {
                        System.out.println("VIN: " + vehicle.getVin());
                        System.out.println("Year: " + vehicle.getYear());
                        System.out.println("Make: " + vehicle.getMake());
                        System.out.println("Model: " + vehicle.getModel());
                        System.out.println("Price: " + vehicle.getPrice());
                        System.out.println("--------");
                    }
                    break;
                case 8:
                    System.out.println("List all required car details: ");
                    System.out.print("What is the vehicle identification number?: ");
                    int vinS = scanner.nextInt();

                    System.out.print("What is the year?: ");
                    int yearS = scanner.nextInt();

                    System.out.print("What is the make?: ");
                    String makeS = scanner.nextLine();

                    System.out.print("What is the model?: ");
                    String modelS = scanner.nextLine();
                    
                    System.out.print("What is the year?: ");
                    double priceS = scanner.nextDouble();

                    List<Vehicle> vehicleAdded = dataManager.addVehicle(vinS, yearS, makeS, modelS, priceS);
                    break;
                case 9:
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command, try again");
                    break;
            }
            break;
        }
    }
}
