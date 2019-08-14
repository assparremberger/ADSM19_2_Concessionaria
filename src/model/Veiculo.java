package model;

import javax.swing.JOptionPane;

public class Veiculo {
	
	public int id, rodas, passageiros;
	public String cor, modelo;
	private String placa;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String modelo) {
		this.modelo = modelo;
	}

	public Veiculo(int id, int rodas, int passageiros, String cor, String modelo) {
		this.id = id;
		this.rodas = rodas;
		this.passageiros = passageiros;
		this.cor = cor;
		this.modelo = modelo;
		
	}
	
	public void cadastrar() {
		JOptionPane.showMessageDialog(null,
				"Veículo " + this.modelo + 
				" cadastrado com sucesso!");
	}
	
	
	
}
