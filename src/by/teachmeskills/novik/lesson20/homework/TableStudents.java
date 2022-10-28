package by.teachmeskills.novik.lesson20.homework;

import java.sql.*;
import java.util.Scanner;

public class TableStudents {


    public static final String URL = "jdbc:mysql://localhost:3306/test_db1";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String SELECT_ALL_USERS1_QUERY = "select * from users1";
    public static final String SELECT_ALL_USER_CITIES_QUERY = "select * from user_cities";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();) {
            int studentsOrCities;
            print(statement);
            Scanner scanner = new Scanner(System.in);
            Scanner console = new Scanner(System.in);
            studentsOrCities = getStudentsOrCities(scanner);
            while (studentsOrCities < 3) {
                switch (studentsOrCities) {
                    case 1:
                        changeStudentsTable(statement, scanner, console);
                        break;
                    case 2:
                        changeCitiesTable(statement, scanner, console);
                        break;
                }
                print(statement);
                studentsOrCities = getStudentsOrCities(scanner);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static int getStudentsOrCities(Scanner scanner) {
        int studentsOrCities;
        System.out.println("Change the table of students or cities\n1. Table of students\n2.Table of cities\n3.Exit");
        studentsOrCities = scanner.nextInt();
        return studentsOrCities;
    }

    private static void changeCitiesTable(Statement statement, Scanner scanner, Scanner console) throws SQLException {
        System.out.println("Cities:\n1.add\n2.delete\n3.continue");
        int city = scanner.nextInt();
        Scanner s = new Scanner(System.in);
        switch (city) {
            case 1:
                System.out.println("Name");
                String nameC = s.nextLine();
                System.out.println("id of user");
                int courseC = scanner.nextInt();
                statement.execute("insert into user_cities (name,user_id) values ('" + nameC + "'," + courseC + ")");
                break;
            case 2:
                System.out.println("Choose id");
                int delete = console.nextInt();
                statement.execute("delete from user_cities where id=" + delete);
                break;
            case 3:
                break;
        }
    }

    private static void changeStudentsTable(Statement statement, Scanner scanner, Scanner console) throws SQLException {
        System.out.println("add or delete students");
        System.out.println("1.add\n2.delete\n3.continue");

        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Name");
                String name = console.nextLine();
                System.out.println("Course");
                int course = scanner.nextInt();
                statement.execute("insert into users1 (name,course) values ('" + name + "'," + course + ")");
                break;
            case 2:
                System.out.println("Choose id");
                int delete = console.nextInt();
                statement.execute("delete from users1 where id=" + delete);
                break;
            case 3:
                break;
        }
    }

    private static void print(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery(SELECT_ALL_USERS1_QUERY);

        System.out.println("id\tname\tcourse");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t"
                    + resultSet.getString("name") + "\t"
                    + resultSet.getInt("course"));
        }
        resultSet = statement.executeQuery(SELECT_ALL_USER_CITIES_QUERY);
        System.out.println("Cities of students according to the id");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + "\t"
                    + resultSet.getString("name") + "\t"
                    + resultSet.getInt("user_id"));
        }
    }
}


