import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StartMenu extends JFrame{
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	String user_id = null;
	String user_name = null;
	
	public StartMenu() {
		setTitle("Tetris");
		
		setSize(350, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		System.out.println(MainWindow.userGrade);
		System.out.println(MainWindow.userClass);
		System.out.println(MainWindow.userNumber);
		
		JLabel userName = new JLabel(MainWindow.userName);
		userName.setBounds(270, 0, 200, 50);
		getContentPane().add(userName);
		
		setVisible(true);
	}
	
	//public void getUserInfo() {
		//rs = stmt.executeQuery("exec member_sign_in @user_grade=N'" + userGrade + "', @user_class=N'" + userClass + "', @user_number=N'" + userNumber + "', @user_name='" + userName + "'");
		//rs.next();
		
		//user_id = rs.getString("user_id");
		//user_id = rs.getString("user_name");
		
				
	//}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		new StartMenu();
				
	}

}
