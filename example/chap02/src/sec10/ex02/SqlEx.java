package sec10.ex02;

import java.sql.*;

public class SqlEx {
    public static void main(String[] args) {
        try {
            // 데이터베이스 연결
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

            // 잘못된 SQL 문 실행
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM non_existing_table";
            ResultSet resultSet = statement.executeQuery(sql);

            // 결과 처리
            while (resultSet.next()) {
                // 결과 가져오기
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // 연결 종료
            connection.close();
        } catch (SQLException e) {
            // SQLException 처리
            System.out.println("SQLException occurred:");
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("SQL state: " + e.getSQLState());
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

