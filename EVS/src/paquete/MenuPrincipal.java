package paquete;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipal extends JFrame{

	JButton buttonGobernacion, buttonPlebiscito, buttonComisionado,buttonMisVotos;
	JLabel labelMenu,labelColor,fondo;
	JPanel panel;
	
	//este constructor da las caracteristicas a la ventana
	public MenuPrincipal() {
		setSize(700,435);
		setTitle("Elecciones 2020");
		//para que la ventana siempre salga en el centro de la pantalla
		setLocationRelativeTo(null);
		//Para que el programa termine al presionar exit (x)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		components();
	}
	
	//con este metodo pongo los botones, panel y labels para esta ventana
	private void components() {
		panels();
		buttons();
		labels();
	}
	
	//metodo para declarar y definir como sera el panel
	private void panels() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		this.getContentPane().add(panel);
	}
	
	//metodo para añadir los botones
	private void buttons() {
		buttonGobernacion = new JButton("Gobernacion");
		buttonGobernacion.setBounds(455,110,180,30);
		panel.add(buttonGobernacion);
		
		buttonComisionado = new JButton("Comisionado Residente");
		buttonComisionado.setBounds(455,180,180,30);
		panel.add(buttonComisionado);
		
		buttonPlebiscito = new JButton("Plebiscito");
		buttonPlebiscito.setBounds(455,250,180,30);
		panel.add(buttonPlebiscito);
		
		buttonMisVotos = new JButton("Revisar mis votos");
		buttonMisVotos.setBounds(455,320,180,30);
		panel.add(buttonMisVotos);
		
		listeners();
	}
	
	//metodo para añadir los labels
	private void labels() {
		
		fondo = new JLabel(new ImageIcon("mD2snGUO_400x400.jpg"));
		fondo.setBounds(0,0,400,400);
		panel.add(fondo);
		
		labelColor = new JLabel();
		labelColor.setBounds(0,0,400,400);
		labelColor.setBackground(Color.YELLOW);
		panel.add(labelColor);
		
		labelMenu = new JLabel("Menu de Opciones");
		labelMenu.setBounds(495,60,160,30);
		panel.add(labelMenu);
	}
	
	//en este metodo tengo los action listener de todos los botones
	private void listeners() {
		
		Gobernacion objGobe = new Gobernacion();
		Comisionado objComi = new Comisionado();
		Plebiscito objPleb = new Plebiscito();
		ResultadosUser UserResult = new ResultadosUser();

		//con estos action listeners abro las ventanas que el 
		//usuario escoja entre gobernacion, comisaria y plebiscito
		
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				objGobe.setVisible(true);
			}
		};buttonGobernacion.addActionListener(listener1);
		
		
		
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				objComi.setVisible(true);
			}
		};buttonComisionado.addActionListener(listener2);

		
		
		ActionListener listener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				objPleb.setVisible(true);
			}
		};buttonPlebiscito.addActionListener(listener3);
		
		
		ActionListener listener4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				UserResult.setVisible(true);
			}
		};buttonMisVotos.addActionListener(listener4);
	}
}
