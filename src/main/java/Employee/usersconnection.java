package Employee;
import java.sql.*;

public class usersconnection {
	private Connection con;
	boolean flag=false;
	public usersconnection(Connection con) {
		super();
		this.con = con;
	}
	
	public void saveUsers(users user) {
		try {
			String query = "insert into users(name,mail,contact,bdate,gender,password) values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getMail());
			ps.setString(3, user.getContact());
			ps.setString(4, user.getBdate());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getPassword());
			
			ps.executeUpdate();
			flag=true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	public users getLoginData(String mail,String password) {
		users u =null;
		try {
			String query2 = "select * from users where mail=? and password=?";
			PreparedStatement ps2 = con.prepareStatement(query2);
			ps2.setString(1, mail);
			ps2.setString(2, password);
			ResultSet rs = ps2.executeQuery();
			if(rs.next()) {
				u = new users();
				u.setName(rs.getString("name"));
				u.setMail(rs.getString("mail"));
				u.setContact(rs.getString("contact"));
				u.setBdate(rs.getString("bdate"));
				u.setGender(rs.getString("gender"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}
}