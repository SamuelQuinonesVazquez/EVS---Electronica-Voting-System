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
import javax.swing.JTextField;

public class Gobernacion extends JFrame{
	
	public static String nGobe;
	String variableQueGuarda;
	JTextField texto;
	JPanel panel;
	JButton buttonEnter,buttonBack;
	JLabel Foto1,Foto2,Foto3,Foto4,Foto5,Foto6,labelCandidatos,candidatoEscogido,candidato,fondo;
	JRadioButton rButton1,rButton2,rButton3,rButton4,rButton5,rButton6;
	
	//en este constructor proporciono las cualidaddes de esta ventana
	public Gobernacion() {
		setSize(700,435);
		setTitle("Elecciones 2020");
		//para que la ventana siempre salga en el centro de la pantalla
		setLocationRelativeTo(null);
		//Para que el programa termine al presionar exit (x)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		components();
	}
	
	//aqui añado todos los componentes como 
	//panel, labels, botones y RadioBotones
	public void components() {
		panels();
		buttons();
		labels();
		radioButton();
	}
	
	//pongo este panel para que todo vaya encima de el
	private void panels() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		this.getContentPane().add(panel);
	}
	
	//añado los botones al panel
	private void buttons() {
		buttonEnter = new JButton("Someter");
		buttonEnter.setBounds(500,300,135,30);
		panel.add(buttonEnter);
		
		listenerDeEnter();
	}

	//aqui pongo todos las fotos de los candidatos y 
	//tambien pongo las palabras encima del panel
	private void labels() {
		labelCandidatos = new JLabel("GOBERNACION");
		labelCandidatos.setBounds(85,150,150,70);
		panel.add(labelCandidatos);
		
		Foto1 = new JLabel(new ImageIcon("Pedro_Rafael_Pierluisi_Urrutia_6333.jpg"));
		Foto1.setBounds(260,40,70,70);
		panel.add(Foto1);
		
		Foto2 = new JLabel(new ImageIcon("Carlos_Delgado_Altieri_6162.jpg"));
		Foto2.setBounds(350,40,70,70);
		panel.add(Foto2);
		
		Foto3 = new JLabel(new ImageIcon("Juan_Manuel_Dalmau_Ramirez_8321.jpg"));
		Foto3.setBounds(260,160,70,70);
		panel.add(Foto3);
		
		Foto4 = new JLabel(new ImageIcon("Alexandra_Lugaro_Aponte_5274.jpg"));
		Foto4.setBounds(350,160,70,70);
		panel.add(Foto4);
		
		Foto5 = new JLabel(new ImageIcon("Cesar_Augusto_Vazquez_Muñiz_9390.jpg"));
		Foto5.setBounds(260,280,70,70);
		panel.add(Foto5);
		
		Foto6 = new JLabel(new ImageIcon("Eliezer_Molina_Perez_7119.jpg"));
		Foto6.setBounds(350,280,70,70);
		panel.add(Foto6);
		
		candidatoEscogido = new JLabel("Candidato Seleccionado: ");
		candidatoEscogido.setBounds(500,140,150,70);
		panel.add(candidatoEscogido);
		
		candidato = new JLabel();
		candidato.setBounds(500,160,150,70);
		panel.add(candidato);
		
		/*new ImageIcon("Screenshot(107).jpg")*/
		
		fondo = new JLabel();
		fondo.setBounds(0,0,250,400);
		fondo.setBackground(Color.yellow);
		fondo.setOpaque(true);
		panel.add(fondo);
	}
	
	//en este metodo tengo todos los botones
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
		
		rButton6 = new JRadioButton();
		rButton6.setBounds(375,355,20,20);
		panel.add(rButton6);
		
		//esto hace que se cree un grupo de botones y solo se pueda escoger una opcion
		ButtonGroup Rbotones = new ButtonGroup();
		Rbotones.add(rButton1);
		Rbotones.add(rButton2);
		Rbotones.add(rButton3);
		Rbotones.add(rButton4);
		Rbotones.add(rButton5);
		Rbotones.add(rButton6);
		
		//con esto le doy utilidad a los botones
		rButtonslistener();
	}
	
	//este es el metodo que le da accion a los rButtons
	public void rButtonslistener() {

		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nGobe = "Pedro Pierluisi";
				candidato.setText(nGobe);
			}
		};rButton1.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nGobe = "Carlos Delgado";
				candidato.setText(nGobe);
			}
		};rButton2.addActionListener(listener2);
		
		ActionListener listener3 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nGobe = "Juan Dalmau";
				candidato.setText(nGobe);
			}
		};rButton3.addActionListener(listener3);
		
		ActionListener listener4 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nGobe = "Alexandra Lugaro";
				candidato.setText(nGobe);
			}
		};rButton4.addActionListener(listener4);
		
		ActionListener listener5 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nGobe = "Cesar Vazquez";
				candidato.setText(nGobe);
			}
		};rButton5.addActionListener(listener5);
		
		ActionListener listener6 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nGobe = "Eliezer Molina";
				candidato.setText(nGobe);
			}
		};rButton6.addActionListener(listener6);
	}	
	
	public String result() {
		return nGobe;
	}
	
	//tengo este metodo con el listener del boton de enter 
	//para que no me de errores con los radio botones
	public void listenerDeEnter() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) { 
				variableQueGuarda = nGobe;
				MenuPrincipal obj = new MenuPrincipal();
				obj.setVisible(true);
			}
		};buttonEnter.addActionListener(listener);
	}
}
