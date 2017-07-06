package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;

public class Lotto extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lotto frame = new Lotto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Lotto() {
		setTitle("Lotto");
		setResizable(false);
		
		initComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLiczba6 = new JLabel("0");
		lblLiczba6.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba6.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba6.setBounds(828, 23, 150, 150);
		contentPane.add(lblLiczba6);
		
		JLabel lblLiczba5 = new JLabel("0");
		lblLiczba5.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba5.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba5.setBounds(665, 23, 150, 150);
		contentPane.add(lblLiczba5);
		
		JLabel lblLiczba4 = new JLabel("0");
		lblLiczba4.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba4.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba4.setBounds(502, 23, 150, 150);
		contentPane.add(lblLiczba4);
		
		JLabel lblLiczba3 = new JLabel("0");
		lblLiczba3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba3.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba3.setBounds(339, 23, 150, 150);
		contentPane.add(lblLiczba3);
		
		JLabel lblLiczba2 = new JLabel("0");
		lblLiczba2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba2.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba2.setBounds(176, 23, 150, 150);
		contentPane.add(lblLiczba2);
		
		JLabel lblLiczba1 = new JLabel("0");
		lblLiczba1.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba1.setBounds(13, 23, 150, 150);
		contentPane.add(lblLiczba1);
		
		JLabel lblObrazek1 = new JLabel("");
		lblObrazek1.setIcon(new ImageIcon(Lotto.class.getResource("/resources/lotto_ball_150px.png")));
		lblObrazek1.setBounds(13, 23, 150, 161);
		contentPane.add(lblObrazek1);
		
		JLabel lblObrazek2 = new JLabel("");
		lblObrazek2.setIcon(new ImageIcon(Lotto.class.getResource("/resources/lotto_ball_150px.png")));
		lblObrazek2.setBounds(176, 23, 150, 161);
		contentPane.add(lblObrazek2);
		
		JLabel lblObrazek3 = new JLabel("");
		lblObrazek3.setIcon(new ImageIcon(Lotto.class.getResource("/resources/lotto_ball_150px.png")));
		lblObrazek3.setBounds(339, 23, 150, 161);
		contentPane.add(lblObrazek3);
		
		JLabel lblObrazek4 = new JLabel("");
		lblObrazek4.setIcon(new ImageIcon(Lotto.class.getResource("/resources/lotto_ball_150px.png")));
		lblObrazek4.setBounds(502, 23, 150, 161);
		contentPane.add(lblObrazek4);
		
		JLabel lblObrazek5 = new JLabel("");
		lblObrazek5.setIcon(new ImageIcon(Lotto.class.getResource("/resources/lotto_ball_150px.png")));
		lblObrazek5.setBounds(665, 23, 150, 161);
		contentPane.add(lblObrazek5);
		
		JLabel lblObrazek6 = new JLabel("");
		lblObrazek6.setIcon(new ImageIcon(Lotto.class.getResource("/resources/lotto_ball_150px.png")));
		lblObrazek6.setBounds(828, 23, 150, 161);
		contentPane.add(lblObrazek6);
		
		JButton btnLosowanie = new JButton("LOSOWANIE");
		btnLosowanie.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		btnLosowanie.setBounds(324, 196, 346, 43);
		contentPane.add(btnLosowanie);
	}
}
