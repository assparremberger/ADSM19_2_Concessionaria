package model;

import javax.swing.JOptionPane;

public class Motocicleta extends Veiculo {
	
	public int cilindradas;
	public boolean partidaEletrica;
	
	public Motocicleta() {
		
	}
	
	public Motocicleta(String modelo, int cilindradas) {
		super(modelo);
		this.cilindradas = cilindradas;
		JOptionPane.showMessageDialog(null,
				"Motocicleta " + this.modelo + 
				" com " + this.cilindradas + 
				"construída com sucesso!");
	}
	
	
	public void ligar() {
		this.id = 1;
	}
	
}
