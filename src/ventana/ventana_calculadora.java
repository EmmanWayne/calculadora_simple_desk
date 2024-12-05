package ventana;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.KeyListener;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	public String num1;
	public String num2;
	public String operador;
	public JTextField txtOperacion;
	private JLabel lblLogo;

	public ventana_calculadora() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(ventana_calculadora.class.getResource("/recursos/icono_calculadora.png")));
		final ImageIcon logo = new ImageIcon(getClass().getResource("/recursos/icono_calculadora.png"));
		setBounds(100, 100, 496, 737);
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(8, 104, 466, 84);
		contentPane.add(scrollPane);

		txtPantalla = new JTextField();
		scrollPane.setViewportView(txtPantalla);
		txtPantalla.setBackground(Color.WHITE);
		txtPantalla.setEditable(false);
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		txtPantalla.setColumns(10);
		txtPantalla.addKeyListener(this);

		btnMas = new JButton("+");
		btnMas.setForeground(Color.BLACK);
		btnMas.setBackground(new Color(0, 139, 139));
		btnMas.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btnMas.setBounds(308, 198, 166, 90);
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sumar();
			}
		});
		contentPane.add(btnMas);

		btnMenos = new JButton("-");
		btnMenos.setForeground(Color.BLACK);
		btnMenos.setBackground(new Color(0, 139, 139));
		btnMenos.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btnMenos.setBounds(308, 298, 166, 90);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restar();
			}
		});
		contentPane.add(btnMenos);

		btnMultiplicar = new JButton("*");
		btnMultiplicar.setForeground(Color.BLACK);
		btnMultiplicar.setBackground(new Color(0, 139, 139));
		btnMultiplicar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btnMultiplicar.setBounds(308, 398, 166, 90);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplicar();
			}
		});
		contentPane.add(btnMultiplicar);

		btnDividir = new JButton("/");
		btnDividir.setForeground(Color.BLACK);
		btnDividir.setBackground(new Color(0, 139, 139));
		btnDividir.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 45));
		btnDividir.setBounds(308, 498, 166, 90);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dividir();
			}
		});
		contentPane.add(btnDividir);

		btnIgual = new JButton("=");
		btnIgual.setForeground(Color.BLACK);
		btnIgual.setBackground(new Color(0, 139, 139));
		btnIgual.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btnIgual.setBounds(308, 598, 166, 90);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtPantalla.getText().equals("")) {
					txtPantalla.requestFocus();
				} else {
					igual();
				}

			}
		});
		contentPane.add(btnIgual);

		btn0 = new JButton("0");
		btn0.setBackground(Color.WHITE);
		btn0.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn0.setBounds(108, 598, 190, 90);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num0();
			}
		});
		contentPane.add(btn0);

		btn1 = new JButton("1");
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn1.setBounds(8, 498, 90, 90);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1();
			}
		});
		contentPane.add(btn1);

		btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn2.setBounds(108, 498, 90, 90);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2();
			}
		});
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn3.setBounds(208, 498, 90, 90);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num3();
			}
		});
		contentPane.add(btn3);

		btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn4.setBounds(8, 398, 90, 90);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num4();
			}
		});
		contentPane.add(btn4);

		btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn5.setBounds(108, 398, 90, 90);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num5();
			}
		});
		contentPane.add(btn5);

		btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn6.setBounds(208, 398, 90, 90);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num6();
			}
		});
		contentPane.add(btn6);

		btn7 = new JButton("7");
		btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn7.setBounds(8, 298, 90, 90);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num7();
			}
		});
		contentPane.add(btn7);

		btn8 = new JButton("8");
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn8.setBounds(108, 298, 90, 90);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num8();
			}
		});
		contentPane.add(btn8);

		btn9 = new JButton("9");
		btn9.setBackground(Color.WHITE);
		btn9.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btn9.setBounds(208, 298, 90, 90);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num9();
			}
		});
		contentPane.add(btn9);

		btnPunto = new JButton(".");
		btnPunto.setForeground(Color.BLACK);
		btnPunto.setBackground(new Color(0, 139, 139));
		btnPunto.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btnPunto.setBounds(8, 598, 90, 90);
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				punto();
			}
		});
		contentPane.add(btnPunto);

		btnLimpiar = new JButton("C");
		btnLimpiar.setForeground(Color.BLACK);
		btnLimpiar.setBackground(new Color(0, 139, 139));
		btnLimpiar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btnLimpiar.setBounds(108, 198, 90, 90);
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		contentPane.add(btnLimpiar);

		btnBorrar = new JButton("‹");
		btnBorrar.setForeground(Color.BLACK);
		btnBorrar.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 80));
		btnBorrar.setBackground(new Color(0, 139, 139));
		btnBorrar.setBounds(208, 198, 90, 90);
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrar();
			}
		});
		contentPane.add(btnBorrar);

		btnTema = new JButton("N");
		btnTema.setForeground(Color.BLACK);
		btnTema.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 50));
		btnTema.setBackground(new Color(0, 139, 139));
		btnTema.setBounds(8, 198, 90, 90);
		btnTema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtPantalla.requestFocus();

				if (btnTema.getText().equals("N")) {
					contentPane.setBackground(Color.BLACK);
					btnTema.setText("B");

					btn0.setBackground(Color.DARK_GRAY);
					btn1.setBackground(Color.DARK_GRAY);
					btn2.setBackground(Color.DARK_GRAY);
					btn3.setBackground(Color.DARK_GRAY);
					btn4.setBackground(Color.DARK_GRAY);
					btn5.setBackground(Color.DARK_GRAY);
					btn6.setBackground(Color.DARK_GRAY);
					btn7.setBackground(Color.DARK_GRAY);
					btn8.setBackground(Color.DARK_GRAY);
					btn9.setBackground(Color.DARK_GRAY);

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

					btnMas.setBackground(new Color(0, 100, 0));
					btnMenos.setBackground(new Color(0, 100, 0));
					btnMultiplicar.setBackground(new Color(0, 100, 0));
					btnDividir.setBackground(new Color(0, 100, 0));
					btnPunto.setBackground(new Color(0, 100, 0));
					btnIgual.setBackground(new Color(0, 100, 0));
					btnLimpiar.setBackground(new Color(0, 100, 0));
					btnBorrar.setBackground(new Color(0, 100, 0));
					btnTema.setBackground(new Color(0, 100, 0));

					btnMas.setForeground(Color.WHITE);
					btnMenos.setForeground(Color.WHITE);
					btnMultiplicar.setForeground(Color.WHITE);
					btnDividir.setForeground(Color.WHITE);
					btnPunto.setForeground(Color.WHITE);
					btnIgual.setForeground(Color.WHITE);
					btnLimpiar.setForeground(Color.WHITE);
					btnBorrar.setForeground(Color.WHITE);
					btnTema.setForeground(Color.WHITE);

					txtPantalla.setBackground(Color.DARK_GRAY);
					txtPantalla.setForeground(Color.WHITE);

					txtOperacion.setBackground(Color.DARK_GRAY);
					txtOperacion.setForeground(Color.WHITE);

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

					btnMas.setBackground(new Color(0, 139, 139));
					btnMenos.setBackground(new Color(0, 139, 139));
					btnMultiplicar.setBackground(new Color(0, 139, 139));
					btnDividir.setBackground(new Color(0, 139, 139));
					btnPunto.setBackground(new Color(0, 139, 139));
					btnIgual.setBackground(new Color(0, 139, 139));
					btnLimpiar.setBackground(new Color(0, 139, 139));
					btnBorrar.setBackground(new Color(0, 139, 139));
					btnTema.setBackground(new Color(0, 139, 139));

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

					txtOperacion.setBackground(Color.WHITE);
					txtOperacion.setForeground(Color.BLACK);

				}

			}
		});
		contentPane.add(btnTema);

		lblLogo = new JLabel();
		lblLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana_acerca_de acercade = new ventana_acerca_de();
				acercade.setLocationRelativeTo(null);
				acercade.setVisible(true);
				dispose();
			}
		});
		lblLogo.setBackground(Color.WHITE);
		lblLogo.setBounds(8, 10, 90, 84);
		contentPane.add(lblLogo);
		final ImageIcon icono = new ImageIcon(
				logo.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
		lblLogo.setIcon(icono);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(108, 10, 364, 84);
		contentPane.add(scrollPane_1);

		txtOperacion = new JTextField();
		txtOperacion.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(txtOperacion);
		txtOperacion.setEditable(false);
		txtOperacion.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 40));
		txtOperacion.setHorizontalAlignment(SwingConstants.CENTER);
		txtOperacion.setColumns(10);

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

	public void sumar() {
		txtPantalla.requestFocus();
		if (txtPantalla.getText().equals("")) {
		} else {
			n1 = Float.parseFloat(txtPantalla.getText().toString());
			operador = "+";
			txtPantalla.setText("");

		}

	}

	public void restar() {
		txtPantalla.requestFocus();
		if (txtPantalla.getText().equals("")) {
		} else {
			n1 = Float.parseFloat(txtPantalla.getText().toString());
			operador = "-";
			txtPantalla.setText("");

		}
	}

	public void multiplicar() {
		txtPantalla.requestFocus();
		if (txtPantalla.getText().equals("")) {
		} else {
			n1 = Float.parseFloat(txtPantalla.getText().toString());
			operador = "*";
			txtPantalla.setText("");

		}
	}

	public void dividir() {
		txtPantalla.requestFocus();
		if (txtPantalla.getText().equals("")) {
		} else {
			n1 = Float.parseFloat(txtPantalla.getText().toString());
			operador = "/";
			txtPantalla.setText("");

		}
	}

	public void igual() {
		txtPantalla.requestFocus();
		n2 = Float.parseFloat(txtPantalla.getText().toString());
		switch (operador) {
		case "+":
			txtPantalla.setText(respuestaSinCero(n1 + n2));
			num1 = String.valueOf(respuestaSinCero(n1));
			num2 = String.valueOf(respuestaSinCero(n2));
			txtOperacion.setText(num1 + " + " + num2);
			break;
		case "-":
			txtPantalla.setText(respuestaSinCero(n1 - n2));
			num1 = String.valueOf(respuestaSinCero(n1));
			num2 = String.valueOf(respuestaSinCero(n2));
			txtOperacion.setText(num1 + " - " + num2);
			break;
		case "*":
			txtPantalla.setText(respuestaSinCero(n1 * n2));
			num1 = String.valueOf(respuestaSinCero(n1));
			num2 = String.valueOf(respuestaSinCero(n2));
			txtOperacion.setText(num1 + " * " + num2);
			break;
		case "/":
			if (n2 == 0) {
				JOptionPane.showMessageDialog(null, "No se puede dividir entre 0.");
				txtPantalla.setText("");
				n1 = 0;
				n2 = 0;
			} else {
				txtPantalla.setText(respuestaSinCero(n1 / n2));
				num1 = String.valueOf(respuestaSinCero(n1));
				num2 = String.valueOf(respuestaSinCero(n2));
				txtOperacion.setText(num1 + " / " + num2);

			}
			break;
		}
	}

	public void limpiar() {
		txtPantalla.requestFocus();
		txtPantalla.setText("");
		txtOperacion.setText("");
		n1 = 0;
		n2 = 0;
	}

	public void borrar() {
		txtPantalla.requestFocus();
		if (txtPantalla.getText().equals("")) {
		} else {
			String cantidad = txtPantalla.getText().toString();
			cantidad = cantidad.substring(0, cantidad.length() - 1);
			txtPantalla.setText(cantidad);
		}
	}

	public void num0() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "0");

	}

	public void num1() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "1");
	}

	public void num2() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "2");
	}

	public void num3() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "3");
	}

	public void num4() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "4");
	}

	public void num5() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "5");
	}

	public void num6() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "6");
	}

	public void num7() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "7");
	}

	public void num8() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "8");
	}

	public void num9() {
		txtPantalla.requestFocus();
		txtPantalla.setText(txtPantalla.getText() + "9");
	}

	public void punto() {
		txtPantalla.requestFocus();
		if (!txtPantalla.getText().toString().contains(".")) {
			txtPantalla.setText(txtPantalla.getText() + ".");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {

		char teclado = e.getKeyChar();

		if (teclado == KeyEvent.VK_0) {

			num0();
		}

		if (teclado == KeyEvent.VK_NUMPAD0) {

			num0();
		}

		if (teclado == KeyEvent.VK_1) {

			num1();
		}

		if (teclado == KeyEvent.VK_NUMPAD1) {

			num1();
		}

		if (teclado == KeyEvent.VK_2) {

			num2();
		}

		if (teclado == KeyEvent.VK_NUMPAD2) {

			num2();
		}

		if (teclado == KeyEvent.VK_3) {

			num3();
		}

		if (teclado == KeyEvent.VK_NUMPAD3) {

			num3();
		}

		if (teclado == KeyEvent.VK_4) {

			num4();
		}

		if (teclado == KeyEvent.VK_NUMPAD4) {

			num4();
		}

		if (teclado == KeyEvent.VK_5) {

			num5();
		}

		if (teclado == KeyEvent.VK_NUMPAD5) {

			num5();
		}

		if (teclado == KeyEvent.VK_6) {

			num6();
		}

		if (teclado == KeyEvent.VK_NUMPAD6) {

			num6();
		}

		if (teclado == KeyEvent.VK_7) {

			num7();
		}

		if (teclado == KeyEvent.VK_NUMPAD7) {

			num7();
		}

		if (teclado == KeyEvent.VK_8) {

			num8();
		}

		if (teclado == KeyEvent.VK_NUMPAD8) {

			num8();
		}

		if (teclado == KeyEvent.VK_9) {

			num9();
		}

		if (teclado == KeyEvent.VK_NUMPAD9) {

			num9();
		}

		if (teclado == KeyEvent.VK_ADD) {

			sumar();
		}

		if (teclado == KeyEvent.VK_SUBTRACT) {
			restar();
		}

		if (teclado == KeyEvent.VK_MULTIPLY) {
			dividir();
		}

		if (teclado == KeyEvent.VK_DIVIDE) {
			dividir();
		}

		if (teclado == KeyEvent.VK_DELETE) {
			limpiar();
		}

		if (teclado == KeyEvent.VK_BACK_SPACE) {
			borrar();
		}

		if (teclado == KeyEvent.VK_DECIMAL) {
			punto();
		}

		if (teclado == KeyEvent.VK_EQUALS) {
			igual();
		}

		if (teclado == KeyEvent.VK_ENTER) {
			igual();
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
