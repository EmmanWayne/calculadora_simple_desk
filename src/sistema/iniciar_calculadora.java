package sistema;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import ventana.ventana_calculadora;

public class iniciar_calculadora {

	public static void main(String[] args) {

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}

		try {
			ventana_calculadora calculadora = new ventana_calculadora();
			calculadora.setVisible(true);
			calculadora.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
