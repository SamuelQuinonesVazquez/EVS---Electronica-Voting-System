package paquete;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Comisionado extends JFrame{

	private static String nComi;
	JPanel panel;
	JButton buttonEnter,buttonBack;
	JLabel Foto1,Foto2,Foto3,Foto4,Foto5,labelCandidatos,candidato,candidatoEscogido,fondo;
	JRadioButton rButton1,rButton2,rButton3,rButton4,rButton5,rButton6;

	//en este constructor pongo las cualidades que tendrá esta ventana
	public Comisionado() {
		setSize(700,435);
		setTitle("Elecciones 2020");
		//para que la ventana siempre salga en el centro de la pantalla
		setLocationRelativeTo(null);
		//Para que el programa termine al presionar exit (x)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		components();
	}
	
	//aqui llamo todos los componentes que van en esta ventana
	public void components() {
		panels();
		buttons();
		labels();
		radioButton();
	}
	
	//uso este panel para poder poner encima los elementos
	private void panels() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		this.getContentPane().add(panel);
	}
	
	//en este metodo añado los botones
	private void buttons() {
		buttonEnter = new JButton("Someter");
		buttonEnter.setBounds(500,300,135,30);
		panel.add(buttonEnter);
		
		//aqui llamo el metodo listener para que este boton lo use
		listeners();
	}

	//aqui pongo las fotos y palabras que el usuario verá
	private void labels() {
		labelCandidatos = new JLabel("COMISARIA RESIDENTE");
		labelCandidatos.setBounds(60,150,150,70);
		panel.add(labelCandidatos);
		
		Foto1 = new JLabel(new ImageIcon("Ada_Norah_Henriquez_0485.jpg"));
		Foto1.setBounds(260,40,70,70);
		panel.add(Foto1);
		
		Foto2 = new JLabel(new ImageIcon("Anibal_Salvador_Acevedo_Vila_9632.jpg"));
		Foto2.setBounds(350,40,70,70);
		panel.add(Foto2);
		
		Foto3 = new JLabel(new ImageIcon("Jenniffer_Aidyn_Gonzalez_Colon_7210.jpg"));
		Foto3.setBounds(260,160,70,70);
		panel.add(Foto3);
		
		Foto4 = new JLabel(new ImageIcon("Luis_Roberto_Piñero_Gonzalez_7003.jpg"));
		Foto4.setBounds(350,160,70,70);
		panel.add(Foto4);
		
		Foto5 = new JLabel(new ImageIcon("Zayira_Jordan_Conde_5900.jpg"));
		Foto5.setBounds(260,280,70,70);
		panel.add(Foto5);
		
		candidatoEscogido = new JLabel("Candidato Seleccionado: ");
		candidatoEscogido.setBounds(500,140,150,70);
		panel.add(candidatoEscogido);
		
		candidato = new JLabel();
		candidato.setBounds(500,160,150,70);
		panel.add(candidato);
		
		fondo = new JLabel();
		fondo.setBounds(0,0,250,400);
		fondo.setBackground(Color.yellow);
		fondo.setOpaque(true);
		panel.add(fondo);
	}
	
	//los radiobotones son mejores para este tipo de programa
	private void radioButton() {
		rButton1 = new JRadioButton();
		rButton1.setBounds(285,115,20,20);
		panel.add(rButton1);
		
		rButton2 = new JRadioButton();
		rButton2.setBounds(375,115,20,20);
		panel.add(rButton2);
		
		rButton3 = new JRadioButton();
		rButton3.setBounds(285,235,20,20);
		panel.add(rButton3);
		
		rButton4 = new JRadioButton();
		rButton4.setBounds(375,235,20,20);
		panel.add(rButton4);
		
		rButton5 = new JRadioButton();
		rButton5.setBounds(285,355,20,20);
		panel.add(rButton5);
		
		//hago un grupo de botones para que solo 
		//se pueda escoger entre uno de ellos
		ButtonGroup Rbotones = new ButtonGroup();
		Rbotones.add(rButton1);
		Rbotones.add(rButton2);
		Rbotones.add(rButton3);
		Rbotones.add(rButton4);
		Rbotones.add(rButton5);
		Rbotones.add(rButton6);
		
		//llamo el metodo que le da funcion a los radiobotones
		rButtonslistener();
	}
	
	//este metodo es igual a un metodo getter 
	public String result() {
		return nComi;
	}
	
	//aqui le doy funcion a el boton de enter
	public void listeners() {
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				MenuPrincipal obj = new MenuPrincipal();
				obj.setVisible(true);
				/*
				Plebiscito PlebiscitoMenu = new Plebiscito();
				PlebiscitoMenu.setVisible(true);
				*/
			}
		};
		buttonEnter.addActionListener(listener);
	}

	//en este metodo le doy accion a los radio botones que el usuario escoge
	public void rButtonslistener() {

		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nComi = "Ada Norah";
				candidato.setText(nComi);
			}
		};rButton1.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nComi = "Anibal Acevedo";
				candidato.setText(nComi);
			}
		};rButton2.addActionListener(listener2);
		
		ActionListener listener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nComi = "Jennifer Gonzalez";
				candidato.setText(nComi);
			}
		};rButton3.addActionListener(listener3);
		
		ActionListener listener4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nComi = "Luis Pineiro";
				candidato.setText(nComi);
			}
		};rButton4.addActionListener(listener4);
		
		ActionListener listener5 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nComi = "Zayira Jordan";
				candidato.setText(nComi);
			}
		};rButton5.addActionListener(listener5);
	}
}
