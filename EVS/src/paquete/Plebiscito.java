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

public class Plebiscito extends JFrame{

	public static String nPlebi;
	JPanel panel;
	JButton buttonEnter,buttonBack;
	JLabel Foto1,Foto2,labelCandidatos,candidato,fondo,candidatoEscogido,si,no,fotoPlebi;
	JRadioButton rButton1,rButton2;
	
	//aqui determino como quiero que se vea la ventana del plebiscito
	public Plebiscito() {
		setSize(700,435);
		setTitle("Elecciones 2020");
		//para que la ventana siempre salga en el centro de la pantalla
		setLocationRelativeTo(null);
		//Para que el programa termine al presionar exit (x)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		components();
	}
	
	//pongo todos los metodos que añaden los componentes de esta ventana
	public void components() {
		panels();
		buttons();
		labels();
		radioButton();
	}
	
	//añado el panel de la ventana
	private void panels() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		this.getContentPane().add(panel);
	}
	
	//añado el boton para someter los datos 
	private void buttons() {
		buttonEnter = new JButton("Someter");
		buttonEnter.setBounds(500,300,135,30);
		panel.add(buttonEnter);
		
		//aqui llamo el metodo listener que le da accion al boton
		listeners();
	}

	//aqui pongo las fotos y palabras
	private void labels() {
		labelCandidatos = new JLabel("Plebiscito");
		labelCandidatos.setBounds(90,150,150,70);
		panel.add(labelCandidatos);
		
		Foto1 = new JLabel(new ImageIcon("si.jpg"));
		Foto1.setBounds(260,200,70,70);
		panel.add(Foto1);
		
		Foto2 = new JLabel(new ImageIcon("no.jpg"));
		Foto2.setBounds(350,200,70,70);
		panel.add(Foto2);
		
		candidato = new JLabel();
		candidato.setBounds(500,160,150,70);
		panel.add(candidato);
		
		fondo = new JLabel();
		fondo.setBounds(0,0,250,400);
		fondo.setBackground(Color.yellow);
		fondo.setOpaque(true);
		panel.add(fondo);
		
		candidatoEscogido = new JLabel("Estatus Seleccionado: ");
		candidatoEscogido.setBounds(500,140,150,70);
		panel.add(candidatoEscogido);
		
		si = new JLabel("Si");
		si.setBounds(285,150,70,70);
		panel.add(si);
		
		no = new JLabel("No");
		no.setBounds(375,150,70,70);
		panel.add(no);
		
		fotoPlebi = new JLabel(new ImageIcon("plebiscito1.jpg"));
		fotoPlebi.setBounds(100,-40,500,274);
		panel.add(fotoPlebi);
	}
	
	//aqui pongo los radio botones
	private void radioButton() {
		rButton1 = new JRadioButton();
		rButton1.setBounds(285,280,20,20);
		panel.add(rButton1);
		
		rButton2 = new JRadioButton();
		rButton2.setBounds(375,280,20,20);
		panel.add(rButton2);
		
		//con esto hago que estos radio botones funcionen como uno 
		//solo y no se pueda escoger mas de una opcion
		ButtonGroup Rbotones = new ButtonGroup();
		Rbotones.add(rButton1);
		Rbotones.add(rButton2);
		
		//llamo el metodo que le da las acciones a los radio botones
		rButtonslistener();
	}

	//este es el metodo que le da funcion a los radio botones
	public void rButtonslistener() {
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nPlebi = "Si";
				candidato.setText(nPlebi);
			}
		};rButton1.addActionListener(listener1);
		
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				nPlebi = "No";
				candidato.setText(nPlebi);
			}
		};rButton2.addActionListener(listener2);
	}
	
	//este metodo tiene la misma utilidad que un getter
	public String result() {
		return nPlebi;
	}
	
	//este es el metodo que le da funcion al boton de someter
	private void listeners() {
		
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				MenuPrincipal obj = new MenuPrincipal();
				obj.setVisible(true);
			}
		};buttonEnter.addActionListener(listener1);
	}
}
