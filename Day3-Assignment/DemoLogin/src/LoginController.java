import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginController {
	
	static Registration register = new Registration();
	static final String D_URL="jdbc:mysql://localhost:3306/student";
	static final String USER="root";
	static final String password="pass@word1";
	static final String Query= "select * from user where email=? AND password=? ;";
	
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(D_URL, USER, password);
				Statement stmt=con.createStatement();
				PreparedStatement ps=con.prepareStatement(Query);
				){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your email : ");
			String email = sc.next();
			System.out.println("Enter password : ");
			String password=sc.next();
			
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet result =ps.executeQuery();	
			if(result.next()) {
				System.out.println("Login success");
			}else
				System.out.println("User not found");
			
		}catch(SQLException e) {
			System.out.println(e);}

}
}