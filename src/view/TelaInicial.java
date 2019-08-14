package view;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Caminhao;
import model.Carro;
import model.Motocicleta;
import model.Veiculo;

public class TelaInicial {

	public static void main(String[] args) {
		String texto = " 1 - Cadastrar Veículo \n"
				     + " 2 - Cadastrar Motocicleta \n"
				     + " 3 - Cadastrar Carro \n"
					 + " 4 - Cadastrar Caminhão \n";
		
		int opcao = Integer.valueOf( JOptionPane.showInputDialog( texto ) );
		
		switch ( opcao ) {
		case 1:
			Veiculo v = new Veiculo();
			v.modelo = JOptionPane.showInputDialog("Digite o Modelo: ");
			v.cadastrar();
			break;
		case 2:
			Motocicleta m = new Motocicleta();
			m.modelo = JOptionPane.showInputDialog("Digite o Modelo: ");
			m.cadastrar();
			break;
		case 3:
			Carro c = new Carro();
			c.modelo = JOptionPane.showInputDialog("Digite o Modelo: ");
			String sPortas = JOptionPane.showInputDialog("Quantidade de Portas: ");
			c.portas = Integer.valueOf( sPortas );
			c.cadastrar();
			break;
		case 4:
			Caminhao b = new Caminhao();
			b.modelo = JOptionPane.showInputDialog("Digite o Modelo: ");
			b.eixos = Integer.valueOf(
					JOptionPane.showInputDialog("Quantos eixos? ") );
			b.cadastrar();
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			break;
		}

	}

}
