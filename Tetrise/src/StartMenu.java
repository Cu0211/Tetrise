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

	static String user_grade = MainWindow.userGrade;
	static String user_class = (MainWindow.userClass.length() < 2) ? "0" + MainWindow.userClass : MainWindow.userClass;
	static String user_number = (MainWindow.userNumber.length() < 2) ? "0" + MainWindow.userNumber : MainWindow.userNumber;
	static String user_name = MainWindow.userName;
	
	String save_user_id = null;
	String save_user_name = null;
	
	public StartMenu() {
		setTitle("Tetris");
		
		setSize(350, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		save_user_id = user_grade + user_class + user_number;
		save_user_name = user_name;
		System.out.println(save_user_id);
		System.out.println(save_user_name);
		
		JLabel userId = new JLabel(save_user_id);
		userId.setBounds(220, 0, 200, 50);
		getContentPane().add(userId);
		
		JLabel userName = new JLabel(save_user_name);
		userName.setBounds(270, 0, 200, 50);
		getContentPane().add(userName);

		JButton fiftyLine = new JButton("50Line");
		fiftyLine.setBounds(65, 150, 200, 50);
		getContentPane().add(fiftyLine);
		
		fiftyLine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new fiftyLines();
				
				setVisible(false);
			}
		});
		
		JButton logOut = new JButton("·Î±×¾Æ¿ô");
		logOut.setBounds(65, 300, 200, 50);
		getContentPane().add(logOut);
		
		logOut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				setVisible(false);
				
			}
		});
		
		setVisible(true);
	}
	
		
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//new StartMenu();
				
	}

}
