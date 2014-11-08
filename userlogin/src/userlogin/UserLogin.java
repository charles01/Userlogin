package userlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class UserLogin extends ActionSupport{
	
	private static final long serialVersionUID=6677091252031583948L;

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
	
	public String execute()
	{
		try
		{
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
	    Statement s=conn.createStatement();
		String query="select * from empdetail";
		ResultSet rs=s.executeQuery(query);
	    while(rs.next())
	    {
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