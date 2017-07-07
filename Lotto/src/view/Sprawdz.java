package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class Sprawdz extends JFrame {
	private static final long serialVersionUID = -6006487127082240935L;
	private JPanel contentPane;
	
	SpinnerModel model149 =
	        new SpinnerNumberModel(1, //initial value
	                               1, //min
	                               49, //max
	                               1);                //step
	
	private JTextField txtWynik1;
	private JTextField txtWynik2;
	private JTextField txtWynik3;
	private JTextField txtWynik4;
	private JTextField txtWynik5;
	private JTextField txtWynik6;
	private JTextField txtZ11;
	private JTextField txtZ12;
	private JTextField txtZ13;
	private JTextField txtZ14;
	private JTextField txtZ15;
	private JTextField txtZ16;
	private JButton btnNewButton;
	private JLabel lblZ2;
	private JTextField txtZ21;
	private JTextField txtZ22;
	private JTextField txtZ23;
	private JTextField txtZ24;
	private JTextField txtZ25;
	private JTextField txtZ26;
	private JLabel lblZ3;
	private JLabel lblZ4;
	private JTextField txtZ31;
	private JTextField txtZ41;
	private JTextField txtZ32;
	private JTextField txtZ42;
	private JTextField txtZ33;
	private JTextField txtZ43;
	private JTextField txtZ34;
	private JTextField txtZ44;
	private JTextField txtZ35;
	private JTextField txtZ45;
	private JTextField txtZ36;
	private JTextField txtZ46;
	private JLabel lblZ5;
	private JLabel lblZ6;
	private JTextField txtZ61;
	private JTextField txtZ51;
	private JTextField txtZ52;
	private JTextField txtZ62;
	private JTextField txtZ63;
	private JTextField txtZ53;
	private JTextField txtZ54;
	private JTextField txtZ64;
	private JTextField txtZ65;
	private JTextField txtZ55;
	private JTextField txtZ56;
	private JTextField txtZ66;
	private JLabel lblZ7;
	private JTextField txtZ71;
	private JTextField txtZ72;
	private JTextField txtZ73;
	private JTextField txtZ74;
	private JTextField txtZ75;
	private JTextField txtZ76;
	private JTextField txtZ86;
	private JTextField txtZ85;
	private JTextField txtZ84;
	private JTextField txtZ83;
	private JTextField txtZ82;
	private JTextField txtZ81;
	private JLabel lblZ8;
	private JLabel lblZ9;
	private JTextField txtZ91;
	private JTextField txtZ92;
	private JTextField txtZ93;
	private JTextField txtZ94;
	private JTextField txtZ95;
	private JTextField txtZ96;
	private JTextField txtZ106;
	private JTextField txtZ105;
	private JTextField txtZ104;
	private JTextField txtZ103;
	private JTextField txtZ102;
	private JTextField txtZ101;
	private JLabel lblZ10;
	private JButton btnZeruj;
	
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sprawdz frame = new Sprawdz();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Sprawdz() {
		initComponents();
		createEvents();
	}

	private void createEvents() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sprawdzWyniki();
			}
		});
		btnZeruj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int wybor = JOptionPane.showConfirmDialog(null, "Chcesz wyzerować zakłady?", "Uwaga", JOptionPane.YES_NO_OPTION);
				if(wybor == JOptionPane.YES_OPTION) zeruj();
			}
		});
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 442, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWyniki = new JLabel("WYNIKI");
		lblWyniki.setHorizontalAlignment(SwingConstants.RIGHT);
		lblWyniki.setBounds(41, 22, 61, 16);
		contentPane.add(lblWyniki);
		
		txtWynik1 = new JTextField();
		txtWynik1.setHorizontalAlignment(SwingConstants.CENTER);
		txtWynik1.setText("0");
		txtWynik1.setBounds(144, 17, 31, 26);
		contentPane.add(txtWynik1);
		txtWynik1.setColumns(10);
		
		txtWynik2 = new JTextField();
		txtWynik2.setText("0");
		txtWynik2.setHorizontalAlignment(SwingConstants.CENTER);
		txtWynik2.setColumns(10);
		txtWynik2.setBounds(187, 17, 31, 26);
		contentPane.add(txtWynik2);
		
		txtWynik3 = new JTextField();
		txtWynik3.setText("0");
		txtWynik3.setHorizontalAlignment(SwingConstants.CENTER);
		txtWynik3.setColumns(10);
		txtWynik3.setBounds(230, 17, 31, 26);
		contentPane.add(txtWynik3);
		
		txtWynik4 = new JTextField();
		txtWynik4.setText("0");
		txtWynik4.setHorizontalAlignment(SwingConstants.CENTER);
		txtWynik4.setColumns(10);
		txtWynik4.setBounds(273, 17, 31, 26);
		contentPane.add(txtWynik4);
		
		txtWynik5 = new JTextField();
		txtWynik5.setText("0");
		txtWynik5.setHorizontalAlignment(SwingConstants.CENTER);
		txtWynik5.setColumns(10);
		txtWynik5.setBounds(316, 17, 31, 26);
		contentPane.add(txtWynik5);
		
		txtWynik6 = new JTextField();
		txtWynik6.setText("0");
		txtWynik6.setHorizontalAlignment(SwingConstants.CENTER);
		txtWynik6.setColumns(10);
		txtWynik6.setBounds(359, 17, 31, 26);
		contentPane.add(txtWynik6);
		
		JLabel lblZ1 = new JLabel("ZAKŁAD 1");
		lblZ1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ1.setBounds(29, 83, 73, 16);
		contentPane.add(lblZ1);
		
		txtZ11 = new JTextField();
		txtZ11.setText("0");
		txtZ11.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ11.setColumns(10);
		txtZ11.setBounds(144, 78, 31, 26);
		contentPane.add(txtZ11);
		
		txtZ12 = new JTextField();
		txtZ12.setText("0");
		txtZ12.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ12.setColumns(10);
		txtZ12.setBounds(187, 78, 31, 26);
		contentPane.add(txtZ12);
		
		txtZ13 = new JTextField();
		txtZ13.setText("0");
		txtZ13.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ13.setColumns(10);
		txtZ13.setBounds(230, 78, 31, 26);
		contentPane.add(txtZ13);
		
		txtZ14 = new JTextField();
		txtZ14.setText("0");
		txtZ14.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ14.setColumns(10);
		txtZ14.setBounds(273, 78, 31, 26);
		contentPane.add(txtZ14);
		
		txtZ15 = new JTextField();
		txtZ15.setText("0");
		txtZ15.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ15.setColumns(10);
		txtZ15.setBounds(316, 78, 31, 26);
		contentPane.add(txtZ15);
		
		txtZ16 = new JTextField();
		txtZ16.setText("0");
		txtZ16.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ16.setColumns(10);
		txtZ16.setBounds(359, 78, 31, 26);
		contentPane.add(txtZ16);
		
		btnNewButton = new JButton("SPRAWDŹ CZY WYGRAŁEM");
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnNewButton.setBounds(68, 413, 305, 46);
		contentPane.add(btnNewButton);
		
		lblZ2 = new JLabel("ZAKŁAD 2");
		lblZ2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ2.setBounds(29, 116, 73, 16);
		contentPane.add(lblZ2);
		
		txtZ21 = new JTextField();
		txtZ21.setText("0");
		txtZ21.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ21.setColumns(10);
		txtZ21.setBounds(144, 111, 31, 26);
		contentPane.add(txtZ21);
		
		txtZ22 = new JTextField();
		txtZ22.setText("0");
		txtZ22.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ22.setColumns(10);
		txtZ22.setBounds(187, 111, 31, 26);
		contentPane.add(txtZ22);
		
		txtZ23 = new JTextField();
		txtZ23.setText("0");
		txtZ23.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ23.setColumns(10);
		txtZ23.setBounds(230, 111, 31, 26);
		contentPane.add(txtZ23);
		
		txtZ24 = new JTextField();
		txtZ24.setText("0");
		txtZ24.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ24.setColumns(10);
		txtZ24.setBounds(273, 111, 31, 26);
		contentPane.add(txtZ24);
		
		txtZ25 = new JTextField();
		txtZ25.setText("0");
		txtZ25.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ25.setColumns(10);
		txtZ25.setBounds(316, 111, 31, 26);
		contentPane.add(txtZ25);
		
		txtZ26 = new JTextField();
		txtZ26.setText("0");
		txtZ26.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ26.setColumns(10);
		txtZ26.setBounds(359, 111, 31, 26);
		contentPane.add(txtZ26);
		
		lblZ3 = new JLabel("ZAKŁAD 3");
		lblZ3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ3.setBounds(29, 149, 73, 16);
		contentPane.add(lblZ3);
		
		lblZ4 = new JLabel("ZAKŁAD 4");
		lblZ4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ4.setBounds(29, 182, 73, 16);
		contentPane.add(lblZ4);
		
		txtZ31 = new JTextField();
		txtZ31.setText("0");
		txtZ31.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ31.setColumns(10);
		txtZ31.setBounds(144, 144, 31, 26);
		contentPane.add(txtZ31);
		
		txtZ41 = new JTextField();
		txtZ41.setText("0");
		txtZ41.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ41.setColumns(10);
		txtZ41.setBounds(144, 177, 31, 26);
		contentPane.add(txtZ41);
		
		txtZ32 = new JTextField();
		txtZ32.setText("0");
		txtZ32.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ32.setColumns(10);
		txtZ32.setBounds(187, 144, 31, 26);
		contentPane.add(txtZ32);
		
		txtZ42 = new JTextField();
		txtZ42.setText("0");
		txtZ42.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ42.setColumns(10);
		txtZ42.setBounds(187, 177, 31, 26);
		contentPane.add(txtZ42);
		
		txtZ33 = new JTextField();
		txtZ33.setText("0");
		txtZ33.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ33.setColumns(10);
		txtZ33.setBounds(230, 144, 31, 26);
		contentPane.add(txtZ33);
		
		txtZ43 = new JTextField();
		txtZ43.setText("0");
		txtZ43.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ43.setColumns(10);
		txtZ43.setBounds(230, 177, 31, 26);
		contentPane.add(txtZ43);
		
		txtZ34 = new JTextField();
		txtZ34.setText("0");
		txtZ34.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ34.setColumns(10);
		txtZ34.setBounds(273, 144, 31, 26);
		contentPane.add(txtZ34);
		
		txtZ44 = new JTextField();
		txtZ44.setText("0");
		txtZ44.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ44.setColumns(10);
		txtZ44.setBounds(273, 177, 31, 26);
		contentPane.add(txtZ44);
		
		txtZ35 = new JTextField();
		txtZ35.setText("0");
		txtZ35.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ35.setColumns(10);
		txtZ35.setBounds(316, 144, 31, 26);
		contentPane.add(txtZ35);
		
		txtZ45 = new JTextField();
		txtZ45.setText("0");
		txtZ45.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ45.setColumns(10);
		txtZ45.setBounds(316, 177, 31, 26);
		contentPane.add(txtZ45);
		
		txtZ36 = new JTextField();
		txtZ36.setText("0");
		txtZ36.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ36.setColumns(10);
		txtZ36.setBounds(359, 144, 31, 26);
		contentPane.add(txtZ36);
		
		txtZ46 = new JTextField();
		txtZ46.setText("0");
		txtZ46.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ46.setColumns(10);
		txtZ46.setBounds(359, 177, 31, 26);
		contentPane.add(txtZ46);
		
		lblZ5 = new JLabel("ZAKŁAD 5");
		lblZ5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ5.setBounds(29, 215, 73, 16);
		contentPane.add(lblZ5);
		
		lblZ6 = new JLabel("ZAKŁAD 6");
		lblZ6.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ6.setBounds(29, 248, 73, 16);
		contentPane.add(lblZ6);
		
		txtZ61 = new JTextField();
		txtZ61.setText("0");
		txtZ61.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ61.setColumns(10);
		txtZ61.setBounds(144, 243, 31, 26);
		contentPane.add(txtZ61);
		
		txtZ51 = new JTextField();
		txtZ51.setText("0");
		txtZ51.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ51.setColumns(10);
		txtZ51.setBounds(144, 210, 31, 26);
		contentPane.add(txtZ51);
		
		txtZ52 = new JTextField();
		txtZ52.setText("0");
		txtZ52.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ52.setColumns(10);
		txtZ52.setBounds(187, 210, 31, 26);
		contentPane.add(txtZ52);
		
		txtZ62 = new JTextField();
		txtZ62.setText("0");
		txtZ62.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ62.setColumns(10);
		txtZ62.setBounds(187, 243, 31, 26);
		contentPane.add(txtZ62);
		
		txtZ63 = new JTextField();
		txtZ63.setText("0");
		txtZ63.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ63.setColumns(10);
		txtZ63.setBounds(230, 243, 31, 26);
		contentPane.add(txtZ63);
		
		txtZ53 = new JTextField();
		txtZ53.setText("0");
		txtZ53.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ53.setColumns(10);
		txtZ53.setBounds(230, 210, 31, 26);
		contentPane.add(txtZ53);
		
		txtZ54 = new JTextField();
		txtZ54.setText("0");
		txtZ54.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ54.setColumns(10);
		txtZ54.setBounds(273, 210, 31, 26);
		contentPane.add(txtZ54);
		
		txtZ64 = new JTextField();
		txtZ64.setText("0");
		txtZ64.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ64.setColumns(10);
		txtZ64.setBounds(273, 243, 31, 26);
		contentPane.add(txtZ64);
		
		txtZ65 = new JTextField();
		txtZ65.setText("0");
		txtZ65.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ65.setColumns(10);
		txtZ65.setBounds(316, 243, 31, 26);
		contentPane.add(txtZ65);
		
		txtZ55 = new JTextField();
		txtZ55.setText("0");
		txtZ55.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ55.setColumns(10);
		txtZ55.setBounds(316, 210, 31, 26);
		contentPane.add(txtZ55);
		
		txtZ56 = new JTextField();
		txtZ56.setText("0");
		txtZ56.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ56.setColumns(10);
		txtZ56.setBounds(359, 210, 31, 26);
		contentPane.add(txtZ56);
		
		txtZ66 = new JTextField();
		txtZ66.setText("0");
		txtZ66.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ66.setColumns(10);
		txtZ66.setBounds(359, 243, 31, 26);
		contentPane.add(txtZ66);
		
		lblZ7 = new JLabel("ZAKŁAD 7");
		lblZ7.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ7.setBounds(29, 281, 73, 16);
		contentPane.add(lblZ7);
		
		txtZ71 = new JTextField();
		txtZ71.setText("0");
		txtZ71.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ71.setColumns(10);
		txtZ71.setBounds(144, 276, 31, 26);
		contentPane.add(txtZ71);
		
		txtZ72 = new JTextField();
		txtZ72.setText("0");
		txtZ72.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ72.setColumns(10);
		txtZ72.setBounds(187, 276, 31, 26);
		contentPane.add(txtZ72);
		
		txtZ73 = new JTextField();
		txtZ73.setText("0");
		txtZ73.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ73.setColumns(10);
		txtZ73.setBounds(230, 276, 31, 26);
		contentPane.add(txtZ73);
		
		txtZ74 = new JTextField();
		txtZ74.setText("0");
		txtZ74.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ74.setColumns(10);
		txtZ74.setBounds(273, 276, 31, 26);
		contentPane.add(txtZ74);
		
		txtZ75 = new JTextField();
		txtZ75.setText("0");
		txtZ75.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ75.setColumns(10);
		txtZ75.setBounds(316, 276, 31, 26);
		contentPane.add(txtZ75);
		
		txtZ76 = new JTextField();
		txtZ76.setText("0");
		txtZ76.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ76.setColumns(10);
		txtZ76.setBounds(359, 276, 31, 26);
		contentPane.add(txtZ76);
		
		txtZ86 = new JTextField();
		txtZ86.setText("0");
		txtZ86.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ86.setColumns(10);
		txtZ86.setBounds(359, 309, 31, 26);
		contentPane.add(txtZ86);
		
		txtZ85 = new JTextField();
		txtZ85.setText("0");
		txtZ85.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ85.setColumns(10);
		txtZ85.setBounds(316, 309, 31, 26);
		contentPane.add(txtZ85);
		
		txtZ84 = new JTextField();
		txtZ84.setText("0");
		txtZ84.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ84.setColumns(10);
		txtZ84.setBounds(273, 309, 31, 26);
		contentPane.add(txtZ84);
		
		txtZ83 = new JTextField();
		txtZ83.setText("0");
		txtZ83.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ83.setColumns(10);
		txtZ83.setBounds(230, 309, 31, 26);
		contentPane.add(txtZ83);
		
		txtZ82 = new JTextField();
		txtZ82.setText("0");
		txtZ82.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ82.setColumns(10);
		txtZ82.setBounds(187, 309, 31, 26);
		contentPane.add(txtZ82);
		
		txtZ81 = new JTextField();
		txtZ81.setText("0");
		txtZ81.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ81.setColumns(10);
		txtZ81.setBounds(144, 309, 31, 26);
		contentPane.add(txtZ81);
		
		lblZ8 = new JLabel("ZAKŁAD 8");
		lblZ8.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ8.setBounds(29, 314, 73, 16);
		contentPane.add(lblZ8);
		
		lblZ9 = new JLabel("ZAKŁAD 9");
		lblZ9.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ9.setBounds(29, 347, 73, 16);
		contentPane.add(lblZ9);
		
		txtZ91 = new JTextField();
		txtZ91.setText("0");
		txtZ91.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ91.setColumns(10);
		txtZ91.setBounds(144, 342, 31, 26);
		contentPane.add(txtZ91);
		
		txtZ92 = new JTextField();
		txtZ92.setText("0");
		txtZ92.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ92.setColumns(10);
		txtZ92.setBounds(187, 342, 31, 26);
		contentPane.add(txtZ92);
		
		txtZ93 = new JTextField();
		txtZ93.setText("0");
		txtZ93.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ93.setColumns(10);
		txtZ93.setBounds(230, 342, 31, 26);
		contentPane.add(txtZ93);
		
		txtZ94 = new JTextField();
		txtZ94.setText("0");
		txtZ94.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ94.setColumns(10);
		txtZ94.setBounds(273, 342, 31, 26);
		contentPane.add(txtZ94);
		
		txtZ95 = new JTextField();
		txtZ95.setText("0");
		txtZ95.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ95.setColumns(10);
		txtZ95.setBounds(316, 342, 31, 26);
		contentPane.add(txtZ95);
		
		txtZ96 = new JTextField();
		txtZ96.setText("0");
		txtZ96.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ96.setColumns(10);
		txtZ96.setBounds(359, 342, 31, 26);
		contentPane.add(txtZ96);
		
		txtZ106 = new JTextField();
		txtZ106.setText("0");
		txtZ106.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ106.setColumns(10);
		txtZ106.setBounds(359, 375, 31, 26);
		contentPane.add(txtZ106);
		
		txtZ105 = new JTextField();
		txtZ105.setText("0");
		txtZ105.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ105.setColumns(10);
		txtZ105.setBounds(316, 375, 31, 26);
		contentPane.add(txtZ105);
		
		txtZ104 = new JTextField();
		txtZ104.setText("0");
		txtZ104.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ104.setColumns(10);
		txtZ104.setBounds(273, 375, 31, 26);
		contentPane.add(txtZ104);
		
		txtZ103 = new JTextField();
		txtZ103.setText("0");
		txtZ103.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ103.setColumns(10);
		txtZ103.setBounds(230, 375, 31, 26);
		contentPane.add(txtZ103);
		
		txtZ102 = new JTextField();
		txtZ102.setText("0");
		txtZ102.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ102.setColumns(10);
		txtZ102.setBounds(187, 375, 31, 26);
		contentPane.add(txtZ102);
		
		txtZ101 = new JTextField();
		txtZ101.setText("0");
		txtZ101.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ101.setColumns(10);
		txtZ101.setBounds(144, 375, 31, 26);
		contentPane.add(txtZ101);
		
		lblZ10 = new JLabel("ZAKŁAD 10");
		lblZ10.setHorizontalAlignment(SwingConstants.RIGHT);
		lblZ10.setBounds(29, 380, 73, 16);
		contentPane.add(lblZ10);
		
		btnZeruj = new JButton("ZERUJ");
		btnZeruj.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		btnZeruj.setBounds(125, 461, 191, 46);
		contentPane.add(btnZeruj);
	}

	private void sprawdzWyniki(){
		ArrayList<Integer> wyniki = new ArrayList<Integer>();
		wyniki.add(Integer.parseInt(txtWynik1.getText()));
		wyniki.add(Integer.parseInt(txtWynik2.getText()));
		wyniki.add(Integer.parseInt(txtWynik3.getText()));
		wyniki.add(Integer.parseInt(txtWynik4.getText()));
		wyniki.add(Integer.parseInt(txtWynik5.getText()));
		wyniki.add(Integer.parseInt(txtWynik6.getText()));
		Collections.sort(wyniki);
		
		
		// ZAKŁAD 1
		if(wyniki.contains(Integer.parseInt(txtZ11.getText()))) txtZ11.setBackground(Color.GREEN);
		else txtZ11.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ12.getText()))) txtZ12.setBackground(Color.GREEN);
		else txtZ12.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ13.getText()))) txtZ13.setBackground(Color.GREEN);
		else txtZ13.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ14.getText()))) txtZ14.setBackground(Color.GREEN);
		else txtZ14.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ15.getText()))) txtZ15.setBackground(Color.GREEN);
		else txtZ15.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ16.getText()))) txtZ16.setBackground(Color.GREEN);
		else txtZ16.setBackground(Color.WHITE);
		
		// ZAKŁAD 2
		if(wyniki.contains(Integer.parseInt(txtZ21.getText()))) txtZ21.setBackground(Color.GREEN);
		else txtZ21.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ22.getText()))) txtZ22.setBackground(Color.GREEN);
		else txtZ22.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ23.getText()))) txtZ23.setBackground(Color.GREEN);
		else txtZ23.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ24.getText()))) txtZ24.setBackground(Color.GREEN);
		else txtZ24.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ25.getText()))) txtZ25.setBackground(Color.GREEN);
		else txtZ25.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ26.getText()))) txtZ26.setBackground(Color.GREEN);
		else txtZ26.setBackground(Color.WHITE);

		// ZAKŁAD 3
		if(wyniki.contains(Integer.parseInt(txtZ31.getText()))) txtZ31.setBackground(Color.GREEN);
		else txtZ31.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ32.getText()))) txtZ32.setBackground(Color.GREEN);
		else txtZ32.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ33.getText()))) txtZ33.setBackground(Color.GREEN);
		else txtZ33.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ34.getText()))) txtZ34.setBackground(Color.GREEN);
		else txtZ34.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ35.getText()))) txtZ35.setBackground(Color.GREEN);
		else txtZ35.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ36.getText()))) txtZ36.setBackground(Color.GREEN);
		else txtZ36.setBackground(Color.WHITE);
		
		// ZAKŁAD 4
		if(wyniki.contains(Integer.parseInt(txtZ41.getText()))) txtZ41.setBackground(Color.GREEN);
		else txtZ41.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ42.getText()))) txtZ42.setBackground(Color.GREEN);
		else txtZ42.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ43.getText()))) txtZ43.setBackground(Color.GREEN);
		else txtZ43.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ44.getText()))) txtZ44.setBackground(Color.GREEN);
		else txtZ44.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ45.getText()))) txtZ45.setBackground(Color.GREEN);
		else txtZ45.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ46.getText()))) txtZ46.setBackground(Color.GREEN);
		else txtZ46.setBackground(Color.WHITE);
		
		// ZAKŁAD 5
		if(wyniki.contains(Integer.parseInt(txtZ51.getText()))) txtZ51.setBackground(Color.GREEN);
		else txtZ51.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ52.getText()))) txtZ52.setBackground(Color.GREEN);
		else txtZ52.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ53.getText()))) txtZ53.setBackground(Color.GREEN);
		else txtZ53.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ54.getText()))) txtZ54.setBackground(Color.GREEN);
		else txtZ54.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ55.getText()))) txtZ55.setBackground(Color.GREEN);
		else txtZ55.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ56.getText()))) txtZ56.setBackground(Color.GREEN);
		else txtZ56.setBackground(Color.WHITE);
		
		// ZAKŁAD 6
		if(wyniki.contains(Integer.parseInt(txtZ61.getText()))) txtZ61.setBackground(Color.GREEN);
		else txtZ61.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ62.getText()))) txtZ62.setBackground(Color.GREEN);
		else txtZ62.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ63.getText()))) txtZ63.setBackground(Color.GREEN);
		else txtZ63.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ64.getText()))) txtZ64.setBackground(Color.GREEN);
		else txtZ64.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ65.getText()))) txtZ65.setBackground(Color.GREEN);
		else txtZ65.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ66.getText()))) txtZ66.setBackground(Color.GREEN);
		else txtZ66.setBackground(Color.WHITE);

		// ZAKŁAD 7
		if(wyniki.contains(Integer.parseInt(txtZ71.getText()))) txtZ71.setBackground(Color.GREEN);
		else txtZ71.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ72.getText()))) txtZ72.setBackground(Color.GREEN);
		else txtZ72.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ73.getText()))) txtZ73.setBackground(Color.GREEN);
		else txtZ73.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ74.getText()))) txtZ74.setBackground(Color.GREEN);
		else txtZ74.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ75.getText()))) txtZ75.setBackground(Color.GREEN);
		else txtZ75.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ76.getText()))) txtZ76.setBackground(Color.GREEN);
		else txtZ76.setBackground(Color.WHITE);
		
		// ZAKŁAD 8
		if(wyniki.contains(Integer.parseInt(txtZ81.getText()))) txtZ81.setBackground(Color.GREEN);
		else txtZ81.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ82.getText()))) txtZ82.setBackground(Color.GREEN);
		else txtZ82.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ83.getText()))) txtZ83.setBackground(Color.GREEN);
		else txtZ83.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ84.getText()))) txtZ84.setBackground(Color.GREEN);
		else txtZ84.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ85.getText()))) txtZ85.setBackground(Color.GREEN);
		else txtZ85.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ86.getText()))) txtZ86.setBackground(Color.GREEN);
		else txtZ86.setBackground(Color.WHITE);
		
		// ZAKŁAD 9
		if(wyniki.contains(Integer.parseInt(txtZ91.getText()))) txtZ91.setBackground(Color.GREEN);
		else txtZ91.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ92.getText()))) txtZ92.setBackground(Color.GREEN);
		else txtZ92.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ93.getText()))) txtZ93.setBackground(Color.GREEN);
		else txtZ93.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ94.getText()))) txtZ94.setBackground(Color.GREEN);
		else txtZ94.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ95.getText()))) txtZ95.setBackground(Color.GREEN);
		else txtZ95.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ96.getText()))) txtZ96.setBackground(Color.GREEN);
		else txtZ96.setBackground(Color.WHITE);
		
		// ZAKŁAD 10
		if(wyniki.contains(Integer.parseInt(txtZ101.getText()))) txtZ101.setBackground(Color.GREEN);
		else txtZ101.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ102.getText()))) txtZ102.setBackground(Color.GREEN);
		else txtZ102.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ103.getText()))) txtZ103.setBackground(Color.GREEN);
		else txtZ103.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ104.getText()))) txtZ104.setBackground(Color.GREEN);
		else txtZ104.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ105.getText()))) txtZ105.setBackground(Color.GREEN);
		else txtZ105.setBackground(Color.WHITE);
		if(wyniki.contains(Integer.parseInt(txtZ106.getText()))) txtZ106.setBackground(Color.GREEN);
		else txtZ106.setBackground(Color.WHITE);
		
		
	}
	private void zeruj(){
		txtZ11.setText("0");
		txtZ12.setText("0");
		txtZ13.setText("0");
		txtZ14.setText("0");
		txtZ15.setText("0");
		txtZ16.setText("0");
		
		txtZ21.setText("0");
		txtZ22.setText("0");
		txtZ23.setText("0");
		txtZ24.setText("0");
		txtZ25.setText("0");
		txtZ26.setText("0");
		
		txtZ31.setText("0");
		txtZ32.setText("0");
		txtZ33.setText("0");
		txtZ34.setText("0");
		txtZ35.setText("0");
		txtZ36.setText("0");
		
		txtZ41.setText("0");
		txtZ42.setText("0");
		txtZ43.setText("0");
		txtZ44.setText("0");
		txtZ45.setText("0");
		txtZ46.setText("0");
		
		txtZ51.setText("0");
		txtZ52.setText("0");
		txtZ53.setText("0");
		txtZ54.setText("0");
		txtZ55.setText("0");
		txtZ56.setText("0");
		
		txtZ61.setText("0");
		txtZ62.setText("0");
		txtZ63.setText("0");
		txtZ64.setText("0");
		txtZ65.setText("0");
		txtZ66.setText("0");
		
		txtZ71.setText("0");
		txtZ72.setText("0");
		txtZ73.setText("0");
		txtZ74.setText("0");
		txtZ75.setText("0");
		txtZ76.setText("0");
		
		txtZ81.setText("0");
		txtZ82.setText("0");
		txtZ83.setText("0");
		txtZ84.setText("0");
		txtZ85.setText("0");
		txtZ86.setText("0");
		
		txtZ91.setText("0");
		txtZ92.setText("0");
		txtZ93.setText("0");
		txtZ94.setText("0");
		txtZ95.setText("0");
		txtZ96.setText("0");
		
		txtZ101.setText("0");
		txtZ102.setText("0");
		txtZ103.setText("0");
		txtZ104.setText("0");
		txtZ105.setText("0");
		txtZ106.setText("0");
	}
}
