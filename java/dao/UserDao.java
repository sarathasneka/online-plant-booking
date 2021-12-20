package com.onlineplantbooking.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.onlineplantbooking.model.User;


public class UserDao {
	public void insertUser(User user) {
		String insertQuery ="insert into user_details(name,email_id,password,mobileno,address) values(?,?,?,?,?)";
	    
		ConnectionUtil conUtil = new ConnectionUtil();
		Connection con = conUtil.getDbConnection();
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(insertQuery);
			pst.setString(1, user.getName());
			pst.setString(2, user.getEmail_id());
			pst.setString(3, user.getPassword());
			pst.setLong(4,user.getMobileno());
			pst.setString(5,user.getAddress());
			int rows =pst.executeUpdate();
			if(rows>0) {
				System.out.println("Value inserted Succes");
			}
			
		} catch (SQLException e) {
			
            e.getMessage();
			e.printStackTrace();
			System.out.println("Value not inserted in the table");
		}
		
	}
	
	public static User validateUser(String email_id,String password)
	{
		String validateQuery="select * from user_details where email_id='"+email_id +"'and password='"+password+"'";
		Connection con=ConnectionUtil.getDbConnection();
		User user=null;
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(validateQuery);
			if(rs.next())
			{
				user=new User(rs.getString(2),email_id,password,Long.parseLong(rs.getString(5)),rs.getString(6));
			}
			else {
				System.out.println("not a valid user");
			}
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			System.out.println("Statement error");
		} 
		return user;
	}
	
public void update(String update) throws SQLException{ 

	String updateQuery="update user_details set password=? where user_id=?";
	Connection con=ConnectionUtil.getDbConnection();
	System.out.println("Connection suceessfully");
	
	
	PreparedStatement pstmt=con.prepareStatement(updateQuery);
	pstmt.setString(1,update.split(",")[0]);
	pstmt.setInt(2,Integer.parseInt(update.split(",")[1]));
	int i=pstmt.executeUpdate();
	System.out.println(i+"row updated");
	pstmt.close();
	con.close();
}
public void deleteUser(String delete) throws SQLException  {
	String deleteQuery="delete from user_details where user_id=?";
	Connection con=ConnectionUtil.getDbConnection();
	System.out.println("Connection successfully");
	
	PreparedStatement pstmt=con.prepareStatement(deleteQuery);
	pstmt.setInt(1,Integer.parseInt(delete));
	int i=pstmt.executeUpdate();
	System.out.println(i+"row deleted");
	pstmt.close();
	con.close();
		
		
	} 

	
	
	



 

}

