import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtKQ;

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setResizable(false);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setForeground(new Color(255, 255, 255));
		setFont(new Font("JetBrains Mono ExtraBold", Font.BOLD, 15));
		setBackground(new Color(0, 0, 0));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel a = new JLabel("Nhập số thứ nhất (a):");
		a.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 20));
		a.setBounds(37, 38, 252, 34);
		contentPane.add(a);
		
		JLabel b = new JLabel("Nhập số thứ nhất (b):");
		b.setFont(new Font("JetBrains Mono ExtraBold", Font.PLAIN, 20));
		b.setBounds(37, 89, 252, 34);
		contentPane.add(b);
		
		txta = new JTextField();
		txta.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		txta.setHorizontalAlignment(SwingConstants.LEFT);
		txta.setBounds(299, 38, 299, 34);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setHorizontalAlignment(SwingConstants.LEFT);
		txtb.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		txtb.setColumns(10);
		txtb.setBounds(299, 89, 299, 34);
		contentPane.add(txtb);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			//Xử lý cộng
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 25));
		btnCong.setBounds(37, 218, 120, 60);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			//Xử lý trừ
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 25));
		btnTru.setBounds(199, 218, 120, 60);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			//Xử lý nhân
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 25));
		btnNhan.setBounds(361, 218, 120, 60);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			//Xử lý chia
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 25));
		btnChia.setBounds(523, 218, 120, 60);
		contentPane.add(btnChia);
		
		JLabel lblNewLabel = new JLabel("KẾT QUẢ:");
		lblNewLabel.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(184, 148, 105, 34);
		contentPane.add(lblNewLabel);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setHorizontalAlignment(SwingConstants.LEFT);
		txtKQ.setFont(new Font("JetBrains Mono Medium", Font.PLAIN, 20));
		txtKQ.setColumns(10);
		txtKQ.setBounds(299, 148, 299, 34);
		contentPane.add(txtKQ);
	
	}
	
	//Viết hàm
	void HamXuLyCong() {
		//Lấy dữ liệu tự điều khiển
		String str_A = txta.getText();
		String str_B = txtb.getText();
		//Chuyển kiểu dữ liệu
		Double soA = Double.parseDouble(str_A);
		Double soB = Double.parseDouble(str_B);
		//tinhtoan
		Double tong = soA + soB;
		//hiển thị kết quả
		txtKQ.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lấy dữ liệu tự điều khiển
		String str_A = txta.getText();
		String str_B = txtb.getText();
		//Chuyển kiểu dữ liệu
		Double soA = Double.parseDouble(str_A);
		Double soB = Double.parseDouble(str_B);
		//tinhtoan
		Double tong = soA - soB;
		//hiển thị kết quả
		txtKQ.setText(String.valueOf(tong));
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu tự điều khiển
		String str_A = txta.getText();
		String str_B = txtb.getText();
		//Chuyển kiểu dữ liệu
		Double soA = Double.parseDouble(str_A);
		Double soB = Double.parseDouble(str_B);
		//tinhtoan
		Double tong = soA * soB;
		//hiển thị kết quả
		txtKQ.setText(String.valueOf(tong));
	}
	void HamXuLyChia() {
		//Lấy dữ liệu tự điều khiển
		String str_A = txta.getText();
		String str_B = txtb.getText();
		//Chuyển kiểu dữ liệu
		Double soA = Double.parseDouble(str_A);
		Double soB = Double.parseDouble(str_B);
		//tinhtoan
		Double tong = soA / soB;
		//hiển thị kết quả
		txtKQ.setText(String.valueOf(tong));
	}
}
