package pl.coderslab.utils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class DbUtil {
    private static DataSource dataSource;
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();   }
    private static DataSource getInstance() {
        if (dataSource == null) {
            try {
                Context initContext = new InitialContext();
                Context envContext = (Context)initContext.lookup("java:/comp/env");
                dataSource = (DataSource)envContext.lookup("jdbc/users");
            } catch (NamingException e) { e.printStackTrace(); }
        }
        return dataSource;
    }
//    private static final String DB_URL2 = "jdbc:mysql://localhost:3306/%s?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
//    private static final String DB_USER = "root";
//    private static final String DB_PASS = "coderslab";
//    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";
//
//    public static Connection connect() throws SQLException {
//        return DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
//    }
//    public static Connection connect(String dbName) throws SQLException {
//        String dbUrlCombine = String.format(DB_URL2, dbName);
//        return DriverManager.getConnection(dbUrlCombine, DB_USER, DB_PASS);
//    }
//
//
//    public static void insert(Connection conn, String query, String... params) {
//        try ( PreparedStatement statement = conn.prepareStatement(query)) {
//            for (int i = 0; i < params.length; i++) {
//                statement.setString(i + 1, params[i]);
//            }
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void printData(Connection conn, String query, String... columnNames) throws SQLException {
//
//        try (PreparedStatement statement = conn.prepareStatement(query);
//             ResultSet resultSet = statement.executeQuery();) {
//            while (resultSet.next()) {
//                for (String columnName : columnNames) {
//                    System.out.println(resultSet.getString(columnName));
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public static void remove(Connection conn, String tableName, int id) {
//        try (PreparedStatement statement =
//                     conn.prepareStatement(DELETE_QUERY.replace("tableName", tableName));) {
//            statement.setInt(1, id);
//            statement.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public static void printData2(Connection conn, String query, String... columnNames) throws SQLException {
//
//        try (PreparedStatement statement = conn.prepareStatement(query);
//             ResultSet resultSet = statement.executeQuery();) {
//            while (resultSet.next()) {
//                for (String columnName : columnNames) {
//                    System.out.print(columnName + ": " + resultSet.getString(columnName)+", ");
//                }
//                System.out.println();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
