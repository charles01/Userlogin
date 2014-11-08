package userlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class UserLogin{
	private String username,password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String execute(){
		try{
			final String classname ="com.mysql.jdbc.Driver"; 
			final String url="jdbc:mysql://localhost:3306/employee";
			final String uname="root";
			final String passwd="root";
			final String query="select * from empdetail";
		
			Class.forName(classname);
			Connection conn=DriverManager.getConnection(url,uname,passwd);
	    		Statement s=conn.createStatement();
			ResultSet rs=s.executeQuery(query);
	    			while(rs.next() {
	    				String user=rs.getString(1);
	    				String pwd=rs.getString(2);
	    					{
	    						if(username.equals(user)&&password.equals(pwd))
	    						{
	    							return "success";
	    						}
	    					}
		}
	    conn.close();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "error";
	}
}
