import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JTextField txtPass;

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setBackground(new Color(0, 255, 255));
		setResizable(false);
		setTitle("ĐĂNG NHẬP HỆ THỐNG QUẢN LÝ BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 51, 181, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU:");
		lblMtKhu.setForeground(new Color(0, 255, 255));
		lblMtKhu.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		lblMtKhu.setBounds(30, 108, 181, 33);
		contentPane.add(lblMtKhu);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("JetBrains Mono NL Medium", Font.PLAIN, 20));
		txtLogin.setBounds(221, 52, 163, 30);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("JetBrains Mono NL Medium", Font.PLAIN, 20));
		txtPass.setColumns(10);
		txtPass.setBounds(221, 109, 163, 30);
		contentPane.add(txtPass);
		
		JButton btnLogin = new JButton("ĐĂNG NHẬP");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Xử lý đăng nhập
				XuLyDangNhap();
			}
		});
		btnLogin.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		btnLogin.setBounds(133, 176, 168, 49);
		contentPane.add(btnLogin);
	}
	//Hàm xử lý
	void XuLyDangNhap() {
		String strTen = txtLogin.getText();
		String strPass = txtPass.getText();
		if(strTen.equals("63CNTT") && strPass.equals("123")) {
			//Hiển thị trang chủ
			HomeFrame home = new HomeFrame();
			home.setVisible(true);
			home.setLocation(538,272);
			//ẩn form đăng nhập;
			this.setVisible(false);
		}else {
			//báo lỗi
			//Xóa khi lỗi
			txtLogin.setText("");
			txtPass.setText("");
			//Hiển thị thông báo
			JOptionPane hopthoai = new JOptionPane();
			hopthoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
		
	}
}
