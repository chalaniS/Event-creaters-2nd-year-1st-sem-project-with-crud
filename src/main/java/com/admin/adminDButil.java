package com.admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class adminDButil {
	
		public static boolean createEvent( String ename, String edate, String etype, String elocation, String etime) {
		
		boolean isSuccess = false; 
		
				//create database connection
				String url ="jdbc:mysql://localhost:3306/adminevent";
				String user = "root";
				String pass = "2021";				
				
				try {
					System.out.print("bd ekat awa");
					Class.forName("com.mysql.jdbc.Driver");			
				    Connection con = DriverManager.getConnection(url, user, pass);		    
				    Statement stmt = con.createStatement();		    
				    String sql = "INSERT INTO event values (0 , '"+ ename +"', '"+ edate + "', '"+ etype + "','"+ elocation + "','" + etime + "' )";
				    int rs = stmt.executeUpdate(sql);	
				    
				    if(rs > 0) {
				    	isSuccess = true;
				    }   				       				    
				}		
				catch (Exception e) {
					e.printStackTrace();
				}
		
		
		
		return isSuccess;
	}	
		
		
		
		public static List<event> getevent(String type) {
			
			ArrayList<event> event = new ArrayList<>();
			
			try {
				
				//create database connection
				String url ="jdbc:mysql://localhost:3306/adminevent";
				String user = "root";
				String pass = "2021";
								
				Class.forName("com.mysql.jdbc.Driver");			
			    Connection con = DriverManager.getConnection(url, user, pass);		    
			    Statement stmt = con.createStatement();	
			    
			    System.out.println("database connect una");
				
				String sql = "select * from event where e_type='"+type+"'";
				ResultSet rs = stmt.executeQuery(sql);
				
				System.out.println("query eka run una");
				
				while (rs.next()) {
					
					int eid = rs.getInt(1);
					String ename = rs.getString(2);
					String edate = rs.getString(3);
					String etype = rs.getString(4);
					String elocation = rs.getString(5);
					String etime = rs.getString(6);
					
					event eve = new event( eid, ename, edate, etype, elocation, etime);
					event.add(eve);
					System.out.println("read wengmn");
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return event;	
		}
		
		public static boolean deleteEvent(String eid) {
			
			
			
			int evid = Integer.parseInt(eid);
			
			boolean isSuccess = false;  
			
					//create database connection
					String url ="jdbc:mysql://localhost:3306/adminevent";
					String user = "root";
					String pass = "2021";				
					
					try {
						System.out.print("bd ekat awa");
						Class.forName("com.mysql.jdbc.Driver");			
					    Connection con = DriverManager.getConnection(url, user, pass);		    
					    Statement stmt = con.createStatement();		    
					    String sql = "DELETE FROM event WHERE e_id = " + evid + " )";
					    int rs = stmt.executeUpdate(sql);	
					    
					    if(rs > 0) {
					    	isSuccess = true;
					    }   				       				    
					}		
					catch (Exception e) {
						e.printStackTrace();
					}
			
			
			
			return isSuccess;
		}
	

}
