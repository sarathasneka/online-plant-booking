package register;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class Registerdao {
	public void insert(Register reg) {
		String insertquery="insert into register values(?,?,?)";
		ConnectionUtil couUtil=new ConnectionUtil();
		Connection con=ConnectionUtil.getDBConnect();
		System.out.println("connection get successfully");
		try {
			 PreparedStatement pstmt=con.prepareStatement(insertquery);
			 pstmt.setString(1,reg.getReg_name());
			 pstmt.setString(2,reg.getReg_mail());
			 pstmt.setString(3,reg.getReg_password());
			  
			 int i=pstmt.executeUpdate();
			 System.out.println(i+"row inserted successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
