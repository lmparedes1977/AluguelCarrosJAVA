package model;

public class Vendedor extends Pessoa{
	
	private double salario;
	private double comicao;
	
	public Vendedor(String nome, String cpf, String senha, String endereco, double salario) {
		super(nome, cpf, senha, endereco);
		this.salario = salario;
	}		
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComicao() {
		return comicao;
	}
	public void setComicao(double comicao) {
		this.comicao = comicao;
	}

}
