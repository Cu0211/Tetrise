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
	
	public StartMenu() {
		setTitle("Tetris");
		
		setSize(350, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StartMenu();
	}

}
