package juego;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setForeground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		

		
		JButton btnNewButton = new JButton("JUGAR");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Impact", Font.PLAIN, 44));
		btnNewButton.setForeground(new Color(204, 255, 0));
		btnNewButton.setBackground(new Color(0, 0, 51));
		btnNewButton.setBounds(77, 11, 598, 169);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego j = new Juego();
				dispose();
			}
		});
		contentPane.setLayout(null);

		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel();
		Image imagen = new ImageIcon("play.png").getImage().getScaledInstance(50, 50, 50);
		label.setIcon(new ImageIcon(imagen));
		label.setBounds(350,180,50,50);
		contentPane.add(label);
		JLabel label2 = new JLabel();
		Image imagen2 = new ImageIcon("mono2.png").getImage().getScaledInstance(300, 300, 50);
		label2.setIcon(new ImageIcon(imagen2));
		label2.setBounds(350,250,300,300);
		contentPane.add(label2);
		JLabel label3 = new JLabel();
		Image imagen3 = new ImageIcon("puma2.png").getImage().getScaledInstance(300, 300, 50);
		label3.setIcon(new ImageIcon(imagen3));
		label3.setBounds(50,250,300,300);
		contentPane.add(label3);
		
	}
}
