import java.awt.EventQueue;
import java.awt.*;
import java.net.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Loa {

	private JFrame frame;
	private JTextField Log_ID_text;
	private JTextField Log_PW_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loa window = new Loa();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("로스트아크 도우미");
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// 로그인 화면
		JPanel Login = new JPanel();
		Login.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(Login);
		Login.setLayout(null);
		Login.setVisible(false);

		JLabel lblNewLabel_2 = new JLabel("    Log In");
		lblNewLabel_2.setBounds(0, 0, 444, 75);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("함초롬돋움", Font.BOLD, 30));
		Login.add(lblNewLabel_2);

		JLabel ID_lbl_2 = new JLabel("ID");
		ID_lbl_2.setBounds(82, 103, 33, 22);
		ID_lbl_2.setHorizontalAlignment(SwingConstants.RIGHT);
		ID_lbl_2.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		Login.add(ID_lbl_2);

		JLabel PW_lbl_2 = new JLabel("Password");
		PW_lbl_2.setBounds(64, 147, 73, 22);
		PW_lbl_2.setHorizontalAlignment(SwingConstants.RIGHT);
		PW_lbl_2.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		Login.add(PW_lbl_2);

		// 아이디 입력창
		Log_ID_text = new JTextField();
		Log_ID_text.setBounds(165, 103, 116, 21);
		Log_ID_text.setColumns(10);
		Login.add(Log_ID_text);

		// 패스워드 입력창
		JPasswordField Log_PW_text = new JPasswordField(10);
		Log_PW_text.setBounds(165, 147, 116, 21);
		Log_PW_text.setColumns(10);
		Login.add(Log_PW_text);

		// 메인화면
		JPanel Main = new JPanel();
		Main.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(Main);
		Main.setLayout(null);

		JLabel Logo_1 = new JLabel("\uB85C\uC2A4\uD2B8\uC544\uD06C \uB3C4\uC6B0\uBBF8");
		Logo_1.setBounds(34, 5, 366, 60);
		Logo_1.setHorizontalAlignment(SwingConstants.CENTER);
		Logo_1.setForeground(Color.BLACK);
		Logo_1.setFont(new Font("함초롬돋움", Font.BOLD, 45));
		Main.add(Logo_1);

		JButton M_Login_Btn_1 = new JButton("\uB85C\uADF8\uC778");
		M_Login_Btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.setVisible(true);
				Main.setVisible(false);
			}
		});
		M_Login_Btn_1.setBounds(285, 92, 115, 102);
		M_Login_Btn_1.setFont(new Font("함초롬돋움", Font.BOLD, 25));
		Main.add(M_Login_Btn_1);

		JButton M_Charac_Btn_1 = new JButton("\uCE90\uB9AD\uD130 \uAC80\uC0C9");
		M_Charac_Btn_1.setBounds(34, 117, 115, 23);
		M_Charac_Btn_1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		Main.add(M_Charac_Btn_1);

		JButton M_Ac_Btn_1 = new JButton("\uACBD\uB9E4\uC7A5 \uAC80\uC0C9");
		M_Ac_Btn_1.setBounds(34, 171, 115, 23);
		M_Ac_Btn_1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		Main.add(M_Ac_Btn_1);

		JButton M_EC_Btn_1 = new JButton("\uAC01\uC778 \uACC4\uC0B0\uAE30");
		M_EC_Btn_1.setBounds(34, 146, 115, 23);
		M_EC_Btn_1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		Main.add(M_EC_Btn_1);

		// 업데이트 게시판 이동 창
		JPanel Screen_UpdateBoard = new JPanel();
		Screen_UpdateBoard.setBounds(0, 0, 444, 271);
		frame.getContentPane().add(Screen_UpdateBoard);
		Screen_UpdateBoard.setLayout(null);
		Screen_UpdateBoard.setVisible(false);

		JLabel UB_JLabel = new JLabel("\uB85C\uC2A4\uD2B8\uC544\uD06C \uAC8C\uC2DC\uD310 \uC774\uB3D9");
		UB_JLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UB_JLabel.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		UB_JLabel.setBounds(95, 35, 243, 33);
		Screen_UpdateBoard.add(UB_JLabel);

		JButton View_Board_Btn = new JButton("\uC774\uB3D9\uD558\uAE30");
		View_Board_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String urllink = "https://lostark.game.onstove.com/News/Notice/List";

				try {
					Desktop.getDesktop().browse(new URI(urllink));
				} catch (IOException exception) {
					exception.printStackTrace();
				} catch (URISyntaxException exception) {
					exception.printStackTrace();
				}
			}
		});
		View_Board_Btn.setBounds(74, 104, 111, 63);
		Screen_UpdateBoard.add(View_Board_Btn);

		JButton Go_Main_Btn = new JButton("\uBA54\uC778\uD654\uBA74");
		Go_Main_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Screen_UpdateBoard.setVisible(false);
				Main.setVisible(true);
			}
		});
		Go_Main_Btn.setBounds(248, 104, 111, 63);
		Screen_UpdateBoard.add(Go_Main_Btn);

		// 메인 돌아가기 버튼
		JButton M_UB_Btn_1 = new JButton("\uAC8C\uC2DC\uD310 \uC774\uB3D9");
		M_UB_Btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.setVisible(false);
				Screen_UpdateBoard.setVisible(true);

			}
		});
		M_UB_Btn_1.setBounds(34, 92, 115, 23);
		M_UB_Btn_1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		Main.add(M_UB_Btn_1);

		// 로그인 버튼
		JButton Login_Btn_2 = new JButton("\uB85C\uADF8\uC778");
		Login_Btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;

				String url = "jdbc:mysql://orion.mokpo.ac.kr:8306/test";
				String user = "root";
				String password = "ScE1234**";

				String id = Log_ID_text.getText();
				String passwd = Log_PW_text.getText();

				ResultSet rs = null;
				PreparedStatement pstmt = null;

				try {
					Class.forName("com.mysql.jdbc.Driver");
					conn = DriverManager.getConnection(url, user, password);

					String sql = "select * from memberdb where loginID = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, id);
					rs = pstmt.executeQuery();
					rs.next();
					String pw = rs.getString("passwd");
					String cid = rs.getString("loginID");
					if (pw.equals(passwd) && id.equals(cid)) {
						JOptionPane.showMessageDialog(null, "로그인 성공");
						Login.setVisible(false);
						Main.setVisible(true);
						M_Login_Btn_1.setVisible(false);
					} else if (!pw.equals(passwd) && id.equals(cid)) {
						JOptionPane.showMessageDialog(null, "비밀번호 오류");
					}

				} catch (SQLException ex) {
					JOptionPane.showMessageDialog(null, "아이디 오류");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					if (rs != null)
						try {
							rs.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					if (pstmt != null)
						try {
							pstmt.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					if (conn != null)
						try {
							conn.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				}

			}
		});
		Login_Btn_2.setBounds(308, 85, 94, 108);
		Login_Btn_2.setFont(new Font("함초롬돋움", Font.BOLD, 16));
		Login.add(Login_Btn_2);
	}
}
