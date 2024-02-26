import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PT2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnTinh;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JLabel lblNewLabel;
	private JLabel txtKqX1;
	private JLabel txtKqX2;
	private JLabel lblX;
	private JLabel lblX_2;

	/**
	 * Create the frame.
	 */
	public PT2() {
		setTitle("TÍNH PHƯƠNG TRÌNH BẬC 2");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnTinh = new JButton("TÍNH");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Hàm tính pt2
				 XuLyPT2();
			}
		});
		btnTinh.setBackground(new Color(0, 255, 0));
		btnTinh.setFont(new Font("JetBrains Mono NL Medium", Font.BOLD, 20));
		btnTinh.setBounds(144, 126, 115, 45);
		contentPane.add(btnTinh);
		
		txta = new JTextField();
		txta.setHorizontalAlignment(SwingConstants.CENTER);
		txta.setFont(new Font("JetBrains Mono NL Medium", Font.PLAIN, 20));
		txta.setBounds(38, 53, 62, 33);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setHorizontalAlignment(SwingConstants.CENTER);
		txtb.setFont(new Font("JetBrains Mono NL Medium", Font.PLAIN, 20));
		txtb.setColumns(10);
		txtb.setBounds(170, 53, 62, 33);
		contentPane.add(txtb);
		
		txtc = new JTextField();
		txtc.setHorizontalAlignment(SwingConstants.CENTER);
		txtc.setFont(new Font("JetBrains Mono NL Medium", Font.PLAIN, 20));
		txtc.setColumns(10);
		txtc.setBounds(303, 53, 62, 33);
		contentPane.add(txtc);
		
		lblNewLabel = new JLabel("KẾT QUẢ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("JetBrains Mono NL Medium", Font.BOLD, 20));
		lblNewLabel.setBounds(144, 182, 115, 45);
		contentPane.add(lblNewLabel);
		
		txtKqX1 = new JLabel("");
		txtKqX1.setHorizontalAlignment(SwingConstants.CENTER);
		txtKqX1.setForeground(Color.RED);
		txtKqX1.setFont(new Font("JetBrains Mono NL Medium", Font.PLAIN, 20));
		txtKqX1.setBounds(24, 223, 370, 33);
		contentPane.add(txtKqX1);
		
		txtKqX2 = new JLabel("");
		txtKqX2.setHorizontalAlignment(SwingConstants.CENTER);
		txtKqX2.setForeground(Color.RED);
		txtKqX2.setFont(new Font("JetBrains Mono NL Medium", Font.PLAIN, 20));
		txtKqX2.setBounds(24, 258, 370, 33);
		contentPane.add(txtKqX2);
		
		lblX = new JLabel("X^2");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("JetBrains Mono NL Medium", Font.BOLD, 15));
		lblX.setBounds(98, 53, 62, 33);
		contentPane.add(lblX);
		
		lblX_2 = new JLabel("X");
		lblX_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_2.setForeground(Color.RED);
		lblX_2.setFont(new Font("JetBrains Mono NL Medium", Font.BOLD, 15));
		lblX_2.setBounds(231, 53, 62, 33);
		contentPane.add(lblX_2);
	}
	void XuLyPT2() {
		String stra = txta.getText();
		String strb = txtb.getText();
		String strc = txtc.getText();
		
		Double a = Double.parseDouble(stra);
		Double b = Double.parseDouble(strb);
		Double c = Double.parseDouble(strc);
		
		Double x1,x2;
		Double delta = b*b - 4*a*c;
		
		if(delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			txtKqX1.setText("x1 = "+String.valueOf(x1));
			txtKqX2.setText("x2 = "+String.valueOf(x2));
		}else if(delta == 0){
			x1 = -b / (2 * a);
			txtKqX1.setText("x = "+String.valueOf(x1));
			txtKqX2.setText("");
		}else {
			txtKqX1.setText("Phương trình không có nghiệm");
			txtKqX2.setText("");
		}
	}
}
