import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Loa_login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loa_login window = new Loa_login();
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
	public Loa_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 10, 434, 261);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("    Log In");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 30));
		panel_1.add(lblNewLabel_2);
		
		JLabel ID_lbl_2 = new JLabel("ID");
		ID_lbl_2.setHorizontalAlignment(SwingConstants.RIGHT);
		ID_lbl_2.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 16));
		panel_1.add(ID_lbl_2);
		
		JLabel PW_lbl_2 = new JLabel("Password");
		PW_lbl_2.setHorizontalAlignment(SwingConstants.RIGHT);
		PW_lbl_2.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 16));
		panel_1.add(PW_lbl_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		JButton Login_Btn_2 = new JButton("\uB85C\uADF8\uC778");
		Login_Btn_2.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 16));
		panel_1.add(Login_Btn_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 310, 236);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("    Log In");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 30));
		panel.add(lblNewLabel_1);
		
		JLabel ID_lbl_1 = new JLabel("ID");
		ID_lbl_1.setHorizontalAlignment(SwingConstants.RIGHT);
		ID_lbl_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 16));
		panel.add(ID_lbl_1);
		
		JLabel PW_lbl_1 = new JLabel("Password");
		PW_lbl_1.setHorizontalAlignment(SwingConstants.RIGHT);
		PW_lbl_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 16));
		panel.add(PW_lbl_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		JButton Login_Btn_1 = new JButton("\uB85C\uADF8\uC778");
		Login_Btn_1.setFont(new Font("«‘√ ∑“µ∏øÚ", Font.BOLD, 16));
		panel.add(Login_Btn_1);
	}
}
