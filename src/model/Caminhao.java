package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
	public int eixos;
	public double carga;
	
	public Caminhao() {
		super();
	}
	public Caminhao(String modelo) {
		super( modelo );
	}
	
	@Override
	public void cadastrar() {
		JOptionPane.showMessageDialog(null,
				"Caminhão " + this.modelo + 
				" com " + this.eixos + 
				" eixos cadastrado com sucesso!");
	}
}
