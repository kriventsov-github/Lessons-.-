package com.homework.example;
import java.sql.*;
public class StatementTest {
    private static String URL = "jdbc:mysql://localhost:3306/testdb?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static  String USER = "root";
    private static String PASSWORD = "root";
    public static void main (String [] args){
          /*
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver(); //это путь в загруженной библиотеке jar ч-з mvn dep
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Unable to load driver class.");
            e.printStackTrace();
        }

           */


       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e){
           System.out.println("Не удалось загрузить драйвер");
       }
       try (Connection conn = DriverManager.getConnection(URL,USER,PASSWORD); Statement statement = conn.createStatement()){
           System.out.println(conn.isClosed());

          // statement.execute("INSERT INTO heroes (name, realname) VALUES ('Капитан Америка', 'Стив Роджерс')");
          // int res =   statement.executeUpdate("UPDATE heroes set Name='Златовласка' where id=4;");
           // ResultSet res =   statement.executeQuery("SELECT * FROM heroes"); только селект, выводит чушь
           //statement.addBatch("INSERT INTO heroes (name, realname) VALUES ('герой 1', 'имя 1')");
           //statement.addBatch("INSERT INTO heroes (name, realname) VALUES ('герой 2', 'имя 2')");
           //statement.addBatch("INSERT INTO heroes (name, realname) VALUES ('герой 3', 'имя 3')");
           //statement.addBatch("INSERT INTO heroes (name, realname) VALUES ('герой 4', 'имя 4')");
           //statement.executeBatch(); чем этот способ отличается от обычн. Execute, когда исп?
           //зачем нужен statement.getConnection() и statement.close()?
           
       } catch (SQLException e){
           e.printStackTrace();
       }

    }
}
