package paquete;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	
	private JPanel panel;
	private JLabel labelLogin,fondo,labelLogin2;
	private JButton buttonLogin;
	private JTextField textField;
	private JPasswordField textField2;
	public static int numeroE,password;

	
	//este constructor da las caracteristicas a la ventana
	public Login() {
		setSize(700,435);
		setTitle("Elecciones 2020");
		//para que la ventana siempre salga en el centro de la pantalla
		setLocationRelativeTo(null);
		//Para que el programa termine al presionar exit (x)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		components();
	}
	
	//aqui entran todos los componentos que lleva la ventana
	public void components() {
		panels();
		labels();
		buttons();
		textFields();
	}
	
	//encima del panel ponemos todo como los botones, labels y textfields
	private void panels() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		this.getContentPane().add(panel);
	}
	
	//en este metodo declaro los botones de entrar y resultados finales
	private void buttons() {
		buttonLogin = new JButton("Entrar");
		buttonLogin.setBounds(480,250,120,30);
		panel.add(buttonLogin);
		
		listeners();
	}
	
	//aqui añado los mensajes encima del panel y las fotos
	private void labels() {
		
		fondo = new JLabel(new ImageIcon("mD2snGUO_400x400.jpg"));
		fondo.setBounds(0,0,400,400);
		panel.add(fondo);
		
		labelLogin = new JLabel("Entre su Numero Electoral");
		labelLogin.setBounds(465,110,200,30);
		panel.add(labelLogin);
		
		labelLogin2 = new JLabel("     Entre su Contraseña");
		labelLogin2.setBounds(465,170,200,30);
		panel.add(labelLogin2);
	}
	
	//en este metodo pongo el textfield que recoge el numero del usuario
	public void textFields() {
		textField = new JTextField();
		textField.setBounds(480,140,120,30);
		panel.add(textField);
		
		textField2 = new JPasswordField();
		textField2.setBounds(480,200,120,30);
		panel.add(textField2);
	}
	
	//en este metodo guardo todas las acciones, la del boton de login y el de resultados finales
	public void listeners() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {

				numeroE = Integer.parseInt(textField.getText());
				password = Integer.parseInt(textField2.getText());
				MenuPrincipal objMenu = new MenuPrincipal();

				//verifica que el usuario exista
				if(numeroE == 1111 && password == 1111 ||
				   numeroE == 1112 && password == 1112 ||
				   numeroE == 1113 && password == 1113 ||
				   numeroE == 1114 && password == 1114 ||
				   numeroE == 1115 && password == 1115 ||
				   numeroE == 1116 && password == 1116){
					objMenu.setVisible(true);
				}
			}
		};
		
		//todo lo de arriba va a suceder si se presiona el boton buttonLogin
		buttonLogin.addActionListener(listener);
	}
}
