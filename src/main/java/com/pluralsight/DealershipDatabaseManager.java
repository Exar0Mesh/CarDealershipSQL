package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipDatabaseManager {

    private BasicDataSource dataSource;

    public DealershipDatabaseManager(String username, String password) {
        this.dataSource = new BasicDataSource();
        this.dataSource.setUrl("jdbc:mysql://localhost:3306/cardealership");
        this.dataSource.setUsername(username);
        this.dataSource.setPassword(password);
    }

    //Same code, different filters
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> cars = new ArrayList<>();
        String query = "SELECT * FROM vehicles";
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            try (ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int vin = results.getInt("VIN");
                    int year = results.getInt("year");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    String vehicleType = results.getString("vehicleType");
                    String color = results.getString("color");
                    int odometer = results.getInt("odometer");
                    double price = results.getDouble("price");
                    //String sold = results.getString("SOLD");
                    cars.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Get into the habit of doing this one separately.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Vehicle> getPriceRange(double priceRange) {
        List<Vehicle> cars = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE price <= ?";
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setDouble(1, priceRange);

            try (ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int vin = results.getInt("VIN");
                    int year = results.getInt("year");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    String vehicleType = results.getString("vehicleType");
                    String color = results.getString("color");
                    int odometer = results.getInt("odometer");
                    double price = results.getDouble("price");
                    //String sold = results.getString("SOLD");
                    Vehicle moreVehicles = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    cars.add(moreVehicles);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Get into the habit of doing this one separately.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Vehicle> getMakeModel(String makeModel) {
        List<Vehicle> cars = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE make LIKE ? or model LIKE ?";
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setString(1, "%" + makeModel + "%");
            statement.setString(2, "%" + makeModel + "%");

            try (ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int vin = results.getInt("VIN");
                    int year = results.getInt("year");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    String vehicleType = results.getString("vehicleType");
                    String color = results.getString("color");
                    int odometer = results.getInt("odometer");
                    double price = results.getDouble("price");
                    //String sold = results.getString("SOLD");
                    cars.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Get into the habit of doing this one separately.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Vehicle> getYearRange(int yearRange) {
        List<Vehicle> cars = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE year <= ?";
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setInt(1, yearRange);

            try (ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int vin = results.getInt("VIN");
                    int year = results.getInt("year");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    String vehicleType = results.getString("vehicleType");
                    String color = results.getString("color");
                    int odometer = results.getInt("odometer");
                    double price = results.getDouble("price");
                    //String sold = results.getString("SOLD");
                    cars.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Get into the habit of doing this one separately.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Vehicle> getColor(String colorPicker) {
        List<Vehicle> cars = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE color LIKE ?";
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setString(1, "%" + colorPicker + "%");

            try (ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int vin = results.getInt("VIN");
                    int year = results.getInt("year");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    String vehicleType = results.getString("vehicleType");
                    String color = results.getString("color");
                    int odometer = results.getInt("odometer");
                    double price = results.getDouble("price");
                    //String sold = results.getString("SOLD");
                    cars.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Get into the habit of doing this one separately.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Vehicle> getMileageRange(int mileage) {
        List<Vehicle> cars = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE odometer < ?";
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setInt(1, mileage);

            try (ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int vin = results.getInt("VIN");
                    int year = results.getInt("year");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    String vehicleType = results.getString("vehicleType");
                    String color = results.getString("color");
                    int odometer = results.getInt("odometer");
                    double price = results.getDouble("price");
                    //String sold = results.getString("SOLD");
                    cars.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Get into the habit of doing this one separately.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Vehicle> getTypeRange(String typing) {
        List<Vehicle> cars = new ArrayList<>();
        String query = "SELECT * FROM vehicles WHERE vehicleType LIKE ?";
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

            statement.setString(1, "%" + typing + "%");

            try (ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int vin = results.getInt("VIN");
                    int year = results.getInt("year");
                    String make = results.getString("make");
                    String model = results.getString("model");
                    String vehicleType = results.getString("vehicleType");
                    String color = results.getString("color");
                    int odometer = results.getInt("odometer");
                    double price = results.getDouble("price");
                    //String sold = results.getString("SOLD");
                    cars.add(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Get into the habit of doing this one separately.

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;
    }

    public List<Vehicle> addVehicle(int vinS, int yearS, String makeS, String modelS, double priceS) {
        List<Vehicle> cars = new ArrayList<>();
        String query = "INSERT INTO vehicles (VIN, year, make, model, price) VALUES (?, ?, ?, ?, ?)";
        int generatedId = -1;
        try (
                Connection connection = this.dataSource.getConnection(); // Here is the database connection right here!
                PreparedStatement statement = connection.prepareStatement(query);
        ) {

                    statement.setInt(1, vinS);
                    statement.setInt(2, yearS);
                    statement.setString(3, makeS);
                    statement.setString(4, modelS);
                    statement.setDouble(5, priceS);

                    int rowsAffected = statement.executeUpdate();

            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    generatedId = generatedKeys.getInt(1); // Get the first generated key (ID)
                    System.out.println("Generated Country ID: " + generatedId);
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cars;

    }
}
