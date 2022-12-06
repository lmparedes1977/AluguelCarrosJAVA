package model;

import java.util.List;

import model.Cliente.TipoPessoa;

public class Cliente extends Pessoa{

public enum TipoPessoa { PF, PJ; }
	
	private TipoPessoa tipo;
	
	List<Veiculo> veiculosAlugados;
	
	public Cliente(String nome, String cpf, String senha, String endereco, TipoPessoa tipo) {
		super(nome, cpf, senha, endereco);
		this.tipo = tipo;
	}
	
	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	public List<Veiculo> getVeiculosAlugados() {
		return veiculosAlugados;
	}

	public void setVeiculosAlugados(List<Veiculo> veiculosAlugados) {
		this.veiculosAlugados = veiculosAlugados;
	}
	
	
}
