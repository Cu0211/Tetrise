import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.sql.*;
import java.sql.SQLException;

public class MainWindow extends JFrame {
	
	static Connection conn = null;
	static Statement stmtt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm = new JFrame();
		
		frm.setTitle("Tetrise");
		frm.setSize(350, 600);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(null);
				
		JLabel lbUserId = new JLabel();
		lbUserId.setBounds(40, 200, 100, 50);
		lbUserId.setText("아이디");
		frm.getContentPane().add(lbUserId);
		
		JLabel lbUserPw = new JLabel();
		lbUserPw.setBounds(30, 250, 100, 50);		
		lbUserPw.setText("비밀번호");
		frm.getContentPane().add(lbUserPw);
		
		JTextField edUserId = new JTextField(10);
		edUserId.setBounds(90, 215, 200, 25);
		frm.getContentPane().add(edUserId);
		
		JTextField edUserPw = new JTextField(10);		
		edUserPw.setBounds(90, 265, 200, 25);
		frm.getContentPane().add(edUserPw);
		
		JButton btLogin = new JButton("로그인");
		btLogin.setBounds(70, 310, 200, 50);
		frm.getContentPane().add(btLogin);
		
		frm.setVisible(true);
	}

}
