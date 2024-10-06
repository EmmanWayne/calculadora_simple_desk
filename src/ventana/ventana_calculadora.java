package ventana;

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
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;

public class ventana_calculadora extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txtPantalla;
	public JButton btn0;
	public JButton btn1;
	public JButton btn2;
	public JButton btn3;
	public JButton btn4;
	public JButton btn5;
	public JButton btn6;
	public JButton btn7;
	public JButton btn8;
	public JButton btn9;
	public JButton btnPunto;
	public JButton btnMas;
	public JButton btnMenos;
	public JButton btnMultiplicar;
	public JButton btnDividir;
	public JButton btnIgual;
	public JButton btnLimpiar;
	private JButton btnTema;
	private JButton btnBorrar;
	public float n1;
	public float n2;
	public String operador;

	public ventana_calculadora() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ventana_calculadora.class.getResource("/recursos/icono_calculadora.png")));
		setBounds(100, 100, 500, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent evt) {
				close();
			}

		});

		btnMas = new JButton("+");
		btnMas.setForeground(Color.BLACK);
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (txtPantalla.getText().equals("")) {

				} else {
					n1 = Float.parseFloat(txtPantalla.getText().toString());
					operador = "+";
					txtPantalla.setText("");
				}

			}
		});
		btnMas.setBackground(new Color(95, 158, 160));
		btnMas.setFont(new Font("Arial", Font.BOLD, 30));
		btnMas.setBounds(310, 110, 166, 90);
		contentPane.add(btnMas);

		btnMenos = new JButton("-");
		btnMenos.setForeground(Color.BLACK);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPantalla.getText().equals("")) {

				} else {
					n1 = Float.parseFloat(txtPantalla.getText().toString());
					operador = "-";
					txtPantalla.setText("");
				}
			}
		});
		btnMenos.setBackground(new Color(95, 158, 160));
		btnMenos.setFont(new Font("Arial", Font.BOLD, 30));
		btnMenos.setBounds(310, 210, 166, 90);
		contentPane.add(btnMenos);

		btnMultiplicar = new JButton("*");
		btnMultiplicar.setForeground(Color.BLACK);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPantalla.getText().equals("")) {

				} else {
					n1 = Float.parseFloat(txtPantalla.getText().toString());
					operador = "*";
					txtPantalla.setText("");
				}
			}
		});
		btnMultiplicar.setBackground(new Color(95, 158, 160));
		btnMultiplicar.setFont(new Font("Arial", Font.BOLD, 30));
		btnMultiplicar.setBounds(310, 310, 166, 90);
		contentPane.add(btnMultiplicar);

		btnDividir = new JButton("/");
		btnDividir.setForeground(Color.BLACK);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPantalla.getText().equals("")) {

				} else {
					n1 = Float.parseFloat(txtPantalla.getText().toString());
					operador = "/";
					txtPantalla.setText("");
				}
			}
		});
		btnDividir.setBackground(new Color(95, 158, 160));
		btnDividir.setFont(new Font("Arial", Font.BOLD, 30));
		btnDividir.setBounds(310, 410, 166, 90);
		contentPane.add(btnDividir);

		btnIgual = new JButton("=");
		btnIgual.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
					txtPantalla.setText(txtPantalla.getText() + "0");
				}
			}
		});
		btnIgual.setForeground(Color.BLACK);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				n2 = Float.parseFloat(txtPantalla.getText().toString());

				switch (operador) {
				case "+":
					txtPantalla.setText(respuestaSinCero(n1 + n2));

					break;
				case "-":
					txtPantalla.setText(respuestaSinCero(n1 - n2));

					break;
				case "*":
					txtPantalla.setText(respuestaSinCero(n1 * n2));

					break;
				case "/":
					if (n2 == 0) {
						JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
						txtPantalla.setText("");
						n1 = 0;
						n2 = 0;
					} else {
						txtPantalla.setText(respuestaSinCero(n1 / n2));
					}

					break;

				}

			}
		});
		btnIgual.setBackground(new Color(95, 158, 160));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 25));
		btnIgual.setBounds(310, 510, 166, 90);

		contentPane.add(btnIgual);

		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "7");
			}
		});
		btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Arial", Font.BOLD, 25));
		btn7.setBounds(10, 210, 90, 90);
		contentPane.add(btn7);

		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "4");
			}
		});
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("Arial", Font.BOLD, 25));
		btn4.setBounds(10, 310, 90, 90);
		contentPane.add(btn4);

		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "1");
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Arial", Font.BOLD, 25));
		btn1.setBounds(10, 410, 90, 90);
		contentPane.add(btn1);

		btnPunto = new JButton(".");
		btnPunto.setForeground(Color.BLACK);
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!txtPantalla.getText().toString().contains(".")) {
					txtPantalla.setText(txtPantalla.getText() + ".");
				}

			}
		});
		btnPunto.setBackground(new Color(95, 158, 160));
		btnPunto.setFont(new Font("Arial", Font.BOLD, 30));
		btnPunto.setBounds(10, 510, 90, 90);
		contentPane.add(btnPunto);

		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "8");
			}
		});
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Arial", Font.BOLD, 25));
		btn8.setBounds(110, 210, 90, 90);
		contentPane.add(btn8);

		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "5");
			}
		});
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Arial", Font.BOLD, 25));
		btn5.setBounds(110, 310, 90, 90);
		contentPane.add(btn5);

		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "2");
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("Arial", Font.BOLD, 25));
		btn2.setBounds(110, 410, 90, 90);
		contentPane.add(btn2);

		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "0");
			}
		});
		btn0.setBackground(Color.WHITE);
		btn0.setFont(new Font("Arial", Font.BOLD, 25));
		btn0.setBounds(110, 510, 190, 90);
		contentPane.add(btn0);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "9");
			}
		});
		btn9.setBackground(Color.WHITE);
		btn9.setFont(new Font("Arial", Font.BOLD, 25));
		btn9.setBounds(210, 210, 90, 90);
		contentPane.add(btn9);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "6");
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Arial", Font.BOLD, 25));
		btn6.setBounds(210, 310, 90, 90);
		contentPane.add(btn6);

		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText(txtPantalla.getText() + "3");
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Arial", Font.BOLD, 25));
		btn3.setBounds(210, 410, 90, 90);
		contentPane.add(btn3);

		btnLimpiar = new JButton("C");
		btnLimpiar.setForeground(Color.BLACK);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
				n1 = 0;
				n2 = 0;
			}
		});
		btnLimpiar.setBackground(new Color(95, 158, 160));
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 25));
		btnLimpiar.setBounds(110, 110, 90, 90);
		contentPane.add(btnLimpiar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 464, 90);
		contentPane.add(scrollPane);

		txtPantalla = new JTextField();
		scrollPane.setViewportView(txtPantalla);
		txtPantalla.setBackground(Color.WHITE);
		txtPantalla.setEditable(false);
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Arial", Font.PLAIN, 40));
		txtPantalla.setColumns(10);
		txtPantalla.addKeyListener(this);

		btnBorrar = new JButton("‹");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPantalla.getText().equals("")) {

				} else {
					String cantidad = txtPantalla.getText().toString();
					cantidad = cantidad.substring(0, cantidad.length() - 1);
					txtPantalla.setText(cantidad);
				}

			}
		});
		btnBorrar.setForeground(Color.BLACK);
		btnBorrar.setFont(new Font("Arial", Font.BOLD, 30));
		btnBorrar.setBackground(new Color(95, 158, 160));
		btnBorrar.setBounds(210, 110, 90, 90);
		contentPane.add(btnBorrar);

		btnTema = new JButton("N");
		btnTema.setForeground(Color.BLACK);
		btnTema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (btnTema.getText().equals("N")) {
					contentPane.setBackground(Color.BLACK);
					btnTema.setText("B");

					btn0.setBackground(Color.BLACK);
					btn1.setBackground(Color.BLACK);
					btn2.setBackground(Color.BLACK);
					btn3.setBackground(Color.BLACK);
					btn4.setBackground(Color.BLACK);
					btn5.setBackground(Color.BLACK);
					btn6.setBackground(Color.BLACK);
					btn7.setBackground(Color.BLACK);
					btn8.setBackground(Color.BLACK);
					btn9.setBackground(Color.BLACK);

					btn0.setForeground(Color.WHITE);
					btn1.setForeground(Color.WHITE);
					btn2.setForeground(Color.WHITE);
					btn3.setForeground(Color.WHITE);
					btn4.setForeground(Color.WHITE);
					btn5.setForeground(Color.WHITE);
					btn6.setForeground(Color.WHITE);
					btn7.setForeground(Color.WHITE);
					btn8.setForeground(Color.WHITE);
					btn9.setForeground(Color.WHITE);

					btnMas.setBackground(new Color(0, 128, 128));
					btnMenos.setBackground(new Color(0, 128, 128));
					btnMultiplicar.setBackground(new Color(0, 128, 128));
					btnDividir.setBackground(new Color(0, 128, 128));
					btnPunto.setBackground(new Color(0, 128, 128));
					btnIgual.setBackground(new Color(0, 128, 128));
					btnLimpiar.setBackground(new Color(0, 128, 128));
					btnBorrar.setBackground(new Color(0, 128, 128));
					btnTema.setBackground(new Color(0, 128, 128));

					btnMas.setForeground(Color.BLACK);
					btnMenos.setForeground(Color.BLACK);
					btnMultiplicar.setForeground(Color.BLACK);
					btnDividir.setForeground(Color.BLACK);
					btnPunto.setForeground(Color.BLACK);
					btnIgual.setForeground(Color.BLACK);
					btnLimpiar.setForeground(Color.BLACK);
					btnBorrar.setForeground(Color.BLACK);
					btnTema.setForeground(Color.BLACK);

					txtPantalla.setBackground(Color.GRAY);
					txtPantalla.setForeground(Color.WHITE);

				} else {
					contentPane.setBackground(Color.WHITE);
					btnTema.setText("N");

					btn0.setBackground(Color.WHITE);
					btn1.setBackground(Color.WHITE);
					btn2.setBackground(Color.WHITE);
					btn3.setBackground(Color.WHITE);
					btn4.setBackground(Color.WHITE);
					btn5.setBackground(Color.WHITE);
					btn6.setBackground(Color.WHITE);
					btn7.setBackground(Color.WHITE);
					btn8.setBackground(Color.WHITE);
					btn9.setBackground(Color.WHITE);

					btn0.setForeground(Color.BLACK);
					btn1.setForeground(Color.BLACK);
					btn2.setForeground(Color.BLACK);
					btn3.setForeground(Color.BLACK);
					btn4.setForeground(Color.BLACK);
					btn5.setForeground(Color.BLACK);
					btn6.setForeground(Color.BLACK);
					btn7.setForeground(Color.BLACK);
					btn8.setForeground(Color.BLACK);
					btn9.setForeground(Color.BLACK);

					btnMas.setBackground(new Color(95, 158, 160));
					btnMenos.setBackground(new Color(95, 158, 160));
					btnMultiplicar.setBackground(new Color(95, 158, 160));
					btnDividir.setBackground(new Color(95, 158, 160));
					btnPunto.setBackground(new Color(95, 158, 160));
					btnIgual.setBackground(new Color(95, 158, 160));
					btnLimpiar.setBackground(new Color(95, 158, 160));
					btnBorrar.setBackground(new Color(95, 158, 160));
					btnTema.setBackground(new Color(95, 158, 160));

					btnMas.setForeground(Color.BLACK);
					btnMenos.setForeground(Color.BLACK);
					btnMultiplicar.setForeground(Color.BLACK);
					btnDividir.setForeground(Color.BLACK);
					btnPunto.setForeground(Color.BLACK);
					btnIgual.setForeground(Color.BLACK);
					btnLimpiar.setForeground(Color.BLACK);
					btnBorrar.setForeground(Color.BLACK);
					btnTema.setForeground(Color.BLACK);

					txtPantalla.setBackground(Color.WHITE);
					txtPantalla.setForeground(Color.BLACK);
				}

			}
		});
		btnTema.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 25));
		btnTema.setBackground(new Color(95, 158, 160));
		btnTema.setBounds(10, 110, 90, 90);
		contentPane.add(btnTema);

	}

	public String respuestaSinCero(float resultado) {
		String retorno = "";
		retorno = Float.toString(resultado);
		if (resultado % 1 == 0) {
			retorno = retorno.substring(0, retorno.length() - 2);
		}
		return retorno;

	}

	private void close() {
		if (JOptionPane.showConfirmDialog(rootPane, "¿Desea cerrar la calculadora?", "",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
			System.exit(0);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		if (key == KeyEvent.VK_0) {

			txtPantalla.setText(txtPantalla.getText() + "0");
		}

		if (key == KeyEvent.VK_NUMPAD0) {

			txtPantalla.setText(txtPantalla.getText() + "0");
		}

		if (key == KeyEvent.VK_1) {

			txtPantalla.setText(txtPantalla.getText() + "1");
		}

		if (key == KeyEvent.VK_NUMPAD1) {

			txtPantalla.setText(txtPantalla.getText() + "1");
		}

		if (key == KeyEvent.VK_2) {

			txtPantalla.setText(txtPantalla.getText() + "2");
		}

		if (key == KeyEvent.VK_NUMPAD2) {

			txtPantalla.setText(txtPantalla.getText() + "2");
		}

		if (key == KeyEvent.VK_3) {

			txtPantalla.setText(txtPantalla.getText() + "3");
		}

		if (key == KeyEvent.VK_NUMPAD3) {

			txtPantalla.setText(txtPantalla.getText() + "3");
		}

		if (key == KeyEvent.VK_4) {

			txtPantalla.setText(txtPantalla.getText() + "4");
		}

		if (key == KeyEvent.VK_NUMPAD4) {

			txtPantalla.setText(txtPantalla.getText() + "4");
		}

		if (key == KeyEvent.VK_5) {

			txtPantalla.setText(txtPantalla.getText() + "5");
		}

		if (key == KeyEvent.VK_NUMPAD5) {

			txtPantalla.setText(txtPantalla.getText() + "5");
		}

		if (key == KeyEvent.VK_6) {

			txtPantalla.setText(txtPantalla.getText() + "6");
		}

		if (key == KeyEvent.VK_NUMPAD6) {

			txtPantalla.setText(txtPantalla.getText() + "6");
		}

		if (key == KeyEvent.VK_7) {

			txtPantalla.setText(txtPantalla.getText() + "7");
		}

		if (key == KeyEvent.VK_NUMPAD7) {

			txtPantalla.setText(txtPantalla.getText() + "7");
		}

		if (key == KeyEvent.VK_8) {

			txtPantalla.setText(txtPantalla.getText() + "8");
		}

		if (key == KeyEvent.VK_NUMPAD8) {

			txtPantalla.setText(txtPantalla.getText() + "8");
		}

		if (key == KeyEvent.VK_9) {

			txtPantalla.setText(txtPantalla.getText() + "9");
		}

		if (key == KeyEvent.VK_NUMPAD9) {

			txtPantalla.setText(txtPantalla.getText() + "9");
		}

		if (key == KeyEvent.VK_ADD) {

			if (txtPantalla.getText().equals("")) {

			} else {
				n1 = Float.parseFloat(txtPantalla.getText().toString());
				operador = "+";
				txtPantalla.setText("");
			}
		}

		if (key == KeyEvent.VK_SUBTRACT) {

			if (txtPantalla.getText().equals("")) {

			} else {
				n1 = Float.parseFloat(txtPantalla.getText().toString());
				operador = "-";
				txtPantalla.setText("");
			}
		}

		if (key == KeyEvent.VK_MULTIPLY) {

			if (txtPantalla.getText().equals("")) {

			} else {
				n1 = Float.parseFloat(txtPantalla.getText().toString());
				operador = "*";
				txtPantalla.setText("");
			}
		}

		if (key == KeyEvent.VK_DIVIDE) {

			if (txtPantalla.getText().equals("")) {

			} else {
				n1 = Float.parseFloat(txtPantalla.getText().toString());
				operador = "/";
				txtPantalla.setText("");
			}
		}

		if (key == KeyEvent.VK_DELETE) {

			txtPantalla.setText("");
			n1 = 0;
			n2 = 0;
		}

		if (key == KeyEvent.VK_BACK_SPACE) {

			if (txtPantalla.getText().equals("")) {

			} else {
				String cantidad = txtPantalla.getText().toString();
				cantidad = cantidad.substring(0, cantidad.length() - 1);
				txtPantalla.setText(cantidad);
			}
		}
		
		if (key == KeyEvent.VK_DECIMAL) {

			if (!txtPantalla.getText().toString().contains(".")) {
				txtPantalla.setText(txtPantalla.getText() + ".");
			}
		}

		if (key == KeyEvent.VK_EQUALS) {

			n2 = Float.parseFloat(txtPantalla.getText().toString());

			switch (operador) {
			case "+":
				txtPantalla.setText(respuestaSinCero(n1 + n2));

				break;
			case "-":
				txtPantalla.setText(respuestaSinCero(n1 - n2));

				break;
			case "*":
				txtPantalla.setText(respuestaSinCero(n1 * n2));

				break;
			case "/":
				if (n2 == 0) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
					txtPantalla.setText("");
					n1 = 0;
					n2 = 0;
				} else {
					txtPantalla.setText(respuestaSinCero(n1 / n2));
				}

				break;

			}
		}

		if (key == KeyEvent.VK_ENTER) {

			n2 = Float.parseFloat(txtPantalla.getText().toString());

			switch (operador) {
			case "+":
				txtPantalla.setText(respuestaSinCero(n1 + n2));

				break;
			case "-":
				txtPantalla.setText(respuestaSinCero(n1 - n2));

				break;
			case "*":
				txtPantalla.setText(respuestaSinCero(n1 * n2));

				break;
			case "/":
				if (n2 == 0) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
					txtPantalla.setText("");
					n1 = 0;
					n2 = 0;
				} else {
					txtPantalla.setText(respuestaSinCero(n1 / n2));
				}

				break;

			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

}
