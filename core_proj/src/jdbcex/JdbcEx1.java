package jdbcex;
import java.sql.*;
public class JdbcEx1 {
	
	public static void main(String[]args) throws ClassNotFoundException,SQLException {
		Connection conn=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		//System.out.println("connection");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from dept");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}
	}
}
