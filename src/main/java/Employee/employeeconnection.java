package Employee;
import java.sql.*;

public class employeeconnection {
	private Connection con;
	boolean flag=false;
	public employeeconnection(Connection con) {
		super();
		this.con = con;
	}
	
	public void saveEmployees(employee employee) {
		try {
			String query = "insert into employee(name,email,contact,bdate,gender,qualification,address) values(?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getContact());
			ps.setString(4, employee.getBdate());
			ps.setString(5, employee.getGender());
			ps.setString(6, employee.getQualification());
			ps.setString(7, employee.getAddress());
			
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}


	public void deleteEmployee(int eId) {
		try {
			String query = "delete from employee where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, eId);
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public employee getID(int eid) {
		employee emp =null;
		try {
			String query = "select * from employee where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, eid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				emp = new employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setContact(rs.getString("contact"));
				emp.setBdate(rs.getString("bdate"));
				emp.setGender(rs.getString("gender"));
				emp.setQualification(rs.getString("qualification"));
				emp.setAddress(rs.getString("address"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public void updateEmployees(employee employee) {
		try {
			String query = "update employee set name=?,email=?,contact=?,bdate=?,gender=?,qualification=?,address=? where id=?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getContact());
			ps.setString(4, employee.getBdate());
			ps.setString(5, employee.getGender());
			ps.setString(6, employee.getQualification());
			ps.setString(7, employee.getAddress());
			ps.setInt(8, employee.getId());
			
			ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}