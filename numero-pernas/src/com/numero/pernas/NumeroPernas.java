package com.numero.pernas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumeroPernas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumeroPernas frame = new NumeroPernas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NumeroPernas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 220, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Quantas Pernas?");
		lblNewLabel.setBounds(26, 21, 101, 23);
		contentPane.add(lblNewLabel);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 10000, 1));
		spinner.setFont(new Font("Roboto", Font.BOLD, 21));
		spinner.setBounds(26, 55, 101, 40);
		contentPane.add(spinner);

		JLabel lblRes = new JLabel("");
		lblRes.setBounds(10, 159, 184, 73);
		contentPane.add(lblRes);

		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pernas = (int) spinner.getValue();

				switch (pernas) {
				case 1:
					lblRes.setText("Sací");
					break;
				case 2:
					lblRes.setText("Bípede");
					break;
				case 3:
					lblRes.setText("Kid");
					break;
				case 4:
					lblRes.setText("Quadrúpede");
					break;
				case 6,8:
					lblRes.setText("Aranha");
					break;
				default:
					lblRes.setText("ET");
				}

			}
		});btnNewButton.setBounds(26,106,101,30);contentPane.add(btnNewButton);
}}
