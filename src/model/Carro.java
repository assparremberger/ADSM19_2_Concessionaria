package model;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {

	public int portas;
	
	public Carro() {
		super();
	}
	public Carro(String _modelo) {
		super( _modelo );
	}
	
	@Override
	public void cadastrar() {
		JOptionPane.showMessageDialog(null,
				"Carro " + this.modelo + 
				" com " + this.portas + 
				" portas, cadastrado com sucesso!");
	}
	
	
}





