package com.onlineplantbooking.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineplantbooking.model.Product;

public class ProductDao {
      public List<Product> showProduct(){
    	  List<Product> productList=new ArrayList<Product>();
    	  
    	  
    	  String showQuery="select *from product_details";
    	  Connection con=ConnectionUtil.getDbConnection();
    	  
    	  try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(showQuery);
			while(rs.next())
			{
				Product product=new Product(rs.getString(1),rs.getString(2),rs.getString(3),Integer.parseInt(rs.getString(4)),rs.getString(5));
				productList.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;
		   	  
    	  
      }
    public static int findProductId(Product product)
    {
		String findUserID="select id from product_details";
		Connection con=ConnectionUtil.getDbConnection();
		Statement stmt;
		int productId=0;
	     	
		    try {
				stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(findUserID);
				if(rs.next())
				{
					productId=rs.getInt(1);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return productId;
			
			
			
		}
		
    	
    }
    
