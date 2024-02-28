import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ScreenGame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public ScreenGame() {
		setResizable(false);
		setTitle("TIC TAC TOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(-6, -21, 402, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GAME TIC TAC TOE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(10, 32, 360, 29);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Lucida Calligraphy", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(4, 50, 216, 211);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(3,3));
		
		JButton btnNewButton = new JButton("");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("");
		panel_1.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("");
		panel_1.add(btnNewButton_5_2);
		
		JButton btnNewButton_1 = new JButton("");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_6 = new JButton("");
		panel_1.add(btnNewButton_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(219, 50, 162, 211);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("New Game");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(38, 89, 95, 37);
		panel_2.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setBounds(47, 25, 65, 28);
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 20));
		panel_2.add(lblNewLabel_1);
	}
}
