import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegistrationController {
	
 static Registration register =new Registration();
	
		static final String D_URL="jdbc:mysql://localhost:3306/student";
		static final String USER="root";
		static final String password="pass@word1";
		static final String Query= "insert into user (email,first_name,password) values(?,?,?);";
		public static void main(String[] args) {
			try(Connection con=DriverManager.getConnection(D_URL, USER, password);
					Statement stmt=con.createStatement();
					PreparedStatement ps=con.prepareStatement(Query);){
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your email : ");
				String email = sc.next();
				System.out.println("Enter first name : ");
				String fname=sc.next();
				System.out.println("Enter password : ");
				String password=sc.next();
				
				
				ps.setString(1, email);
				ps.setString(2, fname);
				ps.setString(3, password);
		
				int result =ps.executeUpdate();	
				
				if(result==0)
					System.out.println("Already exists");
				else 
					System.out.println("Registered successfully");
				
			}catch(SQLException e) {
				
			}


	}

}
