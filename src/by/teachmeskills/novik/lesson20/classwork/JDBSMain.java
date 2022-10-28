//package by.teachmeskills.novik.lesson20.classwork;
//
//import com.mysql.cj.jdbc.Driver;
//
//import java.sql.*;
//
//public class JDBSMain {
//
//    public static final String URL = "jdbc:mysql://localhost:3306/test_db";
//    public static final String USERNAME = "root";
//    public static final String PASSWORD = " ";
//    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//    public static final String SELECT_ALL_USERS_QUERY = "select * from users";
//
//    public static void main(String[] args) throws ClassNotFoundException {
//        Class.forName(JDBC_DRIVER);//from internet "com.mysql.cj.jdbc.Driver"
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//           //"jdbc:mysql://localhost:3306/test_db" ctrl alt c
//            Statement statement = connection.createStatement(); //helps make a connection with data base
//            ResultSet resultSet=statement.executeQuery(SELECT_ALL_USERS_QUERY);
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt("id")+" "
//                        +resultSet.getString("user_name")+ " "
//                        + resultSet.getInt("age"));
//            }
//            statement.executeUpdate("update users set age = 30 where id>5");
//            resultSet=statement.executeQuery(SELECT_ALL_USERS_QUERY);
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt("id")+" "
//                        +resultSet.getString("user_name")+ " "
//                        + resultSet.getInt("age"));
//            }
//            //CRUD-operations for data base c -create, r-read,u-update,d-delete
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//}
