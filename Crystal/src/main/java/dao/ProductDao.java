package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Product;
import utility.DBConn;

public class ProductDao {
	Connection conn;

	public ProductDao() throws Exception{
		conn = DBConn.getMySQLConnection();
	}
	public Product[] returnProduct() throws SQLException
	{	PreparedStatement psmt;
		psmt = conn.prepareStatement("select count(*) from products");
		ResultSet rs = psmt.executeQuery();
		int nitems = rs.getInt(1);
		Product[] itemArray = new Product[nitems];
		psmt = conn.prepareStatement("select * from products");
		 rs = psmt.executeQuery();
		int i=0;
		while(rs.next()) {
			Product item = new Product();
			item.setPname(rs.getString(2));
			item.setPcompany(rs.getString(3));
			item.setPprice(Double.parseDouble(rs.getString(4)));
			item.setPfilename(rs.getString(5));
			itemArray[i] = item;
			i++;
		}
		
		return itemArray;
	}


}
