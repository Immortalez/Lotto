package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class Lotto extends JFrame {

	private static final long serialVersionUID = -5691802613266333988L;
	private JPanel contentPane;
	private JLabel lblLiczba1;
	private JLabel lblLiczba2;
	private JLabel lblLiczba3;
	private JLabel lblLiczba4;
	private JLabel lblLiczba5;
	private JLabel lblLiczba6;
	private JButton btnLosowanie;
	private JButton btnSprawdz;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lotto frame = new Lotto();
					frame.setLocationRelativeTo(null);
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
		btnLosowanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				losowanie();
			}
		});
		btnSprawdz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sprawdz sprawdz = new Sprawdz();
				sprawdz.setLocationRelativeTo(null);
				sprawdz.setVisible(true);
			}
		});
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 995, 281);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLiczba6 = new JLabel("0");
		lblLiczba6.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba6.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba6.setBounds(828, 23, 150, 150);
		contentPane.add(lblLiczba6);
		
		lblLiczba5 = new JLabel("0");
		lblLiczba5.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba5.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba5.setBounds(665, 23, 150, 150);
		contentPane.add(lblLiczba5);
		
		lblLiczba4 = new JLabel("0");
		lblLiczba4.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba4.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba4.setBounds(502, 23, 150, 150);
		contentPane.add(lblLiczba4);
		
		lblLiczba3 = new JLabel("0");
		lblLiczba3.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba3.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba3.setBounds(339, 23, 150, 150);
		contentPane.add(lblLiczba3);
		
		lblLiczba2 = new JLabel("0");
		lblLiczba2.setHorizontalAlignment(SwingConstants.CENTER);
		lblLiczba2.setFont(new Font("Lucida Grande", Font.BOLD, 72));
		lblLiczba2.setBounds(176, 23, 150, 150);
		contentPane.add(lblLiczba2);
		
		lblLiczba1 = new JLabel("0");
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
		
		btnLosowanie = new JButton("LOSOWANIE");
		btnLosowanie.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		btnLosowanie.setBounds(314, 196, 175, 43);
		contentPane.add(btnLosowanie);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setEnabled(false);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Duże Lotto"}));
		comboBox.setBounds(853, 208, 125, 27);
		contentPane.add(comboBox);
		
		JTextArea txtrAuthorTomaszGorol = new JTextArea();
		txtrAuthorTomaszGorol.setEditable(false);
		txtrAuthorTomaszGorol.setForeground(Color.LIGHT_GRAY);
		txtrAuthorTomaszGorol.setBackground(SystemColor.window);
		txtrAuthorTomaszGorol.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		txtrAuthorTomaszGorol.setText("Author: Tomasz Gorol\nGithub: https://github.com/Immortalez\nRelease: v1.1 – 7 July 2017");
		txtrAuthorTomaszGorol.setBounds(13, 206, 263, 33);
		contentPane.add(txtrAuthorTomaszGorol);
		
		btnSprawdz = new JButton("SPRAWDŹ");
		btnSprawdz.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		btnSprawdz.setBounds(502, 196, 175, 43);
		contentPane.add(btnSprawdz);
	}

	private void losowanie(){
		ArrayList<Integer> wylosowane = new ArrayList<Integer>();
		int wylosowana = 0;
		while(wylosowane.size() < 6){
			wylosowana = ThreadLocalRandom.current().nextInt(1, 49+1);
			if(!wylosowane.contains(wylosowana)){
				wylosowane.add(wylosowana);
			}
		}
		
		// Sortowanie od najmniejszej do największej
		Collections.sort(wylosowane);
		
		//       Sortowanie od największej do najmniejszej
		// Collections.sort(wylosowane);
		// Collections.reverse(wylosowane);
		
		
		
		// TODO: UŁOZENIE OD NAJMNIEJSZEJ DO NAJWIĘKSZEJ
		
		lblLiczba1.setText(""+wylosowane.get(0));
		lblLiczba2.setText(""+wylosowane.get(1));
		lblLiczba3.setText(""+wylosowane.get(2));
		lblLiczba4.setText(""+wylosowane.get(3));
		lblLiczba5.setText(""+wylosowane.get(4));
		lblLiczba6.setText(""+wylosowane.get(5));
		
	}
}
