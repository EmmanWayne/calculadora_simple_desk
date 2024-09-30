package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ventana_calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPantalla;

	public ventana_calculadora() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventana_calculadora.class.getResource("/recursos/icono_calculadora.png")));
		setBounds(100, 100, 500, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				close();
			}
		});

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPantalla = new JTextField();
		txtPantalla.setBackground(Color.WHITE);
		txtPantalla.setEditable(false);
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Arial", Font.PLAIN, 40));
		txtPantalla.setBounds(10, 10, 466, 90);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnNewButton_1_1_1 = new JButton("+");
		btnNewButton_1_1_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton_1_1_1.setBounds(310, 110, 166, 90);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("-");
		btnNewButton_1_1_2.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton_1_1_2.setBounds(310, 210, 166, 90);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("*");
		btnNewButton_1_1_1_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton_1_1_1_1.setBounds(310, 310, 166, 90);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("/");
		btnNewButton_1_1_2_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton_1_1_2_1.setBounds(310, 410, 166, 90);
		contentPane.add(btnNewButton_1_1_2_1);
		
		JButton btnNewButton_1_1_2_1_1 = new JButton("=");
		btnNewButton_1_1_2_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_2_1_1.setBounds(310, 510, 166, 90);
		contentPane.add(btnNewButton_1_1_2_1_1);
		
		JButton btnNewButton_1_1_1_2 = new JButton("7");
		btnNewButton_1_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_1_2.setBounds(10, 210, 90, 90);
		contentPane.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1_1_2_2 = new JButton("4");
		btnNewButton_1_1_2_2.setBackground(Color.WHITE);
		btnNewButton_1_1_2_2.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_2_2.setBounds(10, 310, 90, 90);
		contentPane.add(btnNewButton_1_1_2_2);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("1");
		btnNewButton_1_1_1_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_1_1_1.setBounds(10, 410, 90, 90);
		contentPane.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_2_1_2 = new JButton(".");
		btnNewButton_1_1_2_1_2.setBackground(new Color(70, 130, 180));
		btnNewButton_1_1_2_1_2.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton_1_1_2_1_2.setBounds(10, 510, 90, 90);
		contentPane.add(btnNewButton_1_1_2_1_2);
		
		JButton btnNewButton_1_1_1_3 = new JButton("8");
		btnNewButton_1_1_1_3.setBackground(Color.WHITE);
		btnNewButton_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_1_3.setBounds(110, 210, 90, 90);
		contentPane.add(btnNewButton_1_1_1_3);
		
		JButton btnNewButton_1_1_2_3 = new JButton("5");
		btnNewButton_1_1_2_3.setBackground(Color.WHITE);
		btnNewButton_1_1_2_3.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_2_3.setBounds(110, 310, 90, 90);
		contentPane.add(btnNewButton_1_1_2_3);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("2");
		btnNewButton_1_1_1_1_2.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_1_1_2.setBounds(110, 410, 90, 90);
		contentPane.add(btnNewButton_1_1_1_1_2);
		
		JButton btnNewButton_1_1_2_1_3 = new JButton("0");
		btnNewButton_1_1_2_1_3.setBackground(Color.WHITE);
		btnNewButton_1_1_2_1_3.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_2_1_3.setBounds(110, 510, 190, 90);
		contentPane.add(btnNewButton_1_1_2_1_3);
		
		JButton btnNewButton_1_1_1_4 = new JButton("9");
		btnNewButton_1_1_1_4.setBackground(Color.WHITE);
		btnNewButton_1_1_1_4.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_1_4.setBounds(210, 210, 90, 90);
		contentPane.add(btnNewButton_1_1_1_4);
		
		JButton btnNewButton_1_1_2_4 = new JButton("6");
		btnNewButton_1_1_2_4.setBackground(Color.WHITE);
		btnNewButton_1_1_2_4.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_2_4.setBounds(210, 310, 90, 90);
		contentPane.add(btnNewButton_1_1_2_4);
		
		JButton btnNewButton_1_1_1_1_3 = new JButton("3");
		btnNewButton_1_1_1_1_3.setBackground(Color.WHITE);
		btnNewButton_1_1_1_1_3.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_1_1_3.setBounds(210, 410, 90, 90);
		contentPane.add(btnNewButton_1_1_1_1_3);
		
		JButton btnNewButton_1_1_2_1_3_1 = new JButton("C");
		btnNewButton_1_1_2_1_3_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_2_1_3_1.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_2_1_3_1.setBounds(10, 110, 190, 90);
		contentPane.add(btnNewButton_1_1_2_1_3_1);
		
		JButton btnNewButton_1_1_1_4_1 = new JButton("«");
		btnNewButton_1_1_1_4_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_1_4_1.setFont(new Font("Arial", Font.BOLD, 25));
		btnNewButton_1_1_1_4_1.setBounds(210, 110, 90, 90);
		contentPane.add(btnNewButton_1_1_1_4_1);
	}
	
	private void close() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar la calculadora?", "",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
