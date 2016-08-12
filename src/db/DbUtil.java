package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	/*
	 * 数据库用户名以及密码 
	 */
	private String URL="jdbc:mysql://127.0.0.1:3306/examplel";
	private String USER="root";
	private String PASSWORD="228327";

	public  Connection getConnection(){

		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动失败");
		}		
		try {
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			System.out.println("取得链接失败");
		}
		return conn;
	}

	public void closeConnection(Connection conn){
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("数据库关闭连接失败");
			} 
	}
}
