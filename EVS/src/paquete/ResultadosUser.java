package paquete;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ResultadosUser extends JFrame {
	
	JPanel panel;
	JLabel labelLogin,fondo,labelResultadoGobe,labelResultadoComi,labelResultadoPlebi,label1,label2,label3;
	JButton buttonSalir;
	JTextField numElectoral;
	
	//aqui le doy las cualidades a la ventana
	public ResultadosUser() {
		setSize(700,435);
		setTitle("Elecciones 2020");
		//para que la ventana siempre salga en el centro de la pantalla
		setLocationRelativeTo(null);
		//Para que el programa termine al presionar exit (x)
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		components();
	}
	
	//aqui pongo los componentes de la ventana
	public void components() {
		panels();
		labels();
		buttons();
	}
	
	//añado el panel
	private void panels() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.gray);
		this.getContentPane().add(panel);
	}
	
	//pongo este boton para salir de este menu y 
	//tambien cerrar la navegacion con ese usuario
	private void buttons() {
		buttonSalir = new JButton("Salir");
		buttonSalir.setBounds(480,330,120,30);
		panel.add(buttonSalir);
		
		listeners();
	}
	
	//aqui pongo fotos y mensajes
	private void labels() {
		
		fondo = new JLabel(new ImageIcon("mD2snGUO_400x400.jpg"));
		fondo.setBounds(0,0,400,400);
		panel.add(fondo);
		
		labelLogin = new JLabel("               SUS VOTOS:");
		labelLogin.setBounds(465,110,200,30);
		panel.add(labelLogin);
		
		Gobernacion resultGobe = new Gobernacion();
		Comisionado resultComi = new Comisionado();
		Plebiscito resultPlebi = new Plebiscito();
		
		label1 = new JLabel("Gobernador: ");
		label1.setBounds(465,150,200,30);
		panel.add(label1);
		
		labelResultadoGobe = new JLabel(resultGobe.result());
		labelResultadoGobe.setBounds(465,165,200,30);
		panel.add(labelResultadoGobe);
		
		label2 = new JLabel("Comisionado Residente: ");
		label2.setBounds(465,200,200,30);
		panel.add(label2);
		
		labelResultadoComi = new JLabel(resultComi.result());
		labelResultadoComi.setBounds(465,215,200,30);
		panel.add(labelResultadoComi);
		
		label3 = new JLabel("Plebiscito (Estadidad Si o No): ");
		label3.setBounds(465,250,200,30);
		panel.add(label3);
		
		labelResultadoPlebi = new JLabel(resultPlebi.result());
		labelResultadoPlebi.setBounds(465,265,200,30);
		panel.add(labelResultadoPlebi);
	}
	
	//le da la funcion al boton de salir
	private void listeners() {
		
		ActionListener listener1 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				Login obj = new Login();
				obj.setVisible(true);
				/*
				ResultadosUser UserResult = new ResultadosUser();
				UserResult.setVisible(true);
				*/
			}
		};
		buttonSalir.addActionListener(listener1);
	}
}
