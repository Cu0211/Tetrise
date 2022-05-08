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

public class MainWindow extends JFrame{
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
		
	String userGrade = null;
	String userClass = null;
	String userNumber = null;
	String userName = null;
	String rst  = null;
	
	public MainWindow(){
		setTitle("Tetris");
		setSize(350, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
				
		//�г� ��
		JLabel lbUserGrade = new JLabel();
		lbUserGrade.setBounds(40, 100, 100, 50);
		lbUserGrade.setText("�г�");
		getContentPane().add(lbUserGrade);
		
		//�� ��
		JLabel lbUserClass = new JLabel();
		lbUserClass.setBounds(50, 150, 100, 50);		
		lbUserClass.setText("��");
		getContentPane().add(lbUserClass);
		
		//��ȣ ��
		JLabel lbUserNumber = new JLabel();
		lbUserNumber.setBounds(40, 200, 100, 50);		
		lbUserNumber.setText("��ȣ");
		getContentPane().add(lbUserNumber);
		
		//�̸� ��
		JLabel lbUserName = new JLabel();
		lbUserName.setBounds(40, 250, 100, 50);		
		lbUserName.setText("�̸�");
		getContentPane().add(lbUserName);
		
		//�г� input�ڽ�
		JTextField edUserGrade = new JTextField(10);
		edUserGrade.setBounds(90, 115, 200, 25);
		getContentPane().add(edUserGrade);
		
		//�� input�ڽ�
		JTextField edUserClass = new JTextField(10);		
		edUserClass.setBounds(90, 165, 200, 25);
		getContentPane().add(edUserClass);
		
		//��ȣ input�ڽ�
		JTextField edUserNumber = new JTextField(10);
		edUserNumber.setBounds(90, 215, 200, 25);
		getContentPane().add(edUserNumber);
		
		//�̸� input�ڽ�
		JTextField edUserName = new JTextField(10);		
		edUserName.setBounds(90, 265, 200, 25);
		getContentPane().add(edUserName);
		
		//�α��� ��ư
		JButton btLogin = new JButton("�α���");
		btLogin.setBounds(70, 310, 200, 50);
		getContentPane().add(btLogin);
		
		btLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				userGrade = edUserGrade.getText();
				userClass = edUserClass.getText();
				userNumber = edUserNumber.getText();
				userName = edUserName.getText();
				
				
				try {
					rst = login(userGrade, userClass, userNumber, userName);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				new StartMenu();
				setVisible(false);
			}
		});
		
		setVisible(true);
	}
	
	protected String login(String userGrade, String userClass, String userNumber, String userName) throws SQLException {
		// TODO Auto-generated method stub
		rs = stmt.executeQuery("exec member_sign_in @user_grade=N'" + userGrade + "', @user_class=N'" + userClass + "', @user_number=N'" + userNumber + "', @user_name='" + userName + "'");
		rs.next();
		String result = rs.getString("result");
				
		return result;
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl="jdbc:sqlserver://localhost:14033;database=Tetrise;user=smlee;password=cowgolem02*;encrypt=true;trustServerCertificate=true";
			
			conn = DriverManager.getConnection(connectionUrl);
			stmt = conn.createStatement();
			System.out.println("MS-SQL���� ���ῡ ����");
			
			new MainWindow();
						
			
		}
		catch(SQLException sqle) {
			System.out.println("SQLException : " + sqle);
		}
		
	}
		

}
